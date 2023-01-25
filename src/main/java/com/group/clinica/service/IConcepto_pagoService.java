package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface IConcepto_pagoService {
    public List<Concepto_pago> all();
    Concepto_pago newConcepto_pago(Concepto_pago newConcepto_pago);
    Concepto_pago one(String id);
    Concepto_pago replaceConcepto_pago(Concepto_pago newConcepto_pago, String id);
    void deleteConcepto_pago(String id);
}