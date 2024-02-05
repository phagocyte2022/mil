package edu.learning.mil.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "people")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long personId;
    @Column (name = "last_name")
    private String lastName;
    @Column (name = "first_name")
    private String firstName;
    @Column (name = "middle_name")
    private String middleName;
    @OneToMany(mappedBy = "person")
    private List<PersonRank> personRank;
    @OneToMany(mappedBy = "person")
    private List<Weapon> weapon;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

}
