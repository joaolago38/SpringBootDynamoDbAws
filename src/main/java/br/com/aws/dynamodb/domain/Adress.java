package br.com.aws.dynamodb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class Adress {
    private Integer addressId;
    private String address;
    private String address2;
    private String district;
    private Long city_id;
    private String postal_code;
    private String phone;
    private Date last_update;
}
