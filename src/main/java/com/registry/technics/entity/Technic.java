package com.registry.technics.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@DiscriminatorColumn(name = "technic_type", discriminatorType = DiscriminatorType.INTEGER)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "TECHNIC")
public abstract class Technic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String countryName;
    private String firmName;
    private String modelName;
    private boolean orderOnline;
    private boolean credit;
    private boolean availableModels;
    private String serialNumber;
    private String color;
    private double size;
    private double price;
}
