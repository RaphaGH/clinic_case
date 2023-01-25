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
@Table(name = "historia_clinica")
public class Historia_clinica {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String fecha_apertura;
    private String id_paciente;
    private String id;
    private String antecedentes_medicos;
    private String enfermedades_actuales;
    private String medicamentos_recetados;
    private String resultados_examenes;

}