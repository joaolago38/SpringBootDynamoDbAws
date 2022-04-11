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
public class FilmeCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long filmId;
    @Column(name = "category_id")
    private Long categoryId;
    @Column(name = "last_update")
    private Date lastUpdate;
}
