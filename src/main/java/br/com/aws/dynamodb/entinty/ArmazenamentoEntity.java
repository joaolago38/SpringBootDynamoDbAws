package br.com.aws.dynamodb.entinty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "store")
public class ArmazenamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer storeId;
    @Column(name = "manager_staff_id")
    private Long managerStaffId;
    @Column(name = "address_id")
    private Long addressId;
    @Column(name = "lastUpdate")
    private Date lastUpdate;
}
