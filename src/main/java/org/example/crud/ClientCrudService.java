package org.example.crud;

import org.example.entity.Client;
import org.example.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;


public class ClientCrudService {

    private static final Session SESSION = HibernateUtil.getInstance().getSessionFactory().openSession();
    private static Transaction TRANSACTION = SESSION.beginTransaction();

    public void createClient(String name) {
        Client client = new Client();
        client.setName(name);
        SESSION.persist(client);
        TRANSACTION.commit();
    }

    public Client getClient(long id) {
        Client client = SESSION.get(Client.class, id);
        return client;
    }

    public void getAllClient() {
        List<Client> clientList = SESSION.createQuery("from Client", Client.class).list();
        clientList.forEach(client -> System.out.println("client list ==> " + client));
    }

    public void updateClient(long id, String name) {
        Client updateClient = SESSION.get(Client.class, id);
        updateClient.setName(name);
        SESSION.persist(updateClient);
    }

    public void deleteClient(long id) {

        try {
            TRANSACTION = SESSION.beginTransaction();
            Client client = SESSION.get(Client.class, id);
            if (client != null) {
                SESSION.remove(client);
                TRANSACTION.commit();
            } else {
                System.out.println("Client with ID " + id + " not found.");
                TRANSACTION.rollback();
            }
        } catch (Exception e) {
            if (TRANSACTION != null) {
                TRANSACTION.rollback();
            }
            e.printStackTrace();
        }
    }

}

