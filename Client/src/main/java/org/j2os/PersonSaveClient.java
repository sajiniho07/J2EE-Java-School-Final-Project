package org.j2os;

import org.j2os.entity.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("person-save-service")
public interface PersonSaveClient {

    @PostMapping("/person/save")
    Person save(@RequestBody Person person);

}
