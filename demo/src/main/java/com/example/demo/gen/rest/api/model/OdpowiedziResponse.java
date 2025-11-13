package com.example.demo.gen.rest.api.model;

import java.net.URI;
import java.util.Objects;
import com.example.demo.gen.rest.api.model.OdpowiedziResponseOdrzuconeRekordySzczegoly;
import com.example.demo.gen.rest.api.model.Sukces;
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
 * OdpowiedziResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.16.0")
public class OdpowiedziResponse {

  private Sukces sukces;

  private @Nullable Boolean czesciowySukces;

  private @Nullable Integer zapisaneRekordy;

  private @Nullable Integer odrzuconeRekordy;

  private @Nullable OdpowiedziResponseOdrzuconeRekordySzczegoly odrzuconeRekordySzczegoly;

  public OdpowiedziResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OdpowiedziResponse(Sukces sukces) {
    this.sukces = sukces;
  }

  public OdpowiedziResponse sukces(Sukces sukces) {
    this.sukces = sukces;
    return this;
  }

  /**
   * Get sukces
   * @return sukces
   */
  @NotNull @Valid 
  @Schema(name = "sukces", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sukces")
  public Sukces getSukces() {
    return sukces;
  }

  public void setSukces(Sukces sukces) {
    this.sukces = sukces;
  }

  public OdpowiedziResponse czesciowySukces(@Nullable Boolean czesciowySukces) {
    this.czesciowySukces = czesciowySukces;
    return this;
  }

  /**
   * Flaga informująca czy wystąpiły błędy biznesowe podczas dodawania odpowiedzi
   * @return czesciowySukces
   */
  
  @Schema(name = "czesciowySukces", description = "Flaga informująca czy wystąpiły błędy biznesowe podczas dodawania odpowiedzi", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("czesciowySukces")
  public @Nullable Boolean getCzesciowySukces() {
    return czesciowySukces;
  }

  public void setCzesciowySukces(@Nullable Boolean czesciowySukces) {
    this.czesciowySukces = czesciowySukces;
  }

  public OdpowiedziResponse zapisaneRekordy(@Nullable Integer zapisaneRekordy) {
    this.zapisaneRekordy = zapisaneRekordy;
    return this;
  }

  /**
   * Liczba rekordów poprawnie zapisanych
   * @return zapisaneRekordy
   */
  
  @Schema(name = "zapisaneRekordy", description = "Liczba rekordów poprawnie zapisanych", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("zapisaneRekordy")
  public @Nullable Integer getZapisaneRekordy() {
    return zapisaneRekordy;
  }

  public void setZapisaneRekordy(@Nullable Integer zapisaneRekordy) {
    this.zapisaneRekordy = zapisaneRekordy;
  }

  public OdpowiedziResponse odrzuconeRekordy(@Nullable Integer odrzuconeRekordy) {
    this.odrzuconeRekordy = odrzuconeRekordy;
    return this;
  }

  /**
   * Liczba rekordów odrzuconych
   * @return odrzuconeRekordy
   */
  
  @Schema(name = "odrzuconeRekordy", description = "Liczba rekordów odrzuconych", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("odrzuconeRekordy")
  public @Nullable Integer getOdrzuconeRekordy() {
    return odrzuconeRekordy;
  }

  public void setOdrzuconeRekordy(@Nullable Integer odrzuconeRekordy) {
    this.odrzuconeRekordy = odrzuconeRekordy;
  }

  public OdpowiedziResponse odrzuconeRekordySzczegoly(@Nullable OdpowiedziResponseOdrzuconeRekordySzczegoly odrzuconeRekordySzczegoly) {
    this.odrzuconeRekordySzczegoly = odrzuconeRekordySzczegoly;
    return this;
  }

  /**
   * Get odrzuconeRekordySzczegoly
   * @return odrzuconeRekordySzczegoly
   */
  @Valid 
  @Schema(name = "odrzuconeRekordySzczegoly", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("odrzuconeRekordySzczegoly")
  public @Nullable OdpowiedziResponseOdrzuconeRekordySzczegoly getOdrzuconeRekordySzczegoly() {
    return odrzuconeRekordySzczegoly;
  }

  public void setOdrzuconeRekordySzczegoly(@Nullable OdpowiedziResponseOdrzuconeRekordySzczegoly odrzuconeRekordySzczegoly) {
    this.odrzuconeRekordySzczegoly = odrzuconeRekordySzczegoly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OdpowiedziResponse odpowiedziResponse = (OdpowiedziResponse) o;
    return Objects.equals(this.sukces, odpowiedziResponse.sukces) &&
        Objects.equals(this.czesciowySukces, odpowiedziResponse.czesciowySukces) &&
        Objects.equals(this.zapisaneRekordy, odpowiedziResponse.zapisaneRekordy) &&
        Objects.equals(this.odrzuconeRekordy, odpowiedziResponse.odrzuconeRekordy) &&
        Objects.equals(this.odrzuconeRekordySzczegoly, odpowiedziResponse.odrzuconeRekordySzczegoly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sukces, czesciowySukces, zapisaneRekordy, odrzuconeRekordy, odrzuconeRekordySzczegoly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OdpowiedziResponse {\n");
    sb.append("    sukces: ").append(toIndentedString(sukces)).append("\n");
    sb.append("    czesciowySukces: ").append(toIndentedString(czesciowySukces)).append("\n");
    sb.append("    zapisaneRekordy: ").append(toIndentedString(zapisaneRekordy)).append("\n");
    sb.append("    odrzuconeRekordy: ").append(toIndentedString(odrzuconeRekordy)).append("\n");
    sb.append("    odrzuconeRekordySzczegoly: ").append(toIndentedString(odrzuconeRekordySzczegoly)).append("\n");
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

