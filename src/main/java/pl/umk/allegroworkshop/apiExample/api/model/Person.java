package pl.umk.allegroworkshop.apiExample.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public record Person(String name, String lastname) {
    @JsonCreator
    public Person(@JsonProperty("name") String name, @JsonProperty("lastname") String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
}
