package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface ICita_consulta_externaService {
    public List<Cita_consulta_externa> all();
    Cita_consulta_externa newCita_consulta_externa(Cita_consulta_externa newCita_consulta_externa);
    Cita_consulta_externa one(String fecha_consulta);
    Cita_consulta_externa replaceCita_consulta_externa(Cita_consulta_externa newCita_consulta_externa, String fecha_consulta);
    void deleteCita_consulta_externa(String id);
}