package com.pruple.reto002.reto002.web.controller;

import com.pruple.reto002.reto002.domain.dto.RemesaDto;
import com.pruple.reto002.reto002.service.RemesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("allRemesas")

public class RemesaController {

    @Autowired
    private RemesaService remesaService;

    //----REMESA----

    // Endpoint 01 - http://localhost:8088/allRemesas/41253263   /* */
    @GetMapping("/{id}")
    public RemesaDto obtenerRemesaPorId(@PathVariable("id") Integer id){
        return remesaService.findByID(id);
    }

    //Endpoint 02 - http://localhost:8088/allRemesas
    @GetMapping("")
    public Flux<RemesaDto> findAll() {
        return this.remesaService.findAll();
    }
    

}
