package com.thinkconstructive.restdemo.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Perfil")
public class Perfil {
    @Id
    private int id;
    @OneToOne(mappedBy = "perfil")
    private Cliente cliente;
}
