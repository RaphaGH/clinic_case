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
@Table(name = "medico")
public class Medico {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String dni_medico;
    private String nombre_medico;
    private String id;
    private Integer telefono_medico;
    private String direccion_medico;
    private String apellido_medico;
    private String correo_medico;

}