package com.registry.technics.entity;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue(Television.DISCRIMINATOR_VALUE)
public class Television extends Technic {

    public static final String DISCRIMINATOR_VALUE = "5";

    private String category;

    private String technology;

}
