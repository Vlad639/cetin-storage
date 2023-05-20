package ru.vogu35.cetin.storage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vogu35.cetin.storage.repositories.UsersCalcRepository;

@RestController
@RequestMapping("/")
public class Controllers {

    @Autowired
    UsersCalcRepository calcRepository;

    @GetMapping(value = "/getReport")
    public String getReport() {

        return "TEST OK";
    }
}
