package br.com.aws.dynamodb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class CustomerDto {

    @JsonProperty(value = "customerId")
    @NotNull(message ="O campo id deve ser preenchido.")
    private Long customerId;
    @JsonProperty(value = "storeId")
    private Long storeId;
    @JsonProperty(value = "firstName")
    private String firstName;
    @JsonProperty(value = "lastName")
    private String lastName;
    @JsonProperty(value = "email")
    private String email;
    @JsonProperty(value = "addressId")
    private Long addressId;
    @JsonProperty(value = "activebool")
    private Boolean activebool;
    @JsonProperty(value = "createDate")
    private Date createDate;
    @JsonProperty(value = "active")
    private Boolean active;

}
