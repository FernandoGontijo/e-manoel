package model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TB_FUNCIONARIO")
public class Funcionario {

    @Id
    @Column(name="ID_FUNCIONARIO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long id;

    @Column(name="LOGIN")
    private String login;

    @Column(name="SENHA")
    private String senha;

    @Column(name="CARGO")
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
