package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface IHorario_atencionService {
    public List<Horario_atencion> all();
    Horario_atencion newHorario_atencion(Horario_atencion newHorario_atencion);
    Horario_atencion one(String id);
    Horario_atencion replaceHorario_atencion(Horario_atencion newHorario_atencion, String id);
    void deleteHorario_atencion(String id);
}