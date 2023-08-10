package org.example.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="planet")
@Data
public class Planet {

    @Id
    @Column(name="id")
    private String id;

    @Column(name = "name")
    private String name;
}
