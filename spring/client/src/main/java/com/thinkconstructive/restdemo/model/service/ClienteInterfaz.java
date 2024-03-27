package com.thinkconstructive.restdemo.model.service;

import com.thinkconstructive.restdemo.model.entity.Cliente;

import java.util.List;

public interface ClienteInterfaz {
    public void createCliente(Cliente cliente);
    public void updateCliente(Cliente cliente);
    public void deleteCliente(String idCliente);
    public Cliente getCliente(String idCliente);
    public List<Cliente> getAllCliente();
}
