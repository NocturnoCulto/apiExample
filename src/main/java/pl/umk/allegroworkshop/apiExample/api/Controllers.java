package pl.umk.allegroworkshop.apiExample.api;


import jakarta.annotation.PostConstruct;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.umk.allegroworkshop.apiExample.api.model.Person;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controllers {

    Map<String, Person> personMap = new HashMap<>();

    @GetMapping(value = "/getNameById", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Person> getAllMeals(@RequestParam("id") String id) {
        Person person = personMap.get(id) == null ? new Person("Unknown", "Person") : personMap.get(id);
        return ResponseEntity
                .status(200)
                .body(person);
    }

    @PostConstruct
    private void fillPersonMap() {
        personMap.put("1", new Person("Waldemar", "Legień"));
        personMap.put("2", new Person("Antoni", "Zajkowski"));
        personMap.put("3", new Person("Paweł", "Nastula"));
        personMap.put("4", new Person("Beata", "Maksymow"));
        personMap.put("5", new Person("Katarzyna", "Kłys"));
        personMap.put("6", new Person("Aneta", "Szczepanska"));
        personMap.put("7", new Person("Rafał", "Kubacki"));
        personMap.put("8", new Person("Krzysztof", "Wiłkomirski"));
        personMap.put("9", new Person("Robert", "Krawczyk"));
        personMap.put("10", new Person("Anna", "Załęczna"));
    }
}
