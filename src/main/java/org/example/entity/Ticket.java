package org.example.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="ticket")

public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="created_at")
    private Timestamp created_at;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable=false)
    private Client client;

    @ManyToOne
    @JoinColumn(name="from_planet_id", nullable=false)
    private Planet from_planet;

    @ManyToOne
    @JoinColumn(name="to_planet_id", nullable=false)
    private Planet to_planet;

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setFrom_planet(Planet from_planet) {
        this.from_planet = from_planet;
    }

    public void setTo_planet(Planet to_planet) {
        this.to_planet = to_planet;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", created_at=" + created_at +
                ", client=" + client +
                ", from_planet=" + from_planet +
                ", to_planet=" + to_planet +
                '}';
    }
}
