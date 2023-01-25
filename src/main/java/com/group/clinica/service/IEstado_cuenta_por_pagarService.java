package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface IEstado_cuenta_por_pagarService {
    public List<Estado_cuenta_por_pagar> all();
    Estado_cuenta_por_pagar newEstado_cuenta_por_pagar(Estado_cuenta_por_pagar newEstado_cuenta_por_pagar);
    Estado_cuenta_por_pagar one(String fecha_cuenta);
    Estado_cuenta_por_pagar replaceEstado_cuenta_por_pagar(Estado_cuenta_por_pagar newEstado_cuenta_por_pagar, String fecha_cuenta);
    void deleteEstado_cuenta_por_pagar(String id);
}