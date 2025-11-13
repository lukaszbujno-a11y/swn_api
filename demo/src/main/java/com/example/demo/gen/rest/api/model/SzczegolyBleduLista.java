package com.example.demo.gen.rest.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SzczegolyBleduLista
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.16.0")
public class SzczegolyBleduLista {

  private @Nullable String identyfikatorBledu;

  private @Nullable String opisBledu;

  private @Nullable String kodBledu;

  public SzczegolyBleduLista identyfikatorBledu(@Nullable String identyfikatorBledu) {
    this.identyfikatorBledu = identyfikatorBledu;
    return this;
  }

  /**
   * Get identyfikatorBledu
   * @return identyfikatorBledu
   */
  
  @Schema(name = "identyfikatorBledu", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("identyfikatorBledu")
  public @Nullable String getIdentyfikatorBledu() {
    return identyfikatorBledu;
  }

  public void setIdentyfikatorBledu(@Nullable String identyfikatorBledu) {
    this.identyfikatorBledu = identyfikatorBledu;
  }

  public SzczegolyBleduLista opisBledu(@Nullable String opisBledu) {
    this.opisBledu = opisBledu;
    return this;
  }

  /**
   * Get opisBledu
   * @return opisBledu
   */
  
  @Schema(name = "opisBledu", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("opisBledu")
  public @Nullable String getOpisBledu() {
    return opisBledu;
  }

  public void setOpisBledu(@Nullable String opisBledu) {
    this.opisBledu = opisBledu;
  }

  public SzczegolyBleduLista kodBledu(@Nullable String kodBledu) {
    this.kodBledu = kodBledu;
    return this;
  }

  /**
   * Get kodBledu
   * @return kodBledu
   */
  
  @Schema(name = "kodBledu", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kodBledu")
  public @Nullable String getKodBledu() {
    return kodBledu;
  }

  public void setKodBledu(@Nullable String kodBledu) {
    this.kodBledu = kodBledu;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SzczegolyBleduLista szczegolyBleduLista = (SzczegolyBleduLista) o;
    return Objects.equals(this.identyfikatorBledu, szczegolyBleduLista.identyfikatorBledu) &&
        Objects.equals(this.opisBledu, szczegolyBleduLista.opisBledu) &&
        Objects.equals(this.kodBledu, szczegolyBleduLista.kodBledu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identyfikatorBledu, opisBledu, kodBledu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SzczegolyBleduLista {\n");
    sb.append("    identyfikatorBledu: ").append(toIndentedString(identyfikatorBledu)).append("\n");
    sb.append("    opisBledu: ").append(toIndentedString(opisBledu)).append("\n");
    sb.append("    kodBledu: ").append(toIndentedString(kodBledu)).append("\n");
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

