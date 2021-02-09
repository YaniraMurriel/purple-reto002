package com.pruple.reto002.reto002.repositories;

import com.pruple.reto002.reto002.entity.Remesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RemesaRepository extends JpaRepository <Remesa, Integer> {
}

