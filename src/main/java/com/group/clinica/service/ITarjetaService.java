package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface ITarjetaService {
    public List<Tarjeta> all();
    Tarjeta newTarjeta(Tarjeta newTarjeta);
    Tarjeta one(String fecha_vencimiento);
    Tarjeta replaceTarjeta(Tarjeta newTarjeta, String fecha_vencimiento);
    void deleteTarjeta(String id);
}