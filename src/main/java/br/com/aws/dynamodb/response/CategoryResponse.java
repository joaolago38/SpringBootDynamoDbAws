package br.com.aws.dynamodb.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
public class CategoryResponse {

    @JsonProperty(value = "categoryId")
    @NotNull(message = "O campo id deve ser preenchido.")
    private Integer categoryId;
    @JsonProperty(value = "lastUpdate")
    private Date lastUpdate;

}

