package com.thinkconstructive.restdemospringweb.modelo.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "LIBRO")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;
    private String titulo;
    @ManyToMany(
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "Autor_Libro",
            joinColumns = @JoinColumn(name = "id_autor"),
            inverseJoinColumns = @JoinColumn(name = "id_libro")
    )
    private List<Autor> autores;

    public Libro(){}

    public Libro(Integer codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
