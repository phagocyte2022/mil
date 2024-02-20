package edu.learning.mil.service;

import edu.learning.mil.dao.PersonRepository;
import edu.learning.mil.dao.WeaponAssignmentRepository;
import edu.learning.mil.domain.Person;
import edu.learning.mil.domain.Weapon;
import edu.learning.mil.domain.WeaponAssignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<Person> getPersonByLastName(String lastName) {
        return personRepository.findPersonByLastName(lastName);
    }
    public List<Person> getPersonByFirstName(String firstName) {
        return personRepository.findPersonByFirstName(firstName);
    }
    public List<Person> getPersonByMiddleName(String middleName) {
        return personRepository.findPersonByMiddleName(middleName);
    }

    @Autowired
    private WeaponAssignmentRepository weaponAssignmentRepository;

    public List<Weapon> getWeaponsByPersonId(Long personId) {
        List<WeaponAssignment> weaponAssignments = weaponAssignmentRepository.findByPersonId(personId);
        return weaponAssignments.stream()
                .map(WeaponAssignment::getWeapon)
                .collect(Collectors.toList());
    }

}
