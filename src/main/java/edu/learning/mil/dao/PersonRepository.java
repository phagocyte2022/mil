package edu.learning.mil.dao;

import edu.learning.mil.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
//    Person findById(long id);

}
