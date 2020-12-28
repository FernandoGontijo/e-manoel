package com.devx.emanoel.repositories;

import com.devx.emanoel.model.Funeraria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FunerariaRepository extends JpaRepository<Funeraria, Long> {

}
