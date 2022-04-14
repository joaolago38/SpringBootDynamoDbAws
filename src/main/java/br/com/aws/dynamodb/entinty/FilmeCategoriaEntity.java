package br.com.aws.dynamodb.entinty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.stream.DoubleStream;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "film_category")
public class FilmeCategoriaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer filmId;
    @Column(name = "category_id")
    private Integer categoryId;
    @Column(name = "last_update")
    private Date lastUpdate;


}
