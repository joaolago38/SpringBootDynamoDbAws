package br.com.aws.dynamodb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class City {

    private Integer city_id;

    private Long country_id;

    private Date last_update;
}
