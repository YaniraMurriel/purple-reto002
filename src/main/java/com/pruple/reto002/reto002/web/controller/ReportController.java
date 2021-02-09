package com.pruple.reto002.reto002.web.controller;

import com.pruple.reto002.reto002.domain.dto.RemesaDto;
import com.pruple.reto002.reto002.domain.dto.ReportDto;
import com.pruple.reto002.reto002.entity.Report;
import com.pruple.reto002.reto002.service.RemesaService;
import com.pruple.reto002.reto002.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("allReports")

public class ReportController {

    @Autowired
    private ReportService reportService;

    //----PRESTAMOS----

    //Endpoint 01 - http://localhost:8088/allReports
    @GetMapping("")
    public String allReports(){
        return "Estos son todos los reportes de clientes que no pueden pagar sus cuotas:";
    }

    //Endpoint 02 - http://localhost:8088/allReports/Clientes
    @GetMapping("/Clientes")
    public List<Report> findAll(){
        return reportService.findAll();
    }

    //Endpoint 03 - http://localhost:8088/allReports/allClients   /* */
    @PostMapping("/allClients")
    public void report (@RequestBody Report tablareporte){
        reportService.guardar(tablareporte);
    }

    //Endpoint 04 - http://localhost:8088/allReports/allClientes   /* */
    @GetMapping("/allClientes")
    public List <ReportDto> findAllClientesDto() {
        return reportService.findAllClientesDto();
    }


}