package com.devx.emanoel.model;

import javax.persistence.*;

@Entity
@Table(name="TB_PESSOA")
public class Pessoa {

    @Id
    @Column(name="ID_PESSOA",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="NOME", length = 45, nullable = false)
    private String nome;

    @Column(name="CPF", length = 14, nullable = false)
    private String cpf;

    @Column(name="RG", length = 14)
    private String rg;

    @Column(name="ENDERECO", length = 80)
    private String endereco;

    @Column(name="TELEFONE", nullable = false)
    private Integer telefone;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

}
