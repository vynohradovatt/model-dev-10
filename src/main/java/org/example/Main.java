package org.example;

import org.example.crud.ClientCrudService;
import org.example.crud.PlanetCrudService;
import org.example.hibernate.HibernateUtil;

public class Main {
    public static void main(String[] args) {


        ClientCrudService clientCrudService = new ClientCrudService();
        PlanetCrudService planetCrudService = new PlanetCrudService();


        clientCrudService.getClient(1L);
        clientCrudService.updateClient(9L, "UpdateClient");
        clientCrudService.createClient("TestClient");
        clientCrudService.deleteClient(11L);
        clientCrudService.getAllClient();

        planetCrudService.createPlanet("TST", "Test_Planet");
        planetCrudService.getPlanet("MRS");
        planetCrudService.updatePlanet("MRS", "TestP");
        planetCrudService.getAllPlanet();
        planetCrudService.deletePlanet("TST");
        planetCrudService.getAllPlanet();


        HibernateUtil.getInstance().close();

    }
}