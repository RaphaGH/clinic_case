package com.group.clinica.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tarjeta")
public class Tarjeta {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String fecha_vencimiento;
    private String id;
    private String numero_tarjeta;
    private String nombre_titular;
    private String codigo_seguridad;

}