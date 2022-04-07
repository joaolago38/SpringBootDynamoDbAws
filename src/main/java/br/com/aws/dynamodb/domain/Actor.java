package br.com.aws.dynamodb.domain;

import lombok.*;

import java.util.Date;



@Builder
@Data
public class Actor {
    private  Integer actor_id;
    private String first_name;
    private String last_name;
    private Date last_update;
}
