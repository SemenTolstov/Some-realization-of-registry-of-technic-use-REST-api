package com.registry.technics.entity;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue(Refrigerator.DISCRIMINATOR_VALUE)
public class Refrigerator extends Technic {

    public static final String DISCRIMINATOR_VALUE = "3";

    private int doorsCount;

    private String compressorType;
}
