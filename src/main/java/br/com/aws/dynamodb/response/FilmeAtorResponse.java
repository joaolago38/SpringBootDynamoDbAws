package br.com.aws.dynamodb.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
public class FilmeAtorResponse {

    @JsonProperty(value = "actorId")
    @NotNull(message ="O campo id deve ser preenchido.")
    private Long actorId;
    @JsonProperty(value = "filmId")
    private Long filmId;
    @JsonProperty(value = "lastUpdate")
    private Date lastUpdate;   @JsonProperty(value = "customerId")
    @NotNull(message ="O campo id deve ser preenchido.")
    private Integer customerId;
    @JsonProperty(value = "storeId")
    private Integer storeId;
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
