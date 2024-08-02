package org.example.carsave.service;

import lombok.extern.slf4j.Slf4j;
import org.example.carsave.entity.Car;
import org.example.carsave.entity.Person;
import org.example.carsave.exceptionhandlers.InvalidCarModelException;
import org.example.carsave.exceptionhandlers.InvalidCarObjectException;
import org.example.carsave.exceptionhandlers.InvalidPersonObjectException;
import org.example.carsave.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class CarService {
    @Autowired
    private CarRepository repository;

    @Transactional
    public void save(Person person) throws Exception {
        if (person == null) {
            log.error("InvalidcarObjectException, person == null.");
            throw new InvalidPersonObjectException();
        }
        Car car = person.getPersonCar();
        if (car == null) {
            log.error("InvalidCarObjectException, car == null.");
            throw new InvalidCarObjectException();
        }
        if (car.getModel() == null) {
            log.error("InvalidCarModelException, car model == null.");
            throw new InvalidCarModelException();
        }
        repository.save(car);
        log.info(car.getModel() + " inserted.");
    }
}
