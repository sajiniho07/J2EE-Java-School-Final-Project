package org.j2os;

import org.j2os.entity.Car;
import org.j2os.entity.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("car-select-service")
public interface CarSelectClient {

    @GetMapping("/car/{id}")
    Car getCarById(@PathVariable Long id);

}
