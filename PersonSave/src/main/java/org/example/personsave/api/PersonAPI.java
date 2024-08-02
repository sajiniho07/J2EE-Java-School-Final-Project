package org.example.personsave.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.personsave.entity.Person;
import org.example.personsave.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
@Slf4j
public class PersonAPI {

    private final PersonService personService;

    @PostMapping("/save")
    public ResponseEntity<Person> save(@RequestBody Person person) throws Exception {
        personService.save(person);
        return ResponseEntity.ok(person);
    }
}
