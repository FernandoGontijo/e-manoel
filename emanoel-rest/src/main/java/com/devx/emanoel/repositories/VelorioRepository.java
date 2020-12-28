package com.devx.emanoel.repositories;

import com.devx.emanoel.model.Velorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VelorioRepository extends JpaRepository<Velorio, Long> {
}
