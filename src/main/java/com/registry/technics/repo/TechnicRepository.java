package com.registry.technics.repo;

import com.registry.technics.entity.Technic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicRepository extends JpaRepository<Technic, Integer> {
}
