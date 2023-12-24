package edu.learning.mil.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ranks")
public class PersonRank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
    @Column (name = "rank")
    private String rank;
    @Column(name = "date_granted")
    private LocalDate dateGranted;
    @Column (name = "rank_group")
    private String rankGroup;

}
