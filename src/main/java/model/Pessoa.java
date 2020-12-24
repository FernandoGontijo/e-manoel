package model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TB_PESSOA")
public class Pessoa {

    @Id
    @Column(name="ID_PESSOA")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long id;

    @Column(name="NOME")
    private String nome;

    @Column(name="CPF")
    private String cpf;

    @Column(name="RG")
    private String rg;

    @Column(name="ENDERECO")
    private String endereco;

    @Column(name="TELEFONE")
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
