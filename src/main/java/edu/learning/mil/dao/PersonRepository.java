package edu.learning.mil.dao;

import edu.learning.mil.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findPersonByLastName(String lastName);
    Optional<Person> findPersonByFirstName(String lastName);
    Optional<Person> findPersonByMiddleName(String lastName);
    Person findById(long id);

}
