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
@Table(name="Cliente", schema = "dbo")

public class Report {

    @Id
    @Column (name = "id")
    Integer id;

    @Column(name = "nombre")
    String nombre;

    @Column(name = "direccion")
    String direccion;

    @Column(name = "distrito")
    String distrito;

    @Column(name = "descripcion")
    String descripcion;

}
