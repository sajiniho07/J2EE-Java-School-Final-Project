package org.j2os;

import org.j2os.entity.Car;
import org.j2os.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReadServiceController {

	@Autowired
	PersonSaveClient personSaveClient;
	@Autowired
	CarSaveClient carSaveClient;
	@Autowired
	PersonSelectClient personSelectClient;
	@Autowired
	CarSelectClient carSelectClient;

	@PostMapping("/person/save")
	public ResponseEntity<Person> savePerson(@RequestBody Person person) {
		Person saved = personSaveClient.save(person);
		return ResponseEntity.ok(saved);
	}

	@GetMapping("/person/{id}")
	public ResponseEntity<Person> getPersonById(@PathVariable Long id) {
		return ResponseEntity.ok(personSelectClient.getPersonById(id));
	}

	@PostMapping("/car/save")
	public ResponseEntity<Person> saveCar(@RequestBody Person person) {
		Car saved = carSaveClient.save(person);
		return ResponseEntity.ok(person);
	}

	@GetMapping("/car/{id}")
	public ResponseEntity<Car> getCarById(@PathVariable Long id) {
		return ResponseEntity.ok(carSelectClient.getCarById(id));
	}
}
