package edu.learning.mil.dao;

import edu.learning.mil.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findPersonByLastName(String lastName);
    List<Person> findPersonByFirstName(String lastName);
    List<Person> findPersonByMiddleName(String lastName);
    Person findById(long id);

}
