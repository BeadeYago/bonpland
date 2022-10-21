package com.bonpland.inmobilaria.controller;

import com.bonpland.inmobilaria.entity.Property;
import com.bonpland.inmobilaria.service.PropertyService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PropertyController {

    public PropertyController(PropertyService service) {
        this.service = service;
    }

    private final PropertyService service;

    @GetMapping
    public List<Property> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Property findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Property save(@RequestBody Property property) {
        return service.save(property);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }

    @PutMapping("/{id}")
    public Property edit(@RequestBody Property property, @PathVariable Integer id) {
        return service.edit(id, property);
    }
}
