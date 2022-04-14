package br.com.aws.dynamodb.entinty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "film")
public class FilmesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer filmId;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "release_year")
    private String releaseYear;
    @Column(name = "language_id")
    private Long languageId;
    @Column(name = "rental_duration")
    private String rentalDuration;
    @Column(name = "rental_rate")
    private String rentalRate;
    @Column(name = "length")
    private Integer length;
    @Column(name = "replacement_cost")
    private String replacementCost;
}
