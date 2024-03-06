package pl.umk.allegroworkshop.apiExample.api;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.umk.allegroworkshop.apiExample.api.model.Description;
import pl.umk.allegroworkshop.apiExample.service.DescriptionService;

@RestController
public class Controllers {

    private final DescriptionService descriptionService;

    public Controllers(DescriptionService descriptionService) {
        this.descriptionService = descriptionService;
    }

    private Logger logger = LoggerFactory.getLogger(Controllers.class);

    @GetMapping(value = "/descriptionById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Description> getDescriptionById(@PathVariable("id") String id) throws InterruptedException {
        logger.info("Request for description id={}", id);

        if (id.equals("170")) {
            delay(500);
            return ResponseEntity.status(503).body(null);
        }

        Description description = descriptionService.getDescriptionById(id);
        if (description == null) return ResponseEntity.status(404).body(null);
        delay(description.delay());
        return ResponseEntity
                .status(200)
                .body(description);
    }

    private void delay(int delay) throws InterruptedException {
        Thread.sleep(delay);
    }

}
