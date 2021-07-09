package com.registry.technics.entity;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue(Smartphone.DISCRIMINATOR_VALUE)
public class Smartphone extends Technic {

    public static final String DISCRIMINATOR_VALUE = "4";

    private double memory;

    private int camCount;
}
