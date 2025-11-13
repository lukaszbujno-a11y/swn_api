package com.example.demo.gen.rest.api.model;

import java.net.URI;
import java.util.Objects;
import com.example.demo.gen.rest.api.model.SzczegolyBleduLista;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * ErrorMsg
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.16.0")
public class ErrorMsg {

  private @Nullable String title;

  private @Nullable String detail;

  @Valid
  private List<@Valid SzczegolyBleduLista> szczegolyBleduLista = new ArrayList<>();

  public ErrorMsg title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public ErrorMsg detail(@Nullable String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
   */
  
  @Schema(name = "detail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detail")
  public @Nullable String getDetail() {
    return detail;
  }

  public void setDetail(@Nullable String detail) {
    this.detail = detail;
  }

  public ErrorMsg szczegolyBleduLista(List<@Valid SzczegolyBleduLista> szczegolyBleduLista) {
    this.szczegolyBleduLista = szczegolyBleduLista;
    return this;
  }

  public ErrorMsg addSzczegolyBleduListaItem(SzczegolyBleduLista szczegolyBleduListaItem) {
    if (this.szczegolyBleduLista == null) {
      this.szczegolyBleduLista = new ArrayList<>();
    }
    this.szczegolyBleduLista.add(szczegolyBleduListaItem);
    return this;
  }

  /**
   * Get szczegolyBleduLista
   * @return szczegolyBleduLista
   */
  @Valid 
  @Schema(name = "szczegolyBleduLista", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("szczegolyBleduLista")
  public List<@Valid SzczegolyBleduLista> getSzczegolyBleduLista() {
    return szczegolyBleduLista;
  }

  public void setSzczegolyBleduLista(List<@Valid SzczegolyBleduLista> szczegolyBleduLista) {
    this.szczegolyBleduLista = szczegolyBleduLista;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorMsg errorMsg = (ErrorMsg) o;
    return Objects.equals(this.title, errorMsg.title) &&
        Objects.equals(this.detail, errorMsg.detail) &&
        Objects.equals(this.szczegolyBleduLista, errorMsg.szczegolyBleduLista);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, detail, szczegolyBleduLista);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorMsg {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    szczegolyBleduLista: ").append(toIndentedString(szczegolyBleduLista)).append("\n");
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

