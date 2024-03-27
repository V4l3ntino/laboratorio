package com.thinkconstructive.restdemo.model.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "Roles")
public class Roles {
    @Id
    private int Id;
    @ManyToMany(mappedBy = "roles")
    private List<Cliente> clientes;
}
