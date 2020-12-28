package com.devx.emanoel.repositories;

import com.devx.emanoel.model.Falecido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FalecidoRepository extends JpaRepository<Falecido, Long> {
}
