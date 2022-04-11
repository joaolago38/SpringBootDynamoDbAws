package br.com.aws.dynamodb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class CategoryDto {
    @NotNull(message ="O campo id deve ser preenchido.")
    @JsonProperty(value = "categoryId")
    private Long categoryId;
    @JsonProperty(value = "lastUpdate")
    private Date lastUpdate;

}
