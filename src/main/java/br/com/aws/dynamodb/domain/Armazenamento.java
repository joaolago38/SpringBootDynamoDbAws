package br.com.aws.dynamodb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Armazenamento {
    private Long store_id;
    private Long manager_staff_id;
    private Long address_id;
    private Long last_update;
}
