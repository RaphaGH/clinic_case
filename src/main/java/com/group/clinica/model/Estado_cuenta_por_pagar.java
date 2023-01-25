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
@Table(name = "estado_cuenta_por_pagar")
public class Estado_cuenta_por_pagar {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String fecha_cuenta;
    private String id_paciente;
    private String id;
    private String concepto;
    private Float total_gastos;

}