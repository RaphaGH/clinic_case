package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface IGastos_emergenciaService {
    public List<Gastos_emergencia> all();
    Gastos_emergencia newGastos_emergencia(Gastos_emergencia newGastos_emergencia);
    Gastos_emergencia one(String id);
    Gastos_emergencia replaceGastos_emergencia(Gastos_emergencia newGastos_emergencia, String id);
    void deleteGastos_emergencia(String id);
}