package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface IAnfitrionaService {
    public List<Anfitriona> all();
    Anfitriona newAnfitriona(Anfitriona newAnfitriona);
    Anfitriona one(String dni_anfitriona);
    Anfitriona replaceAnfitriona(Anfitriona newAnfitriona, String dni_anfitriona);
    void deleteAnfitriona(String id);
}