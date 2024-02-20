package edu.learning.mil.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ranks")
public class PersonRank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "rank_id")
    private Long rankId;
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
    @Column (name = "rank")
    private String rank;
    @Column(name = "date_granted")
    private LocalDate dateGranted;
    @Column (name = "rank_group")
    private String rankGroup;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        PersonRank that = (PersonRank) o;
        return getRankId() != null && Objects.equals(getRankId(), that.getRankId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
