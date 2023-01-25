package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface IDetalle_orden_atencion_emergenciaService {
    public List<Detalle_orden_atencion_emergencia> all();
    Detalle_orden_atencion_emergencia newDetalle_orden_atencion_emergencia(Detalle_orden_atencion_emergencia newDetalle_orden_atencion_emergencia);
    Detalle_orden_atencion_emergencia one(String fecha_atencion);
    Detalle_orden_atencion_emergencia replaceDetalle_orden_atencion_emergencia(Detalle_orden_atencion_emergencia newDetalle_orden_atencion_emergencia, String fecha_atencion);
    void deleteDetalle_orden_atencion_emergencia(String id);
}