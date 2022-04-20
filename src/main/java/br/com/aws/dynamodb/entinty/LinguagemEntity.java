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
@Table(name = "language")
public class LinguagemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer languageId;
    @Column(name = "name")
    private String name;
    @Column(name = "last_update")
    private Date lastUpdate;
}
