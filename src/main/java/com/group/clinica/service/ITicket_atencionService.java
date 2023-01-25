package com.group.clinica.service;

import java.util.List;
import com.group.clinica.model.*;

public interface ITicket_atencionService {
    public List<Ticket_atencion> all();
    Ticket_atencion newTicket_atencion(Ticket_atencion newTicket_atencion);
    Ticket_atencion one(String id);
    Ticket_atencion replaceTicket_atencion(Ticket_atencion newTicket_atencion, String id);
    void deleteTicket_atencion(String id);
}