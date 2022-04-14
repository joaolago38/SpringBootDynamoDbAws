package br.com.aws.dynamodb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class ArmazenamentoDto {

    @JsonProperty(value = "storeId")
    @NotNull(message ="O campo id deve ser preenchido.")
    private Long storeId;
    @JsonProperty(value = "managerStaffId")
    private Long managerStaffId;
    @JsonProperty(value = "addressId")
    private Long addressId;
    @JsonProperty(value = "lastUpdate")
    private Long lastUpdate;
}
