package com.pruple.reto002.reto002.service.Impl;

import com.pruple.reto002.reto002.domain.dto.ReportDto;
import com.pruple.reto002.reto002.entity.Report;
import com.pruple.reto002.reto002.repositories.ReportRepository;
import com.pruple.reto002.reto002.service.ReportService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service

public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportRepository reportRepository;

    @Override
    public List<Report> findAll() {
        return reportRepository.findAll();
    }

    @Override
    public void guardar(Report repo) {
      reportRepository.save(repo);
    }

    @Override
    public List<ReportDto> findAllClientesDto() {
        List <ReportDto> clientesdto = new ArrayList<ReportDto>(); //crear lista vacia
        List <Report> clientes = reportRepository.findAll(); // crear lista cob valores que guarde lo del fillall
        for (int i=0; i<clientes.size(); i++){ // recorriendo la lista
            System.out.println(clientes.get(i)); //pintando lista
            ReportDto variable = new ReportDto(); //crear objeto que pide el beanutils
            BeanUtils.copyProperties(clientes.get(i), variable); // transformar un entity a dto, clientes.get es la lista
            clientesdto.add(variable); // llenas la lista
        }
        return clientesdto;
    }


}
