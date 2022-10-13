package com.bonpland.inmobilaria.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Property {

    @Id
    private Integer id;

    private Integer environments;

    private String country;

    private String city;

    private Float price;

    private Integer meters;

    private String type;

}