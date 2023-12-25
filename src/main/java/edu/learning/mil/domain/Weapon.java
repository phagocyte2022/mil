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
@Table(name = "weapons")
public class Weapon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "weapon_type")
    private String weaponType;
    @Column (name = "weapon_number")
    private String weaponNumber;
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;



}
