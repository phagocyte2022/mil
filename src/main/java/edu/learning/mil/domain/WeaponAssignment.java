package edu.learning.mil.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
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
    @Column(name = "weapon_id", insertable=false, updatable=false)
    Long weaponId;
    @Column(name = "person_id")
    Long personId;
    @Column (name = "date_granted")
    private LocalDate dateGranted;
    @Column (name = "date_returned")
    private LocalDate dateReturned;
    @ManyToOne
    @JoinColumn(name = "weapon_id")
    private Weapon weapon;

    @ManyToOne
    @JoinColumn(name = "weapon_id")
    public Weapon getWeapon() {
        return this.weapon;
    }

}
