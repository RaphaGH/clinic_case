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
@Table(name = "cita_consulta_externa")
public class Cita_consulta_externa {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String fecha_consulta;
    private String id_paciente;
    private String id;
    private String id_medico;
    private String id_anfitriona;
    private String id_enfermera;
    private String id_recepcionista;
    private Float hora_cita;
    private String observaciones;

}