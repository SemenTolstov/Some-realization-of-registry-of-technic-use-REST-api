package com.registry.technics.entity;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue(Hoover.DISCRIMINATOR_VALUE)
public class Hoover extends Technic {

    public static final String DISCRIMINATOR_VALUE = "2";

    private double dustCollectorVolume;

    private int numberOfModes;

}
