package edu.learning.mil.controller;

import edu.learning.mil.domain.Person;
import edu.learning.mil.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mil")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/person/list")
    public List<Person> getAllPeople(){
        return personService.getAllPeople();

    }

    @GetMapping("/person/id/{id}")
    public Person getPersonById(@PathVariable (name = "id") Long id) throws Exception {
        return personService.getPersonById(id);
    }

    @GetMapping("/person/lastname/{lastName}")
    public List<Person> findPersonByLastName(@PathVariable String lastName) {
        return personService.getPersonByLastName(lastName);
    }

    @GetMapping("/person/firstname/{firstName}")
    public List<Person> findPersonByFirstName(@PathVariable String firstName) {
        return personService.getPersonByFirstName(firstName);
    }

    @GetMapping("/person/middlename/{middleName}")
    public List<Person> findPersonByMiddleName(@PathVariable String middleName) {
        return personService.getPersonByMiddleName(middleName);
    }

    @PostMapping("/person/create")
    public Person createPerson(@RequestBody Person newPerson){
        return personService.createPerson(newPerson);
    }

}
