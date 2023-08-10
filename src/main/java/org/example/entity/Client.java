package org.example.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="client")
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

}
