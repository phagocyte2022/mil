package edu.learning.mil.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "weapons_assigned")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeaponAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name = "weapon_id")
    Weapon weapon = new Weapon();
    @ManyToOne
    @JoinColumn(name = "person_id")
    Person person = new Person();
    @Column (name = "date_granted")
    private LocalDate dateGranted;
    @Column (name = "date_returned")
    private LocalDate dateReturned;

}
