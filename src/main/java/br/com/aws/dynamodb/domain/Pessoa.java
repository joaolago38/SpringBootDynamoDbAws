package br.com.aws.dynamodb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class Pessoa {
    private Integer staff_id;
    private String first_name;
    private String last_name;
    private Long address_id;
    private String email;
    private String store_id;
    private Boolean active;
    private String username;
    private String password;
    private Date last_update;
    private String picture;
}
