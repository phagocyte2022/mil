package edu.learning.mil.service;

import edu.learning.mil.dao.PersonRepository;
import edu.learning.mil.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }

    public Optional<Person> getPersonByLastName(String lastName) {
        return personRepository.findPersonByLastName(lastName);
    }
    public Optional<Person> getPersonByFirstName(String firstName) {
        return personRepository.findPersonByFirstName(firstName);
    }
    public Optional<Person> getPersonByMiddleName(String middleName) {
        return personRepository.findPersonByMiddleName(middleName);
    }


}
