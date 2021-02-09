package com.pruple.reto002.reto002.domain.dto;

import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class ReportDto {
    private Integer id;
    private String nombre;
    private String direccion;
    private String distrito;
    private String descripcion;
}
