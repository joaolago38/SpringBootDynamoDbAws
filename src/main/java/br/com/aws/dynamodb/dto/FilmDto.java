package br.com.aws.dynamodb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class FilmDto {

    @JsonProperty(value = "filmId")
    @NotNull(message ="O campo id deve ser preenchido.")
    private  Long filmId;
    @JsonProperty(value = "title")
    private String title;
    @JsonProperty(value = "description")
    private String description;
    @JsonProperty(value = "releaseYear")
    private String releaseYear;
    @JsonProperty(value = "languageId")
    private Long languageId;
    @JsonProperty(value = "rentalDuration")
    private String rentalDuration;
    @JsonProperty(value = "rentalRate")
    private String rentalRate;
    @JsonProperty(value = "length")
    private Integer length;
    @JsonProperty(value = "replacementCost")
    private String replacementCost;

}
