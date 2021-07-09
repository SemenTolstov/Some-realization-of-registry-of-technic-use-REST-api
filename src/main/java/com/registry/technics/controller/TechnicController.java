package com.registry.technics.controller;

import com.registry.technics.dto.FilterDto;
import com.registry.technics.entity.*;
import com.registry.technics.repo.TechnicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TechnicController {

    @Autowired
    private TechnicRepository technicRepository;

    @GetMapping("alltechnic")
    public List<Technic> allTechnic() {
        Iterable<Technic> technicIterable = technicRepository.findAll();
        List<Technic> technicList = new ArrayList<>();
        for (Technic technic : technicIterable) {
            technicList.add(technic);
        }
        return technicList;
    }

    @PostMapping("addcomputer")
    public void addComputer(Computer computer) {
        technicRepository.save(computer);
    }

    @PostMapping("addhoover")
    public void addHoover(Hoover hoover) {
        technicRepository.save(hoover);
    }

    @PostMapping("addrefrigerator")
    public void addRefrigerator(Refrigerator refrigerator) {
        technicRepository.save(refrigerator);
    }

    @PostMapping("addsmartphone")
    public void addSmartphone(Smartphone smartphone) {
        technicRepository.save(smartphone);
    }

    @PostMapping("addtelevision")
    public void addTelevision(Television television) {
        technicRepository.save(television);
    }

    @PostMapping("filter")
    public List<Technic> filter(FilterDto filterDto) {
        var result = technicRepository.findAll().stream();

        if (filterDto.getType() != null) {
            result = result.filter(x -> filterDto.getType().getTechnicClass().isInstance(x));
        }

        if (filterDto.getColor() != null) {
            result = result.filter(x -> filterDto.getColor().equals(x.getColor()));
        }

        if (filterDto.getPriceTo() != null) {
            result = result.filter(x -> x.getPrice() < filterDto.getPriceTo());
        }

        if (filterDto.getPriceFrom() != null) {
            result = result.filter(x -> x.getPrice() > filterDto.getPriceFrom());
        }

        if (filterDto.getSort()) {
            result = result.sorted(Comparator.comparing(Technic::getName).thenComparing(Technic::getPrice));
        }

        return result.collect(Collectors.toList());
    }
}
