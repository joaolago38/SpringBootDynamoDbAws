package br.com.aws.dynamodb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class InventoryDto {

    @JsonProperty(value = "inventoryId")
    @NotNull(message ="O campo id deve ser preenchido.")
    private Long inventoryId;
    @JsonProperty(value = "filmId")
    private Long filmId;
    @JsonProperty(value = "storeId")
    private Long storeId;
}
