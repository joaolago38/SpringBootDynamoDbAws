package br.com.aws.dynamodb.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
public class ArmazenamentoResponse {
    @JsonProperty(value = "rental_id")
    @NotNull(message ="O campo id deve ser preenchido.")
    private Long rental_id;
    @JsonProperty(value = "rentalDate")
    private Date rentalDate;
    @JsonProperty(value = "returnDate")
    private Date returnDate;
    @JsonProperty(value = "customerId")
    private Long customerId;
    @JsonProperty(value = "staffId")
    private Long staffId;
    @JsonProperty(value = "inventoryId")
    private Long inventoryId;
    @JsonProperty(value = "lastUpdate")
    private Date lastUpdate;
}
