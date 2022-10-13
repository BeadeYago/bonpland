package com.bonpland.inmobilaria.repository;

import com.bonpland.inmobilaria.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Integer> {
}
