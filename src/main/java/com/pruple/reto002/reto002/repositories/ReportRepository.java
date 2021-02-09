package com.pruple.reto002.reto002.repositories;

import com.pruple.reto002.reto002.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ReportRepository extends JpaRepository <Report, Integer> {
}

