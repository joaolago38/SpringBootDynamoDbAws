package br.com.aws.dynamodb.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
public class CityResponse {
    @NotNull(message ="O campo id deve ser preenchido.")
    @JsonProperty(value = "city_id")
    private Long city_id;
    @Column(name = "country_id")
    private Long countryId;
    @Column(name = "last_update")
    private Date lastUpdate;
}
