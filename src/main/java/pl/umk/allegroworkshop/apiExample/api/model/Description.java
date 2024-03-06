package pl.umk.allegroworkshop.apiExample.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(value = {"delay"})
public record Description(String id,
                          String shortText,
                          String longText,
                          int delay) {
    @JsonCreator
    public Description(@JsonProperty("id") String id, @JsonProperty("shortText") String shortText, @JsonProperty("longText") String longText, int delay) {
        this.id = id;
        this.shortText = shortText;
        this.longText = longText;
        this.delay = delay;
    }
}
