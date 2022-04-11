package br.com.aws.dynamodb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class Inventory {
    private Long inventory_id;
    private Long film_id;
    private Long store_id;
    private Date last_update;
}
