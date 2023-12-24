package edu.learning.mil.controller;

import edu.learning.mil.domain.Person;
import edu.learning.mil.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private PersonService personService;
    @GetMapping("/person/{id}")
    public Person getPersonById(@PathVariable (name = "id") Long id) throws Exception {
        return personService.getPersonById(id);
    }

    @PostMapping("/person/create")
    public Person createPerson(@RequestBody Person newPerson){
        return personService.createPerson(newPerson);
    }

}
