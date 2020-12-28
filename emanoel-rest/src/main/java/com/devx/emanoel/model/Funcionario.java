package com.devx.emanoel.model;


import javax.persistence.*;

@Entity
@Table(name="TB_FUNCIONARIO")
public class Funcionario {

    @Id
    @Column(name="ID_FUNCIONARIO", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="LOGIN", length = 45, nullable = false)
    private String login;

    @Column(name="SENHA", length = 45, nullable = false)
    private String senha;

    @Column(name="CARGO", length = 45, nullable = false)
    private String cargo;

    @ManyToOne
    private Pessoa pessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}

