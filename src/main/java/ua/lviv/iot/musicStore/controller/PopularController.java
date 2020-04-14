package ua.lviv.iot.musicStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.business.PopularService;
import ua.lviv.iot.musicStore.model.Popular;


import java.util.List;


import static org.springframework.http.HttpStatus.NOT_FOUND;

@RequestMapping("/popular")
@RestController
public class PopularController {

    @Autowired
    private PopularService popularService;

    @GetMapping(path = "/{id}")
    public Popular getPopular(final @PathVariable("id") Integer id) {
        return popularService.getPopular(id);
    }

    @GetMapping
    public List<Popular> getPopular() {
        return popularService.getPopular();
    }


    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public Popular createPopular(final @RequestBody Popular popular) {
        return popularService.createPopular(popular);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Popular> deletePopular(@PathVariable("id") Integer popularId) {
        if (popularService.existPopular(popularId)) {
            popularService.deletePopular(popularId);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(NOT_FOUND).build();
        }
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Popular> updatePopular(final @PathVariable("id") Integer popularId,
                                                 final @RequestBody Popular popular) {
        return (popularService.existPopular(popularId)) ? ResponseEntity.ok(popularService.updatePopular(popularId, popular)) :
                ResponseEntity.status(NOT_FOUND).build();

    }

}
