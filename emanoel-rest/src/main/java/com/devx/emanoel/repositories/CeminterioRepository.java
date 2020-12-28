package com.devx.emanoel.repositories;

import com.devx.emanoel.model.Ceminterio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CeminterioRepository extends JpaRepository<Ceminterio, Long> {

}
