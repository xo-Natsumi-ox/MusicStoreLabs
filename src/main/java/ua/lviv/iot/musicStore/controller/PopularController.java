package ua.lviv.iot.musicStore.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.musicStore.model.Popular;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.OK;

@RequestMapping("/popular")
@RestController
public class PopularController {
    private Map<Integer, Popular> populars = new HashMap<>();
    private AtomicInteger idCounter = new AtomicInteger();

    @GetMapping(path = "/{id}")
    public Popular getPopular(@PathVariable("id") Integer popularId) {
        return populars.get(popularId);
    }

    @GetMapping
    public List<Popular> getPopular() {
        return new LinkedList<>(populars.values());
    }


    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public Popular createPopular(final @RequestBody Popular popular) {
        popular.setId(idCounter.incrementAndGet());
        populars.put(popular.getId(), popular);
        return popular;
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Popular> deletePopular(@PathVariable("id") Integer popularId) {
        HttpStatus status = populars.remove(popularId) == null ? NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(status).build();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Popular> updatePopular(final @PathVariable("id") Integer popularId, final @RequestBody Popular popular) {
        popular.setId(popularId);
        if (populars.containsKey(popularId)) {
            return ResponseEntity.ok(populars.put(popularId, popular));
        } else {
            return ResponseEntity.status(NOT_FOUND).build();
        }
    }

}
