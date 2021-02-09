package com.pruple.reto002.reto002.service;

import com.pruple.reto002.reto002.domain.dto.RemesaDto;
import reactor.core.publisher.Flux;

public interface RemesaService {

     RemesaDto findByID(Integer id);

     Flux<RemesaDto> findAll();


}
