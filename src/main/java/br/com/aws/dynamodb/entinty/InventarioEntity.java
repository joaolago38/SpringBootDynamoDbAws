package br.com.aws.dynamodb.entinty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "inventory")
public class InventarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer inventoryId;
    @Column(name = "film_id")
    private Long filmId;
    @Column(name = "store_id")
    private Long storeId;
    @Column(name = "last_update")
    private Date lastUpdate;
}
