package br.com.aws.dynamodb.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class InventarioResponse {

    @JsonProperty(value = "inventoryId")
    @NotNull(message ="O campo id deve ser preenchido.")
    private Integer inventoryId;
    @JsonProperty(value = "filmId")
    private Long filmId;
    @JsonProperty(value = "storeId")
    private Long storeId;

}
