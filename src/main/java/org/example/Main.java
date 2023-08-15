package org.example;

import org.example.crud.ClientCrudService;
import org.example.crud.PlanetCrudService;
import org.example.crud.TicketCrudService;
import org.example.hibernate.HibernateUtil;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        ClientCrudService client = new ClientCrudService();
        PlanetCrudService planet_from = new PlanetCrudService();
        PlanetCrudService planet_to = new PlanetCrudService();


        TicketCrudService new_ticket = new TicketCrudService();

        new_ticket.addTicket(
                Timestamp.valueOf(LocalDateTime.now()),
                client.getClient(1L),
                planet_from.getPlanet("VNS"),
                planet_to.getPlanet("MRS")
        );

        new_ticket.updateTicket(1L, planet_from.getPlanet("VNS"), planet_to.getPlanet("MRS"));

        new_ticket.deleteTicket(9L);

        new_ticket.getAllTicket();

        new_ticket.getTicket(1L);

        HibernateUtil.getInstance().close();

    }
}