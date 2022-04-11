package br.com.aws.dynamodb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class CountryDto {

    @JsonProperty(value = "countryId")
    @NotNull(message ="O campo id deve ser preenchido.")
    private Long  countryId;
    @JsonProperty(value = "country")
    private String country;
    @JsonProperty(value = "lastUpdate")
    private Date lastUpdate;
}
