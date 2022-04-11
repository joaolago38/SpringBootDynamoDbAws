package br.com.aws.dynamodb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class Customer {
    private Long customer_id;
    private Long store_id;
    private String first_name;
    private String last_name;
    private String email;
    private Long address_id;
    private Boolean activebool;
    private Date create_date;
    private Boolean active;

}
