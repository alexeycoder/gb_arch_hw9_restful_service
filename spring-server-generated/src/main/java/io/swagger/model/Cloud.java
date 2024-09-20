package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cloud
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-20T16:15:31.919070397Z[GMT]")


public class Cloud   {
  @JsonProperty("cloud_id")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private UUID cloudId = null;

  @JsonProperty("client_id")

  private UUID clientId = null;

  /**
   * Операционная система
   */
  public enum OsEnum {
    WINDOWS("windows"),
    
    LINUX("linux");

    private String value;

    OsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OsEnum fromValue(String text) {
      for (OsEnum b : OsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("os")

  private OsEnum os = null;

  @JsonProperty("ram")

  private Integer ram = null;

  @JsonProperty("cpu")

  private Integer cpu = null;

  @JsonProperty("hdd")

  private Integer hdd = null;


  public Cloud cloudId(UUID cloudId) { 

    this.cloudId = cloudId;
    return this;
  }

  /**
   * Get cloudId
   * @return cloudId
   **/
  
  @Schema(example = "c229ad20-048d-4f52-8d9d-2ebb7c645d8e", description = "")
  
@Valid
  public UUID getCloudId() {  
    return cloudId;
  }



  public void setCloudId(UUID cloudId) { 
    this.cloudId = cloudId;
  }

  public Cloud clientId(UUID clientId) { 

    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * @return clientId
   **/
  
  @Schema(example = "c229ad20-048d-4f52-8d9d-2ebb7c645d8e", required = true, description = "")
  
@Valid
  @NotNull
  public UUID getClientId() {  
    return clientId;
  }



  public void setClientId(UUID clientId) { 

    this.clientId = clientId;
  }

  public Cloud os(OsEnum os) { 

    this.os = os;
    return this;
  }

  /**
   * Операционная система
   * @return os
   **/
  
  @Schema(required = true, description = "Операционная система")
  
  @NotNull
  public OsEnum getOs() {  
    return os;
  }



  public void setOs(OsEnum os) { 

    this.os = os;
  }

  public Cloud ram(Integer ram) { 

    this.ram = ram;
    return this;
  }

  /**
   * Объём оперативной памяти, Мб
   * @return ram
   **/
  
  @Schema(example = "128", required = true, description = "Объём оперативной памяти, Мб")
  
  @NotNull
  public Integer getRam() {  
    return ram;
  }



  public void setRam(Integer ram) { 

    this.ram = ram;
  }

  public Cloud cpu(Integer cpu) { 

    this.cpu = cpu;
    return this;
  }

  /**
   * Количество CPU
   * @return cpu
   **/
  
  @Schema(example = "8", required = true, description = "Количество CPU")
  
  @NotNull
  public Integer getCpu() {  
    return cpu;
  }



  public void setCpu(Integer cpu) { 

    this.cpu = cpu;
  }

  public Cloud hdd(Integer hdd) { 

    this.hdd = hdd;
    return this;
  }

  /**
   * Объём дискового простанства, Мб
   * @return hdd
   **/
  
  @Schema(example = "10000", required = true, description = "Объём дискового простанства, Мб")
  
  @NotNull
  public Integer getHdd() {  
    return hdd;
  }



  public void setHdd(Integer hdd) { 

    this.hdd = hdd;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cloud cloud = (Cloud) o;
    return Objects.equals(this.cloudId, cloud.cloudId) &&
        Objects.equals(this.clientId, cloud.clientId) &&
        Objects.equals(this.os, cloud.os) &&
        Objects.equals(this.ram, cloud.ram) &&
        Objects.equals(this.cpu, cloud.cpu) &&
        Objects.equals(this.hdd, cloud.hdd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudId, clientId, os, ram, cpu, hdd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cloud {\n");
    
    sb.append("    cloudId: ").append(toIndentedString(cloudId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    hdd: ").append(toIndentedString(hdd)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
