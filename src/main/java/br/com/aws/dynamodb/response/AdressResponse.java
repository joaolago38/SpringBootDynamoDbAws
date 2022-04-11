package br.com.aws.dynamodb.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
public class AdressResponse {

    @JsonProperty(value = "endereco_id")
    @NotNull(message ="O campo id deve ser preenchido.")
    private Integer addressId;
    @JsonProperty(value = "endereço")
    private String address;
    @JsonProperty(value = "endereco2")
    private String address2;
    @JsonProperty(value = "distrito")
    private String district;
    @JsonProperty(value = "cidade_Id")
    private Long cityId;
    @JsonProperty(value = "caixa_postal")
    private String postalCode;
    @JsonProperty(value = "telefone")
    private String phone;
    @JsonProperty(value = "ultimo_update")
    private Date lastUpdate;
}
