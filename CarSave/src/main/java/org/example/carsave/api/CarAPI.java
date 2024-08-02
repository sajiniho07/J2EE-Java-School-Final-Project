package org.example.carsave.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.carsave.entity.Person;
import org.example.carsave.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/car")
@Slf4j
public class CarAPI {

    private final CarService carService;

    @PostMapping("/save")
    public ResponseEntity<Person> save(@RequestBody Person person) throws Exception {
        carService.save(person);
        return ResponseEntity.ok(person);
    }
}
