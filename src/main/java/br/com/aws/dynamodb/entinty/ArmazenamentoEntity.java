package br.com.aws.dynamodb.entinty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "store")
public class ArmazenamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long storeId;
    @Column(name = "manager_staff_id")
    private Long managerStaffId;
    @Column(name = "address_id")
    private Long addressId;
    @Column(name = "first_name")
    private Long lastUpdate;
}
