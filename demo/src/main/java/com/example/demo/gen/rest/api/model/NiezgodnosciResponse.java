package com.example.demo.gen.rest.api.model;

import java.net.URI;
import java.util.Objects;
import com.example.demo.gen.rest.api.model.Niezgodnosc;
import com.example.demo.gen.rest.api.model.Sukces;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * NiezgodnosciResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.16.0")
public class NiezgodnosciResponse {

  private Sukces sukces;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dataKoncaSkladaniaOdpowiedzi;

  private Integer ileMiesiecyWstrzymanaOdpowiedz;

  @Valid
  private List<@Valid Niezgodnosc> niezgodnosci = new ArrayList<>();

  public NiezgodnosciResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NiezgodnosciResponse(Sukces sukces, LocalDate dataKoncaSkladaniaOdpowiedzi, Integer ileMiesiecyWstrzymanaOdpowiedz) {
    this.sukces = sukces;
    this.dataKoncaSkladaniaOdpowiedzi = dataKoncaSkladaniaOdpowiedzi;
    this.ileMiesiecyWstrzymanaOdpowiedz = ileMiesiecyWstrzymanaOdpowiedz;
  }

  public NiezgodnosciResponse sukces(Sukces sukces) {
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

  public NiezgodnosciResponse dataKoncaSkladaniaOdpowiedzi(LocalDate dataKoncaSkladaniaOdpowiedzi) {
    this.dataKoncaSkladaniaOdpowiedzi = dataKoncaSkladaniaOdpowiedzi;
    return this;
  }

  /**
   * Data końca składania odpowiedzi
   * @return dataKoncaSkladaniaOdpowiedzi
   */
  @NotNull @Valid 
  @Schema(name = "dataKoncaSkladaniaOdpowiedzi", description = "Data końca składania odpowiedzi", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dataKoncaSkladaniaOdpowiedzi")
  public LocalDate getDataKoncaSkladaniaOdpowiedzi() {
    return dataKoncaSkladaniaOdpowiedzi;
  }

  public void setDataKoncaSkladaniaOdpowiedzi(LocalDate dataKoncaSkladaniaOdpowiedzi) {
    this.dataKoncaSkladaniaOdpowiedzi = dataKoncaSkladaniaOdpowiedzi;
  }

  public NiezgodnosciResponse ileMiesiecyWstrzymanaOdpowiedz(Integer ileMiesiecyWstrzymanaOdpowiedz) {
    this.ileMiesiecyWstrzymanaOdpowiedz = ileMiesiecyWstrzymanaOdpowiedz;
    return this;
  }

  /**
   * Liczba miesiecy zawieszenia odpowiedzi w przypadku odpowiedzi \"W\" 
   * @return ileMiesiecyWstrzymanaOdpowiedz
   */
  @NotNull 
  @Schema(name = "ileMiesiecyWstrzymanaOdpowiedz", description = "Liczba miesiecy zawieszenia odpowiedzi w przypadku odpowiedzi \"W\" ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ileMiesiecyWstrzymanaOdpowiedz")
  public Integer getIleMiesiecyWstrzymanaOdpowiedz() {
    return ileMiesiecyWstrzymanaOdpowiedz;
  }

  public void setIleMiesiecyWstrzymanaOdpowiedz(Integer ileMiesiecyWstrzymanaOdpowiedz) {
    this.ileMiesiecyWstrzymanaOdpowiedz = ileMiesiecyWstrzymanaOdpowiedz;
  }

  public NiezgodnosciResponse niezgodnosci(List<@Valid Niezgodnosc> niezgodnosci) {
    this.niezgodnosci = niezgodnosci;
    return this;
  }

  public NiezgodnosciResponse addNiezgodnosciItem(Niezgodnosc niezgodnosciItem) {
    if (this.niezgodnosci == null) {
      this.niezgodnosci = new ArrayList<>();
    }
    this.niezgodnosci.add(niezgodnosciItem);
    return this;
  }

  /**
   * Get niezgodnosci
   * @return niezgodnosci
   */
  @Valid 
  @Schema(name = "niezgodnosci", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("niezgodnosci")
  public List<@Valid Niezgodnosc> getNiezgodnosci() {
    return niezgodnosci;
  }

  public void setNiezgodnosci(List<@Valid Niezgodnosc> niezgodnosci) {
    this.niezgodnosci = niezgodnosci;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NiezgodnosciResponse niezgodnosciResponse = (NiezgodnosciResponse) o;
    return Objects.equals(this.sukces, niezgodnosciResponse.sukces) &&
        Objects.equals(this.dataKoncaSkladaniaOdpowiedzi, niezgodnosciResponse.dataKoncaSkladaniaOdpowiedzi) &&
        Objects.equals(this.ileMiesiecyWstrzymanaOdpowiedz, niezgodnosciResponse.ileMiesiecyWstrzymanaOdpowiedz) &&
        Objects.equals(this.niezgodnosci, niezgodnosciResponse.niezgodnosci);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sukces, dataKoncaSkladaniaOdpowiedzi, ileMiesiecyWstrzymanaOdpowiedz, niezgodnosci);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NiezgodnosciResponse {\n");
    sb.append("    sukces: ").append(toIndentedString(sukces)).append("\n");
    sb.append("    dataKoncaSkladaniaOdpowiedzi: ").append(toIndentedString(dataKoncaSkladaniaOdpowiedzi)).append("\n");
    sb.append("    ileMiesiecyWstrzymanaOdpowiedz: ").append(toIndentedString(ileMiesiecyWstrzymanaOdpowiedz)).append("\n");
    sb.append("    niezgodnosci: ").append(toIndentedString(niezgodnosci)).append("\n");
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

