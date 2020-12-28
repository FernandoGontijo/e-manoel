package com.devx.emanoel.model;

import javax.persistence.*;

@Entity
@Table(name="TB_FUNERARIA")
public class Funeraria {

    @Id
    @Column(name="ID_FUNERARIA", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="NOME", length = 45, nullable = false)
    private String nome;

    @Column(name="TELEFONE", nullable = false)
    private Integer telefone;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }


}
