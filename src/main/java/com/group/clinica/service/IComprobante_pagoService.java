package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface IComprobante_pagoService {
    public List<Comprobante_pago> all();
    Comprobante_pago newComprobante_pago(Comprobante_pago newComprobante_pago);
    Comprobante_pago one(String fecha_pago);
    Comprobante_pago replaceComprobante_pago(Comprobante_pago newComprobante_pago, String fecha_pago);
    void deleteComprobante_pago(String id);
}