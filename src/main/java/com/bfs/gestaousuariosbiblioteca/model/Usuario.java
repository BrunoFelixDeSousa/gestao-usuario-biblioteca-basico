package com.bfs.gestaousuariosbiblioteca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private Integer quantidadeLivros;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeLivros() {
        return quantidadeLivros;
    }

    public void setQuantidadeLivros(Integer quantidadeDeLivros) {
        this.quantidadeLivros = quantidadeDeLivros;
    }
}
