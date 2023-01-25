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
@Table(name = "comprobante_pago")
public class Comprobante_pago {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String fecha_pago;
    private String id_paciente;
    private String id;
    private String id_estado_cuenta;
    private Float total_gastos;

}