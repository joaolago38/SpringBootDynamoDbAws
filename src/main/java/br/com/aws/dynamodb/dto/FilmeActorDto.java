package br.com.aws.dynamodb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class FilmeActorDto {
    @JsonProperty(value = "actorId")
    @NotNull(message ="O campo id deve ser preenchido.")
    private Integer actorId;
    @JsonProperty(value = "filmId")
    private Integer filmId;
    @JsonProperty(value = "lastUpdate")
    private Date lastUpdate;
}
