package br.com.aws.dynamodb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Filme {

    private  Long filmeId;
    private String title;
    private String description;
    private String release_year;
    private Long language_id;
    private String rental_duration;
    private String rental_rate;
    private Integer length;
    private String replacement_cost;
}
