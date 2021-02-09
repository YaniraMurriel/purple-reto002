package com.pruple.reto002.reto002.service.Impl;

import com.pruple.reto002.reto002.domain.dto.RemesaDto;
import com.pruple.reto002.reto002.entity.Remesa;
import com.pruple.reto002.reto002.repositories.RemesaRepository;
import com.pruple.reto002.reto002.service.RemesaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service

public class RemesaServiceImpl implements RemesaService {

    @Autowired
    private RemesaRepository remesaRepository;

    @Override
    public RemesaDto findByID(Integer id) {
        Remesa remesas = remesaRepository.findById(id).get();
        RemesaDto remesasDto = new RemesaDto();
        BeanUtils.copyProperties(remesas,remesasDto );
        return remesasDto;
    }

    //*
    @Override
    public Flux<RemesaDto> findAll() {
        return Flux.fromIterable(remesaRepository.findAll())
                .map(p -> new RemesaDto(p.getId(),p.getDepositante(),p.getMoneda(), p.getMonto(), p.getDescripcion(), p.getFecha()));
    }
    //*/

}