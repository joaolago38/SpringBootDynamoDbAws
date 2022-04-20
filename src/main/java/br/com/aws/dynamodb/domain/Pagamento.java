package br.com.aws.dynamodb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class Pagamento {
    private Integer payment_id;
    private Long customer_id;
    private Long staff_id;
    private Long rental_id;
    private Long amount;
    private Date payment_date;

}
