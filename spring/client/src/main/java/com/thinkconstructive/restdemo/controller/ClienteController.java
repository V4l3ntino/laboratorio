package com.thinkconstructive.restdemo.controller;

import com.thinkconstructive.restdemo.model.entity.Cliente;
import com.thinkconstructive.restdemo.model.service.impl.ClienteServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client/")
public class ClienteController {

    ClienteServiceImpl object;

    public ClienteController(ClienteServiceImpl object) {
        this.object = object;
    }

    @GetMapping("{idCliente}")
    public Cliente getClient(@PathVariable String idCliente){
        return object.getCliente(idCliente);
    }

    @GetMapping()
    public List<Cliente> getClient(){
        return object.getAllCliente();
    }
    @PostMapping
    public String createCliente(@RequestBody Cliente objeto){
        object.createCliente(objeto);
        return "client created";
    }
    @DeleteMapping("{idCliente}")
    public String deleteCliente(@PathVariable String idCliente){
        object.deleteCliente(idCliente);
        return "client deleted";
    }
    @PutMapping
    public String modifyCliente(@RequestBody Cliente objeto){
        object.updateCliente(objeto);
        return "client asdfasdfs";
    }
}






