package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface IRecepcionistaService {
    public List<Recepcionista> all();
    Recepcionista newRecepcionista(Recepcionista newRecepcionista);
    Recepcionista one(String dni_recepcionista);
    Recepcionista replaceRecepcionista(Recepcionista newRecepcionista, String dni_recepcionista);
    void deleteRecepcionista(String id);
}