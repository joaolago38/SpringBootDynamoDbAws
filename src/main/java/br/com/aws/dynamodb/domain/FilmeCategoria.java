package br.com.aws.dynamodb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class FilmeCategoria {
    private Integer film_id;
    private Integer category_id;
    private Date last_update;
}
