package com.registry.technics.entity;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue(Computer.DISCRIMINATOR_VALUE)
public class Computer extends Technic {

    public static final String DISCRIMINATOR_VALUE = "1";

    private String category;

    private String processorType;
}
