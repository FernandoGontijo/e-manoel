package model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TB_FUNERARIA")
public class Funeraria {

    @Id
    @Column(name="ID_FUNERARIA")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long id;

    @Column(name="NOME")
    private String nome;

    @Column(name="TELEFONE")
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
