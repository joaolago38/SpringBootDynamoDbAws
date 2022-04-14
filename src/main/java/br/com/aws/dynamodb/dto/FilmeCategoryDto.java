package br.com.aws.dynamodb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class FilmeCategoryDto {

    @JsonProperty(value = "filmId")
    @NotNull(message ="O campo id deve ser preenchido.")
    private Long filmId;
    @JsonProperty(value = "categoryId")
    private Long categoryId;
    @JsonProperty(value = "lastUpdate")
    private Date lastUpdate;

}
