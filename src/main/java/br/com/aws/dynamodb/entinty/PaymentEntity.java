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
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long paymentId;
    @Column(name = "customer_id")
    private Long customerId;
    @Column(name = "staff_id")
    private Long staffId;
    @Column(name = "rental_id")
    private Long rentalId;
    @Column(name = "amount")
    private Long amount;
    @Column(name = "payment_date")
    private Date paymentDate;
}
