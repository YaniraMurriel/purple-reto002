package com.pruple.reto002.reto002.entity;

import lombok.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Entity
@Table(name="Remesa", schema = "dbo")

public class Remesa {

    @Id
    @Column(name = "id")
    Integer id;

    @Column(name = "depositante")
    String depositante;

    @Column(name = "moneda")
    String moneda;

    @Column(name = "monto")
    Double monto;

    @Column(name = "descripcion")
    String descripcion;

    @Column(name = "fecha")
    String fecha;

}
