package com.example.demo.common.sas_common.transform;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Utils for transforming between java types
 */
public class TransformUtils {
    //assuming DatatypeFactory is thread safe
    private static DatatypeFactory datatypeFactory;

    static {
        try {
            datatypeFactory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
    /**
     * Transform Exception to String stacktrace
     *
     * @param throwable Exception
     * @return Stacktrace as String
     */
    public static String throwableToString(Throwable throwable) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        throwable.printStackTrace(pw);
        return sw.toString();
    }

    public static java.sql.Timestamp getSqlDateFromInstant(Instant instant) {
        return Timestamp.from(instant);
    }

    public static java.sql.Date getSqlDateFromDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }

    public static java.sql.Date getSqlDateFromXmlCalendar(XMLGregorianCalendar calendar) {
        return new java.sql.Date(calendar.toGregorianCalendar().getTime().getTime());
    }

    /**
     * Concatenates multiple strings with a specified separator between them.
     * If a string is null, it is skipped. If a separator is null, the default separator (".") will be used.
     *
     * @param separator The separator to use between the strings. If null, the default separator "." is used.
     * @param strings   A variable number of string arguments to concatenate.
     * @return A single string consisting of all non-null strings concatenated, with the separator between them.
     */
    public static String concatStringsWithSeparator(String separator, String... strings) {
        // If the separator is null, use "." as the default separator
        if (separator == null) {
            separator = ".";
        }

        StringBuilder result = new StringBuilder();

        // Iterate over each string and append to the result if it's not null
        for (String str : strings) {
            if (str != null) {
                result.append(str).append(separator);
            }
        }

        // Remove the last separator if the result is not empty
        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1);
        }

        return result.toString();
    }

    public static XMLGregorianCalendar getXmlGregorianTimeFromDate(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
    }

    public static String getInstantToString(Instant instant){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
                .withZone(ZoneId.systemDefault());
        return formatter.format(instant);
    }

    public static Instant getStringToInstant(String s){
        String pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS][.SS][.S]XXX";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime localDateTime = LocalDateTime.parse(s, dateTimeFormatter);
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
        return zonedDateTime.toInstant();
    }

    public static XMLGregorianCalendar getXmlGregorianTime(){
        XMLGregorianCalendar xmlGregorianCalendar = null;
        java.util.Date date = new Date(Instant.now().toEpochMilli());
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        xmlGregorianCalendar = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);


        return xmlGregorianCalendar;
    }

    public static XMLGregorianCalendar getXmlGregorianTimeFromString(String dateString) {
        XMLGregorianCalendar xmlGregorianCalendar = null;

        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss[.SSS][.SS][.S]XXX");
        Instant is = Instant.from(sdf.parse(dateString));
        java.util.Date date = new Date(is.toEpochMilli());
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        xmlGregorianCalendar = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);


        return xmlGregorianCalendar;
    }

    public static String getCurrentDateTimeString () {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        return df.format(date);
    }

    public static String getDateToString (Date d) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        return df.format(d);
    }

    public static Date getCurrentDateFromString(String s){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        try {
            return df.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static Transformer getTransformer(boolean prettyPrint, String[] cdataElems) throws TransformerConfigurationException {
        return getTransformer(prettyPrint, false, cdataElems);
    }

    public static Transformer getTransformer(boolean prettyPrint, boolean omitXmlDeclaration, String[] cdataElems) throws TransformerConfigurationException {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer t = tf.newTransformer();

        t.setOutputProperty(OutputKeys.METHOD, "xml");
        t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, omitXmlDeclaration ? "yes" : "no");
        t.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

        if (prettyPrint) {
            t.setOutputProperty(OutputKeys.INDENT, "yes");
            t.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4"); // 4 spacje
            t.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, "yes"); // aby byl znak nowej linii po xml declaration
        }

        String cdata = String.join(" ", cdataElems);
        t.setOutputProperty(OutputKeys.CDATA_SECTION_ELEMENTS, cdata); // space separated

        return t;
    }
    public static Transformer getTransformer(boolean prettyPrint, boolean omitXmlDeclaration) throws TransformerConfigurationException {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer t = tf.newTransformer();

        t.setOutputProperty(OutputKeys.METHOD, "xml");
        t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, omitXmlDeclaration ? "yes" : "no");
        t.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

        if (prettyPrint) {
            t.setOutputProperty(OutputKeys.INDENT, "yes");
            t.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4"); // 4 spacje
            t.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, "yes"); // aby byl znak nowej linii po xml declaration
        }
        return t;
    }

    public static String prettyPrint(String xmlInput) throws TransformerException, TransformerConfigurationException {
        Transformer t = getTransformer(true,false);

        Source xmlInputSource = new StreamSource(new StringReader(xmlInput));
        StringWriter writer = new StringWriter();
        Result xmlOutput = new StreamResult(writer);
        t.transform(xmlInputSource, xmlOutput);

        return writer.toString();
    }
    public static String getStackTrace(Exception e) {
        StringWriter st = new StringWriter();
        e.printStackTrace(new PrintWriter(st));
        return st.toString();
    }

}
