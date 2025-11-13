package com.example.demo.gen.rest.api.model;

import java.net.URI;
import java.util.Objects;
import com.example.demo.gen.rest.api.model.NiezgodnoscKorekta;
import com.example.demo.gen.rest.api.model.Sukces;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NiezgodnosciKorektyResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.16.0")
public class NiezgodnosciKorektyResponse {

  private Sukces sukces;

  @Valid
  private List<@Valid NiezgodnoscKorekta> korekty = new ArrayList<>();

  public NiezgodnosciKorektyResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NiezgodnosciKorektyResponse(Sukces sukces, List<@Valid NiezgodnoscKorekta> korekty) {
    this.sukces = sukces;
    this.korekty = korekty;
  }

  public NiezgodnosciKorektyResponse sukces(Sukces sukces) {
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

  public NiezgodnosciKorektyResponse korekty(List<@Valid NiezgodnoscKorekta> korekty) {
    this.korekty = korekty;
    return this;
  }

  public NiezgodnosciKorektyResponse addKorektyItem(NiezgodnoscKorekta korektyItem) {
    if (this.korekty == null) {
      this.korekty = new ArrayList<>();
    }
    this.korekty.add(korektyItem);
    return this;
  }

  /**
   * Get korekty
   * @return korekty
   */
  @NotNull @Valid 
  @Schema(name = "korekty", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("korekty")
  public List<@Valid NiezgodnoscKorekta> getKorekty() {
    return korekty;
  }

  public void setKorekty(List<@Valid NiezgodnoscKorekta> korekty) {
    this.korekty = korekty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NiezgodnosciKorektyResponse niezgodnosciKorektyResponse = (NiezgodnosciKorektyResponse) o;
    return Objects.equals(this.sukces, niezgodnosciKorektyResponse.sukces) &&
        Objects.equals(this.korekty, niezgodnosciKorektyResponse.korekty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sukces, korekty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NiezgodnosciKorektyResponse {\n");
    sb.append("    sukces: ").append(toIndentedString(sukces)).append("\n");
    sb.append("    korekty: ").append(toIndentedString(korekty)).append("\n");
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

