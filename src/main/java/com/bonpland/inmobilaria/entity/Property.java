package com.bonpland.inmobilaria.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer environments;

    private String country;

    private String city;

    private Float price;

    private Integer meters;

    private String type;

    private String status;

    private String image;

}