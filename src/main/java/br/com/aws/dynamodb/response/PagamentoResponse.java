package br.com.aws.dynamodb.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
public class PagamentoResponse {
    @JsonProperty(value = "paymentId")
    @NotNull(message ="O campo id deve ser preenchido.")
    private Long paymentId;
    @JsonProperty(value = "customerId")
    private Long customerId;
    @JsonProperty(value = "staffId")
    private Long staffId;
    @JsonProperty(value = "rentalId")
    private Long rentalId;
    @JsonProperty(value = "amount")
    private Long amount;
    @JsonProperty(value = "paymentDate")
    private Date paymentDate;
}
