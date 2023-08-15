package org.example.crud;

import org.example.entity.Client;
import org.example.entity.Planet;
import org.example.entity.Ticket;
import org.example.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Timestamp;
import java.util.List;

public class TicketCrudService {
    private static final Session SESSION = HibernateUtil.getInstance().getSessionFactory().openSession();
    private static Transaction TRANSACTION = SESSION.beginTransaction();

    public void addTicket(Timestamp created_time, Client client, Planet fromPlanet, Planet toPlanet) {

            Ticket addNewTicket = new Ticket();
            addNewTicket.setCreated_at(created_time);
            addNewTicket.setClient(client);
            addNewTicket.setFrom_planet(fromPlanet);
            addNewTicket.setTo_planet(toPlanet);
            SESSION.persist(addNewTicket);
            TRANSACTION.commit();

    }

        public void getTicket (long id){
            Ticket ticket = SESSION.get(Ticket.class, id);
            System.out.println("ticket = " + ticket);
        }

        public void getAllTicket () {
            List<Ticket> ticketList = SESSION.createQuery("from Ticket", Ticket.class).list();
            ticketList.forEach(ticket -> System.out.println("ticket list ==> " + ticket));
        }

        public void updateTicket ( long id_ticket, Planet from_planet, Planet to_planet){
            Ticket ticket = SESSION.get(Ticket.class, id_ticket);
            ticket.setFrom_planet(from_planet);
            ticket.setTo_planet(to_planet);
            SESSION.persist(ticket);
        }

        public void deleteTicket ( long id){
            try {
                TRANSACTION = SESSION.beginTransaction();
                Ticket ticket = SESSION.get(Ticket.class, id);
                SESSION.remove(ticket);
                TRANSACTION.commit();
            } catch (Exception e) {
                if (TRANSACTION != null) {
                    TRANSACTION.rollback();
                }
                e.printStackTrace();
            }
        }

    }


