package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface ICajaService {
    public List<Caja> all();
    Caja newCaja(Caja newCaja);
    Caja one(String id);
    Caja replaceCaja(Caja newCaja, String id);
    void deleteCaja(String id);
}