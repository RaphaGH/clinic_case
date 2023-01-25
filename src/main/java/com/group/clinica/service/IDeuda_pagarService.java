package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface IDeuda_pagarService {
    public List<Deuda_pagar> all();
    Deuda_pagar newDeuda_pagar(Deuda_pagar newDeuda_pagar);
    Deuda_pagar one(String id);
    Deuda_pagar replaceDeuda_pagar(Deuda_pagar newDeuda_pagar, String id);
    void deleteDeuda_pagar(String id);
}