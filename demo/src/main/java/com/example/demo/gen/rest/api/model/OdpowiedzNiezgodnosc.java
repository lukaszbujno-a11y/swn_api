package com.example.demo.gen.rest.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OdpowiedzNiezgodnosc
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.16.0")
public class OdpowiedzNiezgodnosc {

  private Integer idNiezgodnosci;

  /**
   * Flaga określająca czy dany rekord reprezentuje ostatnią udzieloną odpowiedź na wykrytą niezgodność: 0 – zakład udzielił świeższej odpowiedzi 1 – odpowiedź jest ostatnią udzieloną na daną niezgodność 
   */
  public enum OstatniEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private final Integer value;

    OstatniEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OstatniEnum fromValue(Integer value) {
      for (OstatniEnum b : OstatniEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OstatniEnum ostatni;

  private String login;

  /**
   * Odpowiedź na niezgodność: B - \"Brak niezgodności\",  I - \"Ignoruj\",  W - \"Wstrzymaj\" 
   */
  public enum OdpowiedzEnum {
    B("B"),
    
    I("I"),
    
    W("W");

    private final String value;

    OdpowiedzEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OdpowiedzEnum fromValue(String value) {
      for (OdpowiedzEnum b : OdpowiedzEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OdpowiedzEnum odpowiedz;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataOdpowiedzi;

  private @Nullable BigDecimal zawieszenieOdpowiedzi;

  public OdpowiedzNiezgodnosc() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OdpowiedzNiezgodnosc(Integer idNiezgodnosci, OstatniEnum ostatni, String login, OdpowiedzEnum odpowiedz, LocalDate dataOdpowiedzi) {
    this.idNiezgodnosci = idNiezgodnosci;
    this.ostatni = ostatni;
    this.login = login;
    this.odpowiedz = odpowiedz;
    this.dataOdpowiedzi = dataOdpowiedzi;
  }

  public OdpowiedzNiezgodnosc idNiezgodnosci(Integer idNiezgodnosci) {
    this.idNiezgodnosci = idNiezgodnosci;
    return this;
  }

  /**
   * Identyfikator niezgodnosci  
   * @return idNiezgodnosci
   */
  @NotNull 
  @Schema(name = "idNiezgodnosci", description = "Identyfikator niezgodnosci  ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("idNiezgodnosci")
  public Integer getIdNiezgodnosci() {
    return idNiezgodnosci;
  }

  public void setIdNiezgodnosci(Integer idNiezgodnosci) {
    this.idNiezgodnosci = idNiezgodnosci;
  }

  public OdpowiedzNiezgodnosc ostatni(OstatniEnum ostatni) {
    this.ostatni = ostatni;
    return this;
  }

  /**
   * Flaga określająca czy dany rekord reprezentuje ostatnią udzieloną odpowiedź na wykrytą niezgodność: 0 – zakład udzielił świeższej odpowiedzi 1 – odpowiedź jest ostatnią udzieloną na daną niezgodność 
   * @return ostatni
   */
  @NotNull 
  @Schema(name = "ostatni", description = "Flaga określająca czy dany rekord reprezentuje ostatnią udzieloną odpowiedź na wykrytą niezgodność: 0 – zakład udzielił świeższej odpowiedzi 1 – odpowiedź jest ostatnią udzieloną na daną niezgodność ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ostatni")
  public OstatniEnum getOstatni() {
    return ostatni;
  }

  public void setOstatni(OstatniEnum ostatni) {
    this.ostatni = ostatni;
  }

  public OdpowiedzNiezgodnosc login(String login) {
    this.login = login;
    return this;
  }

  /**
   * Login użytkownika udzielającego odpowiedzi
   * @return login
   */
  @NotNull @Size(max = 80) 
  @Schema(name = "login", description = "Login użytkownika udzielającego odpowiedzi", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public OdpowiedzNiezgodnosc odpowiedz(OdpowiedzEnum odpowiedz) {
    this.odpowiedz = odpowiedz;
    return this;
  }

  /**
   * Odpowiedź na niezgodność: B - \"Brak niezgodności\",  I - \"Ignoruj\",  W - \"Wstrzymaj\" 
   * @return odpowiedz
   */
  @NotNull @Size(max = 1) 
  @Schema(name = "odpowiedz", description = "Odpowiedź na niezgodność: B - \"Brak niezgodności\",  I - \"Ignoruj\",  W - \"Wstrzymaj\" ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("odpowiedz")
  public OdpowiedzEnum getOdpowiedz() {
    return odpowiedz;
  }

  public void setOdpowiedz(OdpowiedzEnum odpowiedz) {
    this.odpowiedz = odpowiedz;
  }

  public OdpowiedzNiezgodnosc dataOdpowiedzi(LocalDate dataOdpowiedzi) {
    this.dataOdpowiedzi = dataOdpowiedzi;
    return this;
  }

  /**
   * Data udzielenia odpowiedzi
   * @return dataOdpowiedzi
   */
  @NotNull @Valid 
  @Schema(name = "dataOdpowiedzi", description = "Data udzielenia odpowiedzi", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dataOdpowiedzi")
  public LocalDate getDataOdpowiedzi() {
    return dataOdpowiedzi;
  }

  public void setDataOdpowiedzi(LocalDate dataOdpowiedzi) {
    this.dataOdpowiedzi = dataOdpowiedzi;
  }

  public OdpowiedzNiezgodnosc zawieszenieOdpowiedzi(@Nullable BigDecimal zawieszenieOdpowiedzi) {
    this.zawieszenieOdpowiedzi = zawieszenieOdpowiedzi;
    return this;
  }

  /**
   * Liczba miesiecy zawieszenia odpowiedzi w przypadku odpowiedzi \"W\"
   * @return zawieszenieOdpowiedzi
   */
  @Valid 
  @Schema(name = "zawieszenieOdpowiedzi", description = "Liczba miesiecy zawieszenia odpowiedzi w przypadku odpowiedzi \"W\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("zawieszenieOdpowiedzi")
  public @Nullable BigDecimal getZawieszenieOdpowiedzi() {
    return zawieszenieOdpowiedzi;
  }

  public void setZawieszenieOdpowiedzi(@Nullable BigDecimal zawieszenieOdpowiedzi) {
    this.zawieszenieOdpowiedzi = zawieszenieOdpowiedzi;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OdpowiedzNiezgodnosc odpowiedzNiezgodnosc = (OdpowiedzNiezgodnosc) o;
    return Objects.equals(this.idNiezgodnosci, odpowiedzNiezgodnosc.idNiezgodnosci) &&
        Objects.equals(this.ostatni, odpowiedzNiezgodnosc.ostatni) &&
        Objects.equals(this.login, odpowiedzNiezgodnosc.login) &&
        Objects.equals(this.odpowiedz, odpowiedzNiezgodnosc.odpowiedz) &&
        Objects.equals(this.dataOdpowiedzi, odpowiedzNiezgodnosc.dataOdpowiedzi) &&
        Objects.equals(this.zawieszenieOdpowiedzi, odpowiedzNiezgodnosc.zawieszenieOdpowiedzi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idNiezgodnosci, ostatni, login, odpowiedz, dataOdpowiedzi, zawieszenieOdpowiedzi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OdpowiedzNiezgodnosc {\n");
    sb.append("    idNiezgodnosci: ").append(toIndentedString(idNiezgodnosci)).append("\n");
    sb.append("    ostatni: ").append(toIndentedString(ostatni)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    odpowiedz: ").append(toIndentedString(odpowiedz)).append("\n");
    sb.append("    dataOdpowiedzi: ").append(toIndentedString(dataOdpowiedzi)).append("\n");
    sb.append("    zawieszenieOdpowiedzi: ").append(toIndentedString(zawieszenieOdpowiedzi)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

