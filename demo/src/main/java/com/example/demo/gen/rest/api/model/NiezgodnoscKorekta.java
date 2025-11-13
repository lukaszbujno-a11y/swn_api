package com.example.demo.gen.rest.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NiezgodnoscKorekta
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.16.0")
public class NiezgodnoscKorekta {

  private Integer idNiezgodnosci;

  /**
   * Czy rekord niezgodnosci został zaktualizowany przez zakład ubezpieczeń: T - \"TAK - rekord został zaktualizowany\",  N - \"NIE - rekord nie zosał zaktualizowany\" 
   */
  public enum CzyKorektaEnum {
    T("T"),
    
    N("N");

    private final String value;

    CzyKorektaEnum(String value) {
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
    public static CzyKorektaEnum fromValue(String value) {
      for (CzyKorektaEnum b : CzyKorektaEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CzyKorektaEnum czyKorekta;

  public NiezgodnoscKorekta() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NiezgodnoscKorekta(Integer idNiezgodnosci, CzyKorektaEnum czyKorekta) {
    this.idNiezgodnosci = idNiezgodnosci;
    this.czyKorekta = czyKorekta;
  }

  public NiezgodnoscKorekta idNiezgodnosci(Integer idNiezgodnosci) {
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

  public NiezgodnoscKorekta czyKorekta(CzyKorektaEnum czyKorekta) {
    this.czyKorekta = czyKorekta;
    return this;
  }

  /**
   * Czy rekord niezgodnosci został zaktualizowany przez zakład ubezpieczeń: T - \"TAK - rekord został zaktualizowany\",  N - \"NIE - rekord nie zosał zaktualizowany\" 
   * @return czyKorekta
   */
  @NotNull 
  @Schema(name = "czyKorekta", description = "Czy rekord niezgodnosci został zaktualizowany przez zakład ubezpieczeń: T - \"TAK - rekord został zaktualizowany\",  N - \"NIE - rekord nie zosał zaktualizowany\" ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("czyKorekta")
  public CzyKorektaEnum getCzyKorekta() {
    return czyKorekta;
  }

  public void setCzyKorekta(CzyKorektaEnum czyKorekta) {
    this.czyKorekta = czyKorekta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NiezgodnoscKorekta niezgodnoscKorekta = (NiezgodnoscKorekta) o;
    return Objects.equals(this.idNiezgodnosci, niezgodnoscKorekta.idNiezgodnosci) &&
        Objects.equals(this.czyKorekta, niezgodnoscKorekta.czyKorekta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idNiezgodnosci, czyKorekta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NiezgodnoscKorekta {\n");
    sb.append("    idNiezgodnosci: ").append(toIndentedString(idNiezgodnosci)).append("\n");
    sb.append("    czyKorekta: ").append(toIndentedString(czyKorekta)).append("\n");
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

