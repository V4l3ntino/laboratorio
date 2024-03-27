package com.thinkconstructive.restdemo.model.service.impl;

import com.thinkconstructive.restdemo.model.entity.Cliente;
import com.thinkconstructive.restdemo.model.service.ClienteInterfaz;
import com.thinkconstructive.restdemo.model.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteInterfaz {
    ClienteRepository object;

    public ClienteServiceImpl(ClienteRepository object) {
        this.object = object;
    }

    @Override
    public void createCliente(Cliente cliente) {
        object.save(cliente);
    }

    @Override
    public void updateCliente(Cliente cliente) {
        object.save(cliente);
    }

    @Override
    public void deleteCliente(String idCliente) {
        object.deleteById(idCliente);
    }

    @Override
    public Cliente getCliente(String idCliente) {
        return object.findById(idCliente).get();
    }

    @Override
    public List<Cliente> getAllCliente() {
        return object.findAll();
    }
}
