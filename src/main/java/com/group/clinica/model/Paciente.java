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
@Table(name = "paciente")
public class Paciente {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String fecha_nacimiento;
    private String dni_paciente;
    private String nombre_paciente;
    private String id;
    private Integer telefono_paciente;
    private String direccion_paciente;
    private String apellido_paciente;
    private String correo_paciente;
    private String sangre_paciente;
    private String numero_social;
    private String numero_historia_clinica;

}