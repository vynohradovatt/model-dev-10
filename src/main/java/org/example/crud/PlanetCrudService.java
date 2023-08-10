package org.example.crud;

import org.example.entity.Planet;
import org.example.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PlanetCrudService {
    private static final Session SESSION = HibernateUtil.getInstance().getSessionFactory().openSession();
    private static Transaction TRANSACTION = SESSION.beginTransaction();

    public void createPlanet(String id, String name){
        Planet planet = new Planet();
        planet.setId(id);
        planet.setName(name);
        SESSION.persist(planet);
        TRANSACTION.commit();
    }

    public void getPlanet(String  id){
        Planet planet = SESSION.get(Planet.class,id);
        System.out.println("planet = " + planet);
    }

    public void getAllPlanet(){
        List<Planet> planetList = SESSION.createQuery("from Planet", Planet.class).list();
        planetList.forEach(planet -> System.out.println("planet list ==> " + planet));

    }

    public void updatePlanet(String id, String  name){
        Planet planet= SESSION.get(Planet.class,id);
        planet.setId(id);
        planet.setName(name);
        SESSION.persist(planet);
    }

    public void deletePlanet(String id){
        try {
            TRANSACTION = SESSION.beginTransaction();
            Planet planet = SESSION.get(Planet.class, id);
            SESSION.remove(planet);
            TRANSACTION.commit();
        } catch (Exception e) {
            if (TRANSACTION != null) {
                TRANSACTION.rollback();
            }
            e.printStackTrace();
        }
    }

}
