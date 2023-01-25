package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface IOrden_atencion_emergenciaService {
    public List<Orden_atencion_emergencia> all();
    Orden_atencion_emergencia newOrden_atencion_emergencia(Orden_atencion_emergencia newOrden_atencion_emergencia);
    Orden_atencion_emergencia one(String fecha_atencion);
    Orden_atencion_emergencia replaceOrden_atencion_emergencia(Orden_atencion_emergencia newOrden_atencion_emergencia, String fecha_atencion);
    void deleteOrden_atencion_emergencia(String id);
}