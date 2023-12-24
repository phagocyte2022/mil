package edu.learning.mil.service;

import edu.learning.mil.dao.PersonRepository;
import edu.learning.mil.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person getPersonById(Long id) throws Exception {
        return personRepository.findById(id)
                .orElseThrow(() -> new Exception("Person not found with id: " + id));

    }

    public Person createPerson(Person newPerson) {
        return personRepository.save(newPerson);
    }
}
