package com.example.demo.gen.rest.api.model;

import java.net.URI;
import java.util.Objects;
import com.example.demo.gen.rest.api.model.SzczegolyBleduLista;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * OdpowiedziResponseOdrzuconeRekordySzczegoly
 */

@JsonTypeName("OdpowiedziResponse_odrzuconeRekordySzczegoly")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.16.0")
public class OdpowiedziResponseOdrzuconeRekordySzczegoly {

  private @Nullable Integer idNiezgodnosci;

  @Valid
  private List<@Valid SzczegolyBleduLista> szczegolyBleduLista = new ArrayList<>();

  public OdpowiedziResponseOdrzuconeRekordySzczegoly idNiezgodnosci(@Nullable Integer idNiezgodnosci) {
    this.idNiezgodnosci = idNiezgodnosci;
    return this;
  }

  /**
   * Identyfikator niezgodnosci  
   * @return idNiezgodnosci
   */
  
  @Schema(name = "idNiezgodnosci", description = "Identyfikator niezgodnosci  ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idNiezgodnosci")
  public @Nullable Integer getIdNiezgodnosci() {
    return idNiezgodnosci;
  }

  public void setIdNiezgodnosci(@Nullable Integer idNiezgodnosci) {
    this.idNiezgodnosci = idNiezgodnosci;
  }

  public OdpowiedziResponseOdrzuconeRekordySzczegoly szczegolyBleduLista(List<@Valid SzczegolyBleduLista> szczegolyBleduLista) {
    this.szczegolyBleduLista = szczegolyBleduLista;
    return this;
  }

  public OdpowiedziResponseOdrzuconeRekordySzczegoly addSzczegolyBleduListaItem(SzczegolyBleduLista szczegolyBleduListaItem) {
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
    OdpowiedziResponseOdrzuconeRekordySzczegoly odpowiedziResponseOdrzuconeRekordySzczegoly = (OdpowiedziResponseOdrzuconeRekordySzczegoly) o;
    return Objects.equals(this.idNiezgodnosci, odpowiedziResponseOdrzuconeRekordySzczegoly.idNiezgodnosci) &&
        Objects.equals(this.szczegolyBleduLista, odpowiedziResponseOdrzuconeRekordySzczegoly.szczegolyBleduLista);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idNiezgodnosci, szczegolyBleduLista);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OdpowiedziResponseOdrzuconeRekordySzczegoly {\n");
    sb.append("    idNiezgodnosci: ").append(toIndentedString(idNiezgodnosci)).append("\n");
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

