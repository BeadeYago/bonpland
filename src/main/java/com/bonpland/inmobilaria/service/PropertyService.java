package com.bonpland.inmobilaria.service;

import com.bonpland.inmobilaria.entity.Property;
import com.bonpland.inmobilaria.repository.PropertyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {

    private PropertyService(PropertyRepository repo){
        this.repo = repo;
    }

    private PropertyRepository repo;

    public List<Property> findAll(){
        return repo.findAll();
    }
}
