package com.thinkconstructive.restdemo.model.repository;

import com.thinkconstructive.restdemo.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
}
