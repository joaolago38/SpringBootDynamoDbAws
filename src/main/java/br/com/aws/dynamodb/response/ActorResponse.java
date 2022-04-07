package br.com.aws.dynamodb.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
public class ActorResponse {

    @JsonProperty(value = "actor_id")
    private Integer actorId;
    @JsonProperty(value = "first_Name")
    private String firstName;
    @JsonProperty(value = "last_name")
    private String lastName;
    @JsonProperty(value = "last_update")
    @NotNull(message ="O campo id deve ser preenchido.")
    private Date lastUpdate;
}
