package edu.learning.mil.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "weapons_assigned")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class WeaponAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assignment_id", insertable=false, updatable=false)
    Long weaponAssignmentId;
    @Column(name = "weapon_id")
    Long weaponId;
    @Column(name = "person_id")
    Long personId;
    @Column (name = "date_granted")
    private LocalDate dateGranted;
    @Column (name = "date_returned")
    private LocalDate dateReturned;
    @ManyToOne
    @JoinColumn(name = "weapon_id", insertable=false, updatable=false)
    private Weapon weapon;

    @ManyToOne
    @JoinColumn(name = "weapon_id")
    public Weapon getWeapon() {
        return this.weapon;
    }


}
