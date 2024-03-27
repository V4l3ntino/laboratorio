package com.thinkconstructive.restdemo.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "CLIENTES_DATOS")
public class  Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String Id;
    public String name;
    public String address;
    public String phone;

    @OneToMany(mappedBy = "cliente")
    private List<Pedidos> pedidos;

    @ManyToMany(
            fetch = FetchType.EAGER //.LAZY HACE QUE LOS DATOS DE LA LISTA SOLO SE VAN A CARGAR CUANDO SEA NECESARIO ACCEDER A LOS DATOS
// EL .EAGER HACE QUE LOS DATOS SE CARGEN SIMULTANEAMENTE CUANDO SE OBTENGA UN CLIENTE
    )
    @JoinTable(
            name = "usuario_rol",
            joinColumns = @JoinColumn(name = "cliente_id"),
            inverseJoinColumns = @JoinColumn(name = "rol_id")
    )
    private List<Roles> roles;

    @OneToOne
    @JoinColumn(name = "perfil_id")
    private Perfil perfil;

    public Cliente(){}
    public Cliente(String id, String name, String address, String phone) {
        Id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
