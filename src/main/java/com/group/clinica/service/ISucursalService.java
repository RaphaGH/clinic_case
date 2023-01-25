package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface ISucursalService {
    public List<Sucursal> all();
    Sucursal newSucursal(Sucursal newSucursal);
    Sucursal one(String id);
    Sucursal replaceSucursal(Sucursal newSucursal, String id);
    void deleteSucursal(String id);
}