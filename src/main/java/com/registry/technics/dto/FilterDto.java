package com.registry.technics.dto;

import com.registry.technics.entity.TechnicType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FilterDto {

    private String color;
    private TechnicType type;
    private Double priceFrom;
    private Double priceTo;
    private Boolean sort;
}
