package br.com.aws.dynamodb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class LanguageDto {

    @JsonProperty(value = "languageId")
    @NotNull(message ="O campo id deve ser preenchido.")
    private  Long languageId;
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "lastUpdate")
    private Date lastUpdate;
}
