package com.bonpland.inmobilaria.service;

import com.bonpland.inmobilaria.entity.Property;
import com.bonpland.inmobilaria.exception.EntityNotFoundException;
import com.bonpland.inmobilaria.repository.PropertyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {

    private PropertyService(PropertyRepository repo) {
        this.repo = repo;
    }

    private final PropertyRepository repo;

    public List<Property> findAll() {
        return repo.findAll();
    }

    public Property findById(Integer id) {
        return repo.findById(id).orElseThrow(() ->
                new EntityNotFoundException("Property with id: " + id + " not exist."));
    }

    public Property save(Property property){
        return repo.save(property);
    }

    public void deleteById(Integer id) {
        repo.deleteById(id);
    }

    public Property edit(Integer id, Property property) {

        final Property propertyFromDB = repo.findById(id).orElseThrow(() ->
                new EntityNotFoundException("Property with id: " + id + " not exist."));

        propertyFromDB.setEnvironments(property.getEnvironments());
        propertyFromDB.setCountry(property.getCountry());
        propertyFromDB.setCity(property.getCity());
        propertyFromDB.setPrice(property.getPrice());
        propertyFromDB.setMeters(property.getMeters());
        propertyFromDB.setType(property.getType());

        return repo.save(propertyFromDB);
    }
}
