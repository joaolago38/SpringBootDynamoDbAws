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
@Table(name = "rental")
public class AluguelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer rentalId;
    @Column(name = "rental_date")
    private Date rentalDate;
    @Column(name = "return_date")
    private Date returnDate;
    @Column(name = "customer_id")
    private Long customerId;
    @Column(name = "staff_id")
    private Long staffId;
    @Column(name = "inventory_id")
    private Long inventoryId;
    @Column(name = "last_update")
    private Date lastUpdate;
}
