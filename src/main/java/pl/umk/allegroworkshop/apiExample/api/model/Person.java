package pl.umk.allegroworkshop.apiExample.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public record Person(String name, String lastName) {
    @JsonCreator
    public Person(@JsonProperty("name") String name, @JsonProperty("lastName") String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
