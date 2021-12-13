package org.example.marvel.api.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;


@Entity
@Cacheable
public class Character extends PanacheEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public long id;

    @Column(name = "marvel_id")
    public int marvelId;

    @Column(name = "name")
    public String name;
}
