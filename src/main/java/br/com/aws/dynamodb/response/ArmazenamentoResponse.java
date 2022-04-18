package br.com.aws.dynamodb.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
public class ArmazenamentoResponse {
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
