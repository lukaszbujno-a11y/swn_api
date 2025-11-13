package com.example.demo.gen.rest.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Niezgodnosc
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.16.0")
public class Niezgodnosc {

  private Integer idNiezgodnosci;

  private String regula;

  private String regulaNumer;

  private String regulaNazwa;

  private String zakladUbezpieczen;

  private String obiekt;

  private @Nullable Integer polisaPakiet;

  private @Nullable String polisaTryb;

  private @Nullable Integer zdarzeniePakiet;

  private @Nullable String zdarzenieTryb;

  private @Nullable Integer odszkodowaniePakiet;

  private @Nullable String odszkodowanieTryb;

  private @Nullable String atrybutNazwa;

  private @Nullable String atrybutWartosc;

  private @Nullable String wartoscSugerowana;

  private @Nullable String polisaCzyFlowowa;

  private @Nullable String polisaNumer;

  private @Nullable String polisaRodzajPolisy;

  private @Nullable String zdarzenieIdentyfikatorSzkody;

  private @Nullable String zdarzenieTypPolisy;

  private @Nullable String zdarzenieTypSzkody;

  private @Nullable String odszkodowanieCzyWyplata;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate odszkodowanieData;

  private @Nullable String wnbNumerPolisy;

  private @Nullable String podmiotImie;

  private @Nullable String podmiotNazwisko;

  private @Nullable String podmiotNazwa;

  private @Nullable String podmiotPesel;

  private @Nullable String podmiotRegon;

  private @Nullable String pojazdVin;

  private @Nullable String pojazdNumerRejestracyjny;

  private @Nullable String pojazdRodzajPojazdu;

  public Niezgodnosc() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Niezgodnosc(Integer idNiezgodnosci, String regula, String regulaNumer, String regulaNazwa, String zakladUbezpieczen, String obiekt) {
    this.idNiezgodnosci = idNiezgodnosci;
    this.regula = regula;
    this.regulaNumer = regulaNumer;
    this.regulaNazwa = regulaNazwa;
    this.zakladUbezpieczen = zakladUbezpieczen;
    this.obiekt = obiekt;
  }

