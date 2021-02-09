package com.pruple.reto002.reto002.service;

import com.pruple.reto002.reto002.domain.dto.ReportDto;
import com.pruple.reto002.reto002.entity.Report;

import java.util.List;

public interface ReportService {

    public List<Report> findAll();

    public void guardar(Report report);

    public List<ReportDto> findAllClientesDto();
}
