package br.com.aws.dynamodb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class FilmeActor {
    private Long actor_id;
    private Long film_id;
    private Date last_update;

}
