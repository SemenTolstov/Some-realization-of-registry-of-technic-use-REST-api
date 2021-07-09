package com.registry.technics.entity;

public enum TechnicType {

    COMPUTER(Computer.DISCRIMINATOR_VALUE, Computer.class),
    HOOVER(Hoover.DISCRIMINATOR_VALUE, Hoover.class),
    REFRIGERATOR(Refrigerator.DISCRIMINATOR_VALUE, Refrigerator.class),
    SMARTPHONE(Smartphone.DISCRIMINATOR_VALUE, Smartphone.class),
    TELEVISION(Television.DISCRIMINATOR_VALUE, Television.class);

    private String discriminator;

    private Class technicClass;

    public Class getTechnicClass() {
        return technicClass;
    }

    TechnicType(String discriminator, Class technicClass) {
        this.discriminator = discriminator;
        this.technicClass = technicClass;
    }

    public String getDiscriminator() {
        return discriminator;
    }
}
