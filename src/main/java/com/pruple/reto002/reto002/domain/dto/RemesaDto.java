package com.pruple.reto002.reto002.domain.dto;

import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class RemesaDto {
    private Integer id;
    private String depositante;
    private String moneda;
    private Double monto;
    private String descripcion;
    private String fecha;

}
