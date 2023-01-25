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
@Table(name = "anfitriona")
public class Anfitriona {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String dni_anfitriona;
    private String nombre_anfitriona;
    private String id;
    private Integer telefono_anfitriona;
    private String direccion_anfitriona;
    private String apellido_anfitriona;
    private String correo_anfitriona;

}