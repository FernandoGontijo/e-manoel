package com.devx.emanoel.model;

import javax.persistence.*;

@Entity
@Table(name="TB_FALECIDO")
public class Falecido {

    @Id
    @Column(name="ID_FALECIDO", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="NOME", length = 45, nullable = false)
    private String nome;

    @Column(name="IDADE", nullable = false)
    private Integer idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

}