  public Niezgodnosc idNiezgodnosci(Integer idNiezgodnosci) {
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

  public Niezgodnosc regula(String regula) {
    this.regula = regula;
    return this;
  }

  /**
   * Get regula
   * @return regula
   */
  @NotNull @Size(max = 88) 
  @Schema(name = "regula", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("regula")
  public String getRegula() {
    return regula;
  }

  public void setRegula(String regula) {
    this.regula = regula;
  }

  public Niezgodnosc regulaNumer(String regulaNumer) {
    this.regulaNumer = regulaNumer;
    return this;
  }

  /**
   * Get regulaNumer
   * @return regulaNumer
   */
  @NotNull @Size(max = 5) 
  @Schema(name = "regulaNumer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("regulaNumer")
  public String getRegulaNumer() {
    return regulaNumer;
  }

  public void setRegulaNumer(String regulaNumer) {
    this.regulaNumer = regulaNumer;
  }

  public Niezgodnosc regulaNazwa(String regulaNazwa) {
    this.regulaNazwa = regulaNazwa;
    return this;
  }

  /**
   * Get regulaNazwa
   * @return regulaNazwa
   */
  @NotNull @Size(max = 80) 
  @Schema(name = "regulaNazwa", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("regulaNazwa")
  public String getRegulaNazwa() {
    return regulaNazwa;
  }

  public void setRegulaNazwa(String regulaNazwa) {
    this.regulaNazwa = regulaNazwa;
  }

  public Niezgodnosc zakladUbezpieczen(String zakladUbezpieczen) {
    this.zakladUbezpieczen = zakladUbezpieczen;
    return this;
  }

  /**
   * Get zakladUbezpieczen
   * @return zakladUbezpieczen
   */
  @NotNull @Size(max = 32) 
  @Schema(name = "zakladUbezpieczen", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("zakladUbezpieczen")
  public String getZakladUbezpieczen() {
    return zakladUbezpieczen;
  }

  public void setZakladUbezpieczen(String zakladUbezpieczen) {
    this.zakladUbezpieczen = zakladUbezpieczen;
  }

  public Niezgodnosc obiekt(String obiekt) {
    this.obiekt = obiekt;
    return this;
  }

  /**
   * Get obiekt
   * @return obiekt
   */
  @NotNull @Size(max = 1) 
  @Schema(name = "obiekt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("obiekt")
  public String getObiekt() {
    return obiekt;
  }

  public void setObiekt(String obiekt) {
    this.obiekt = obiekt;
  }

  public Niezgodnosc polisaPakiet(@Nullable Integer polisaPakiet) {
    this.polisaPakiet = polisaPakiet;
    return this;
  }

  /**
   * Get polisaPakiet
   * @return polisaPakiet
   */
  
  @Schema(name = "polisaPakiet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("polisaPakiet")
  public @Nullable Integer getPolisaPakiet() {
    return polisaPakiet;
  }

  public void setPolisaPakiet(@Nullable Integer polisaPakiet) {
    this.polisaPakiet = polisaPakiet;
  }

  public Niezgodnosc polisaTryb(@Nullable String polisaTryb) {
    this.polisaTryb = polisaTryb;
    return this;
  }

  /**
   * Get polisaTryb
   * @return polisaTryb
   */
  @Size(max = 1) 
  @Schema(name = "polisaTryb", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("polisaTryb")
  public @Nullable String getPolisaTryb() {
    return polisaTryb;
  }

  public void setPolisaTryb(@Nullable String polisaTryb) {
    this.polisaTryb = polisaTryb;
  }

  public Niezgodnosc zdarzeniePakiet(@Nullable Integer zdarzeniePakiet) {
    this.zdarzeniePakiet = zdarzeniePakiet;
    return this;
  }

  /**
   * Get zdarzeniePakiet
   * @return zdarzeniePakiet
   */
  
  @Schema(name = "zdarzeniePakiet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("zdarzeniePakiet")
  public @Nullable Integer getZdarzeniePakiet() {
    return zdarzeniePakiet;
  }

  public void setZdarzeniePakiet(@Nullable Integer zdarzeniePakiet) {
    this.zdarzeniePakiet = zdarzeniePakiet;
  }

  public Niezgodnosc zdarzenieTryb(@Nullable String zdarzenieTryb) {
    this.zdarzenieTryb = zdarzenieTryb;
    return this;
  }

  /**
   * Get zdarzenieTryb
   * @return zdarzenieTryb
   */
  @Size(max = 1) 
  @Schema(name = "zdarzenieTryb", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("zdarzenieTryb")
  public @Nullable String getZdarzenieTryb() {
    return zdarzenieTryb;
  }

  public void setZdarzenieTryb(@Nullable String zdarzenieTryb) {
    this.zdarzenieTryb = zdarzenieTryb;
  }

  public Niezgodnosc odszkodowaniePakiet(@Nullable Integer odszkodowaniePakiet) {
    this.odszkodowaniePakiet = odszkodowaniePakiet;
    return this;
  }

  /**
   * Get odszkodowaniePakiet
   * @return odszkodowaniePakiet
   */
  
  @Schema(name = "odszkodowaniePakiet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("odszkodowaniePakiet")
  public @Nullable Integer getOdszkodowaniePakiet() {
    return odszkodowaniePakiet;
  }

  public void setOdszkodowaniePakiet(@Nullable Integer odszkodowaniePakiet) {
    this.odszkodowaniePakiet = odszkodowaniePakiet;
  }

  public Niezgodnosc odszkodowanieTryb(@Nullable String odszkodowanieTryb) {
    this.odszkodowanieTryb = odszkodowanieTryb;
    return this;
  }

  /**
   * Get odszkodowanieTryb
   * @return odszkodowanieTryb
   */
  @Size(max = 1) 
  @Schema(name = "odszkodowanieTryb", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("odszkodowanieTryb")
  public @Nullable String getOdszkodowanieTryb() {
    return odszkodowanieTryb;
  }

  public void setOdszkodowanieTryb(@Nullable String odszkodowanieTryb) {
    this.odszkodowanieTryb = odszkodowanieTryb;
  }

  public Niezgodnosc atrybutNazwa(@Nullable String atrybutNazwa) {
    this.atrybutNazwa = atrybutNazwa;
    return this;
  }

  /**
   * Get atrybutNazwa
   * @return atrybutNazwa
   */
  @Size(max = 20) 
  @Schema(name = "atrybutNazwa", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("atrybutNazwa")
  public @Nullable String getAtrybutNazwa() {
    return atrybutNazwa;
  }

  public void setAtrybutNazwa(@Nullable String atrybutNazwa) {
    this.atrybutNazwa = atrybutNazwa;
  }

  public Niezgodnosc atrybutWartosc(@Nullable String atrybutWartosc) {
    this.atrybutWartosc = atrybutWartosc;
    return this;
  }

  /**
   * Get atrybutWartosc
   * @return atrybutWartosc
   */
  @Size(max = 100) 
  @Schema(name = "atrybutWartosc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("atrybutWartosc")
  public @Nullable String getAtrybutWartosc() {
    return atrybutWartosc;
  }

  public void setAtrybutWartosc(@Nullable String atrybutWartosc) {
    this.atrybutWartosc = atrybutWartosc;
  }

  public Niezgodnosc wartoscSugerowana(@Nullable String wartoscSugerowana) {
    this.wartoscSugerowana = wartoscSugerowana;
    return this;
  }

  /**
   * Get wartoscSugerowana
   * @return wartoscSugerowana
   */
  @Size(max = 100) 
  @Schema(name = "wartoscSugerowana", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wartoscSugerowana")
  public @Nullable String getWartoscSugerowana() {
    return wartoscSugerowana;
  }

  public void setWartoscSugerowana(@Nullable String wartoscSugerowana) {
    this.wartoscSugerowana = wartoscSugerowana;
  }

  public Niezgodnosc polisaCzyFlowowa(@Nullable String polisaCzyFlowowa) {
    this.polisaCzyFlowowa = polisaCzyFlowowa;
    return this;
  }

  /**
   * Get polisaCzyFlowowa
   * @return polisaCzyFlowowa
   */
  @Size(max = 1) 
  @Schema(name = "polisaCzyFlowowa", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("polisaCzyFlowowa")
  public @Nullable String getPolisaCzyFlowowa() {
    return polisaCzyFlowowa;
  }

  public void setPolisaCzyFlowowa(@Nullable String polisaCzyFlowowa) {
    this.polisaCzyFlowowa = polisaCzyFlowowa;
  }

  public Niezgodnosc polisaNumer(@Nullable String polisaNumer) {
    this.polisaNumer = polisaNumer;
    return this;
  }

  /**
   * Get polisaNumer
   * @return polisaNumer
   */
  @Size(max = 100) 
  @Schema(name = "polisaNumer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("polisaNumer")
  public @Nullable String getPolisaNumer() {
    return polisaNumer;
  }

  public void setPolisaNumer(@Nullable String polisaNumer) {
    this.polisaNumer = polisaNumer;
  }

  public Niezgodnosc polisaRodzajPolisy(@Nullable String polisaRodzajPolisy) {
    this.polisaRodzajPolisy = polisaRodzajPolisy;
    return this;
  }

  /**
   * Get polisaRodzajPolisy
   * @return polisaRodzajPolisy
   */
  @Size(max = 1) 
  @Schema(name = "polisaRodzajPolisy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("polisaRodzajPolisy")
  public @Nullable String getPolisaRodzajPolisy() {
    return polisaRodzajPolisy;
  }

  public void setPolisaRodzajPolisy(@Nullable String polisaRodzajPolisy) {
    this.polisaRodzajPolisy = polisaRodzajPolisy;
  }

  public Niezgodnosc zdarzenieIdentyfikatorSzkody(@Nullable String zdarzenieIdentyfikatorSzkody) {
    this.zdarzenieIdentyfikatorSzkody = zdarzenieIdentyfikatorSzkody;
    return this;
  }

  /**
   * Get zdarzenieIdentyfikatorSzkody
   * @return zdarzenieIdentyfikatorSzkody
   */
  @Size(max = 100) 
  @Schema(name = "zdarzenieIdentyfikatorSzkody", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("zdarzenieIdentyfikatorSzkody")
  public @Nullable String getZdarzenieIdentyfikatorSzkody() {
    return zdarzenieIdentyfikatorSzkody;
  }

  public void setZdarzenieIdentyfikatorSzkody(@Nullable String zdarzenieIdentyfikatorSzkody) {
    this.zdarzenieIdentyfikatorSzkody = zdarzenieIdentyfikatorSzkody;
  }

  public Niezgodnosc zdarzenieTypPolisy(@Nullable String zdarzenieTypPolisy) {
    this.zdarzenieTypPolisy = zdarzenieTypPolisy;
    return this;
  }

  /**
   * Get zdarzenieTypPolisy
   * @return zdarzenieTypPolisy
   */
  @Size(max = 2) 
  @Schema(name = "zdarzenieTypPolisy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("zdarzenieTypPolisy")
  public @Nullable String getZdarzenieTypPolisy() {
    return zdarzenieTypPolisy;
  }

  public void setZdarzenieTypPolisy(@Nullable String zdarzenieTypPolisy) {
    this.zdarzenieTypPolisy = zdarzenieTypPolisy;
  }

  public Niezgodnosc zdarzenieTypSzkody(@Nullable String zdarzenieTypSzkody) {
    this.zdarzenieTypSzkody = zdarzenieTypSzkody;
    return this;
  }

  /**
   * Get zdarzenieTypSzkody
   * @return zdarzenieTypSzkody
   */
  @Size(max = 1) 
  @Schema(name = "zdarzenieTypSzkody", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("zdarzenieTypSzkody")
  public @Nullable String getZdarzenieTypSzkody() {
    return zdarzenieTypSzkody;
  }

  public void setZdarzenieTypSzkody(@Nullable String zdarzenieTypSzkody) {
    this.zdarzenieTypSzkody = zdarzenieTypSzkody;
  }

  public Niezgodnosc odszkodowanieCzyWyplata(@Nullable String odszkodowanieCzyWyplata) {
    this.odszkodowanieCzyWyplata = odszkodowanieCzyWyplata;
    return this;
  }

  /**
   * Get odszkodowanieCzyWyplata
   * @return odszkodowanieCzyWyplata
   */
  @Size(max = 1) 
  @Schema(name = "odszkodowanieCzyWyplata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("odszkodowanieCzyWyplata")
  public @Nullable String getOdszkodowanieCzyWyplata() {
    return odszkodowanieCzyWyplata;
  }

  public void setOdszkodowanieCzyWyplata(@Nullable String odszkodowanieCzyWyplata) {
    this.odszkodowanieCzyWyplata = odszkodowanieCzyWyplata;
  }

  public Niezgodnosc odszkodowanieData(@Nullable LocalDate odszkodowanieData) {
    this.odszkodowanieData = odszkodowanieData;
    return this;
  }

  /**
   * Get odszkodowanieData
   * @return odszkodowanieData
   */
  @Valid 
  @Schema(name = "odszkodowanieData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("odszkodowanieData")
  public @Nullable LocalDate getOdszkodowanieData() {
    return odszkodowanieData;
  }

  public void setOdszkodowanieData(@Nullable LocalDate odszkodowanieData) {
    this.odszkodowanieData = odszkodowanieData;
  }

  public Niezgodnosc wnbNumerPolisy(@Nullable String wnbNumerPolisy) {
    this.wnbNumerPolisy = wnbNumerPolisy;
    return this;
  }

  /**
   * Get wnbNumerPolisy
   * @return wnbNumerPolisy
   */
  @Size(max = 100) 
  @Schema(name = "wnbNumerPolisy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wnbNumerPolisy")
  public @Nullable String getWnbNumerPolisy() {
    return wnbNumerPolisy;
  }

  public void setWnbNumerPolisy(@Nullable String wnbNumerPolisy) {
    this.wnbNumerPolisy = wnbNumerPolisy;
  }

  public Niezgodnosc podmiotImie(@Nullable String podmiotImie) {
    this.podmiotImie = podmiotImie;
    return this;
  }

  /**
   * Get podmiotImie
   * @return podmiotImie
   */
  @Size(max = 200) 
  @Schema(name = "podmiotImie", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("podmiotImie")
  public @Nullable String getPodmiotImie() {
    return podmiotImie;
  }

  public void setPodmiotImie(@Nullable String podmiotImie) {
    this.podmiotImie = podmiotImie;
  }

  public Niezgodnosc podmiotNazwisko(@Nullable String podmiotNazwisko) {
    this.podmiotNazwisko = podmiotNazwisko;
    return this;
  }

  /**
   * Get podmiotNazwisko
   * @return podmiotNazwisko
   */
  @Size(max = 200) 
  @Schema(name = "podmiotNazwisko", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("podmiotNazwisko")
  public @Nullable String getPodmiotNazwisko() {
    return podmiotNazwisko;
  }

  public void setPodmiotNazwisko(@Nullable String podmiotNazwisko) {
    this.podmiotNazwisko = podmiotNazwisko;
  }

  public Niezgodnosc podmiotNazwa(@Nullable String podmiotNazwa) {
    this.podmiotNazwa = podmiotNazwa;
    return this;
  }

  /**
   * Get podmiotNazwa
   * @return podmiotNazwa
   */
  @Size(max = 510) 
  @Schema(name = "podmiotNazwa", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("podmiotNazwa")
  public @Nullable String getPodmiotNazwa() {
    return podmiotNazwa;
  }

  public void setPodmiotNazwa(@Nullable String podmiotNazwa) {
    this.podmiotNazwa = podmiotNazwa;
  }

  public Niezgodnosc podmiotPesel(@Nullable String podmiotPesel) {
    this.podmiotPesel = podmiotPesel;
    return this;
  }

  /**
   * Get podmiotPesel
   * @return podmiotPesel
   */
  @Size(max = 26) 
  @Schema(name = "podmiotPesel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("podmiotPesel")
  public @Nullable String getPodmiotPesel() {
    return podmiotPesel;
  }

  public void setPodmiotPesel(@Nullable String podmiotPesel) {
    this.podmiotPesel = podmiotPesel;
  }

  public Niezgodnosc podmiotRegon(@Nullable String podmiotRegon) {
    this.podmiotRegon = podmiotRegon;
    return this;
  }

  /**
   * Get podmiotRegon
   * @return podmiotRegon
   */
  @Size(max = 32) 
  @Schema(name = "podmiotRegon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("podmiotRegon")
  public @Nullable String getPodmiotRegon() {
    return podmiotRegon;
  }

  public void setPodmiotRegon(@Nullable String podmiotRegon) {
    this.podmiotRegon = podmiotRegon;
  }

  public Niezgodnosc pojazdVin(@Nullable String pojazdVin) {
    this.pojazdVin = pojazdVin;
    return this;
  }

  /**
   * Get pojazdVin
   * @return pojazdVin
   */
  @Size(max = 100) 
  @Schema(name = "pojazdVin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pojazdVin")
  public @Nullable String getPojazdVin() {
    return pojazdVin;
  }

  public void setPojazdVin(@Nullable String pojazdVin) {
    this.pojazdVin = pojazdVin;
  }

  public Niezgodnosc pojazdNumerRejestracyjny(@Nullable String pojazdNumerRejestracyjny) {
    this.pojazdNumerRejestracyjny = pojazdNumerRejestracyjny;
    return this;
  }

  /**
   * Get pojazdNumerRejestracyjny
   * @return pojazdNumerRejestracyjny
   */
  @Size(max = 30) 
  @Schema(name = "pojazdNumerRejestracyjny", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pojazdNumerRejestracyjny")
  public @Nullable String getPojazdNumerRejestracyjny() {
    return pojazdNumerRejestracyjny;
  }

  public void setPojazdNumerRejestracyjny(@Nullable String pojazdNumerRejestracyjny) {
    this.pojazdNumerRejestracyjny = pojazdNumerRejestracyjny;
  }

  public Niezgodnosc pojazdRodzajPojazdu(@Nullable String pojazdRodzajPojazdu) {
    this.pojazdRodzajPojazdu = pojazdRodzajPojazdu;
    return this;
  }

  /**
   * Get pojazdRodzajPojazdu
   * @return pojazdRodzajPojazdu
   */
  @Size(max = 200) 
  @Schema(name = "pojazdRodzajPojazdu", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pojazdRodzajPojazdu")
  public @Nullable String getPojazdRodzajPojazdu() {
    return pojazdRodzajPojazdu;
  }

  public void setPojazdRodzajPojazdu(@Nullable String pojazdRodzajPojazdu) {
    this.pojazdRodzajPojazdu = pojazdRodzajPojazdu;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Niezgodnosc niezgodnosc = (Niezgodnosc) o;
    return Objects.equals(this.idNiezgodnosci, niezgodnosc.idNiezgodnosci) &&
        Objects.equals(this.regula, niezgodnosc.regula) &&
        Objects.equals(this.regulaNumer, niezgodnosc.regulaNumer) &&
        Objects.equals(this.regulaNazwa, niezgodnosc.regulaNazwa) &&
        Objects.equals(this.zakladUbezpieczen, niezgodnosc.zakladUbezpieczen) &&
        Objects.equals(this.obiekt, niezgodnosc.obiekt) &&
        Objects.equals(this.polisaPakiet, niezgodnosc.polisaPakiet) &&
        Objects.equals(this.polisaTryb, niezgodnosc.polisaTryb) &&
        Objects.equals(this.zdarzeniePakiet, niezgodnosc.zdarzeniePakiet) &&
        Objects.equals(this.zdarzenieTryb, niezgodnosc.zdarzenieTryb) &&
        Objects.equals(this.odszkodowaniePakiet, niezgodnosc.odszkodowaniePakiet) &&
        Objects.equals(this.odszkodowanieTryb, niezgodnosc.odszkodowanieTryb) &&
        Objects.equals(this.atrybutNazwa, niezgodnosc.atrybutNazwa) &&
        Objects.equals(this.atrybutWartosc, niezgodnosc.atrybutWartosc) &&
        Objects.equals(this.wartoscSugerowana, niezgodnosc.wartoscSugerowana) &&
        Objects.equals(this.polisaCzyFlowowa, niezgodnosc.polisaCzyFlowowa) &&
        Objects.equals(this.polisaNumer, niezgodnosc.polisaNumer) &&
        Objects.equals(this.polisaRodzajPolisy, niezgodnosc.polisaRodzajPolisy) &&
        Objects.equals(this.zdarzenieIdentyfikatorSzkody, niezgodnosc.zdarzenieIdentyfikatorSzkody) &&
        Objects.equals(this.zdarzenieTypPolisy, niezgodnosc.zdarzenieTypPolisy) &&
        Objects.equals(this.zdarzenieTypSzkody, niezgodnosc.zdarzenieTypSzkody) &&
        Objects.equals(this.odszkodowanieCzyWyplata, niezgodnosc.odszkodowanieCzyWyplata) &&
        Objects.equals(this.odszkodowanieData, niezgodnosc.odszkodowanieData) &&
        Objects.equals(this.wnbNumerPolisy, niezgodnosc.wnbNumerPolisy) &&
        Objects.equals(this.podmiotImie, niezgodnosc.podmiotImie) &&
        Objects.equals(this.podmiotNazwisko, niezgodnosc.podmiotNazwisko) &&
        Objects.equals(this.podmiotNazwa, niezgodnosc.podmiotNazwa) &&
        Objects.equals(this.podmiotPesel, niezgodnosc.podmiotPesel) &&
        Objects.equals(this.podmiotRegon, niezgodnosc.podmiotRegon) &&
        Objects.equals(this.pojazdVin, niezgodnosc.pojazdVin) &&
        Objects.equals(this.pojazdNumerRejestracyjny, niezgodnosc.pojazdNumerRejestracyjny) &&
        Objects.equals(this.pojazdRodzajPojazdu, niezgodnosc.pojazdRodzajPojazdu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idNiezgodnosci, regula, regulaNumer, regulaNazwa, zakladUbezpieczen, obiekt, polisaPakiet, polisaTryb, zdarzeniePakiet, zdarzenieTryb, odszkodowaniePakiet, odszkodowanieTryb, atrybutNazwa, atrybutWartosc, wartoscSugerowana, polisaCzyFlowowa, polisaNumer, polisaRodzajPolisy, zdarzenieIdentyfikatorSzkody, zdarzenieTypPolisy, zdarzenieTypSzkody, odszkodowanieCzyWyplata, odszkodowanieData, wnbNumerPolisy, podmiotImie, podmiotNazwisko, podmiotNazwa, podmiotPesel, podmiotRegon, pojazdVin, pojazdNumerRejestracyjny, pojazdRodzajPojazdu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Niezgodnosc {\n");
    sb.append("    idNiezgodnosci: ").append(toIndentedString(idNiezgodnosci)).append("\n");
    sb.append("    regula: ").append(toIndentedString(regula)).append("\n");
    sb.append("    regulaNumer: ").append(toIndentedString(regulaNumer)).append("\n");
    sb.append("    regulaNazwa: ").append(toIndentedString(regulaNazwa)).append("\n");
    sb.append("    zakladUbezpieczen: ").append(toIndentedString(zakladUbezpieczen)).append("\n");
    sb.append("    obiekt: ").append(toIndentedString(obiekt)).append("\n");
    sb.append("    polisaPakiet: ").append(toIndentedString(polisaPakiet)).append("\n");
    sb.append("    polisaTryb: ").append(toIndentedString(polisaTryb)).append("\n");
    sb.append("    zdarzeniePakiet: ").append(toIndentedString(zdarzeniePakiet)).append("\n");
    sb.append("    zdarzenieTryb: ").append(toIndentedString(zdarzenieTryb)).append("\n");
    sb.append("    odszkodowaniePakiet: ").append(toIndentedString(odszkodowaniePakiet)).append("\n");
    sb.append("    odszkodowanieTryb: ").append(toIndentedString(odszkodowanieTryb)).append("\n");
    sb.append("    atrybutNazwa: ").append(toIndentedString(atrybutNazwa)).append("\n");
    sb.append("    atrybutWartosc: ").append(toIndentedString(atrybutWartosc)).append("\n");
    sb.append("    wartoscSugerowana: ").append(toIndentedString(wartoscSugerowana)).append("\n");
    sb.append("    polisaCzyFlowowa: ").append(toIndentedString(polisaCzyFlowowa)).append("\n");
    sb.append("    polisaNumer: ").append(toIndentedString(polisaNumer)).append("\n");
    sb.append("    polisaRodzajPolisy: ").append(toIndentedString(polisaRodzajPolisy)).append("\n");
    sb.append("    zdarzenieIdentyfikatorSzkody: ").append(toIndentedString(zdarzenieIdentyfikatorSzkody)).append("\n");
    sb.append("    zdarzenieTypPolisy: ").append(toIndentedString(zdarzenieTypPolisy)).append("\n");
    sb.append("    zdarzenieTypSzkody: ").append(toIndentedString(zdarzenieTypSzkody)).append("\n");
    sb.append("    odszkodowanieCzyWyplata: ").append(toIndentedString(odszkodowanieCzyWyplata)).append("\n");
    sb.append("    odszkodowanieData: ").append(toIndentedString(odszkodowanieData)).append("\n");
    sb.append("    wnbNumerPolisy: ").append(toIndentedString(wnbNumerPolisy)).append("\n");
    sb.append("    podmiotImie: ").append(toIndentedString(podmiotImie)).append("\n");
    sb.append("    podmiotNazwisko: ").append(toIndentedString(podmiotNazwisko)).append("\n");
    sb.append("    podmiotNazwa: ").append(toIndentedString(podmiotNazwa)).append("\n");
    sb.append("    podmiotPesel: ").append(toIndentedString(podmiotPesel)).append("\n");
    sb.append("    podmiotRegon: ").append(toIndentedString(podmiotRegon)).append("\n");
    sb.append("    pojazdVin: ").append(toIndentedString(pojazdVin)).append("\n");
    sb.append("    pojazdNumerRejestracyjny: ").append(toIndentedString(pojazdNumerRejestracyjny)).append("\n");
    sb.append("    pojazdRodzajPojazdu: ").append(toIndentedString(pojazdRodzajPojazdu)).append("\n");
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

