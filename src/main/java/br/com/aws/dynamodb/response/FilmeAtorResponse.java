package br.com.aws.dynamodb.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
public class FilmeAtorResponse {

    @JsonProperty(value = "actorId")
    @NotNull(message ="O campo id deve ser preenchido.")
    private Integer actorId;
    @JsonProperty(value = "filmId")
    private Integer filmId;
    @JsonProperty(value = "lastUpdate")
    private Date lastUpdate;
}
