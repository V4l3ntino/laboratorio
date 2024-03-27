package com.thinkconstructive.restdemo.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "PedidosUPDATE")
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
