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
@Table(name = "enfermera")
public class Enfermera {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String dni_enfermera;
    private String nombre_enfermera;
    private String id;
    private Integer telefono_enfermera;
    private String direccion_enfermera;
    private String apellido_enfermera;
    private String correo_enfermera;

}