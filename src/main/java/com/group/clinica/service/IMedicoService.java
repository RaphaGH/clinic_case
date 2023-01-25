package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface IMedicoService {
    public List<Medico> all();
    Medico newMedico(Medico newMedico);
    Medico one(String dni_medico);
    Medico replaceMedico(Medico newMedico, String dni_medico);
    void deleteMedico(String id);
}