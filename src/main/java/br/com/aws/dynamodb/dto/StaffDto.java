package br.com.aws.dynamodb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class StaffDto {
    @JsonProperty(value = "staff_id")
    @NotNull(message ="O campo id deve ser preenchido.")
    private Long staff_id;
    @JsonProperty(value = "firstName")
    private String firstName;
    @JsonProperty(value = "lastName")
    private String lastName;
    @JsonProperty(value = "addressId")
    private Long addressId;
    @JsonProperty(value = "email")
    private String email;
    @JsonProperty(value = "storeId")
    private String storeId;
    @JsonProperty(value = "active")
    private Boolean active;
    @JsonProperty(value = "username")
    private String username;
    @JsonProperty(value = "password")
    private String password;
    @JsonProperty(value = "lastUpdate")
    private Date lastUpdate;
    @JsonProperty(value = "picture")
    private String picture; 
}
