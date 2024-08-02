package org.example.personsave.service;

import lombok.extern.slf4j.Slf4j;
import org.example.personsave.entity.Car;
import org.example.personsave.entity.Person;
import org.example.personsave.exceptionhandlers.InvalidCarModelException;
import org.example.personsave.exceptionhandlers.InvalidPersonFamilyException;
import org.example.personsave.exceptionhandlers.InvalidPersonNameException;
import org.example.personsave.exceptionhandlers.InvalidPersonObjectException;
import org.example.personsave.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class PersonService {
    @Autowired
    private PersonRepository repository;

    @Transactional
    public void save(Person person) throws Exception {
        if (person == null) {
            log.error("InvalidPersonObjectException, person == null.");
            throw new InvalidPersonObjectException();
        }
        if (person.getName() == null) {
            log.error("InvalidPersonNameException, person name == null.");
            throw new InvalidPersonNameException();
        }
        if (person.getFamily() == null) {
            log.error("InvalidPersonFamilyException, person family == null.");
            throw new InvalidPersonFamilyException();
        }
        if (person.getPersonCar().getModel() == null) {
            log.error("InvalidCarModelException, car model == null.");
            throw new InvalidCarModelException();
        }
        Car car = new Car();
        car.setPerson(person);
        car.setModel(person.getPersonCar().getModel());
        repository.save(person);
        log.info(person.getName() + " inserted.");
    }
}
