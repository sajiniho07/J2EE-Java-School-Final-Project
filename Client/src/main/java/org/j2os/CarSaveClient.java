package org.j2os;

import org.j2os.entity.Car;
import org.j2os.entity.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("car-save-service")
public interface CarSaveClient {
	@PostMapping("/car/save")
    Car save(@RequestBody Person person);
}
