package org.example.personselect.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.personselect.entity.Person;
import org.example.personselect.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElse(null);
    }
}
