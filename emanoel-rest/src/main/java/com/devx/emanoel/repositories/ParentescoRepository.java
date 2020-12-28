package com.devx.emanoel.repositories;

import com.devx.emanoel.model.Parentesco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentescoRepository extends JpaRepository<Parentesco, Long> {
}
