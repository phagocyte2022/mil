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
    @Column(name = "rank_id")
    Long rankId;
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

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        WeaponAssignment that = (WeaponAssignment) o;
        return getRankId() != null && Objects.equals(getRankId(), that.getRankId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
