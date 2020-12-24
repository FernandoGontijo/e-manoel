package model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TB_FALECIDO")
public class Falecido {

    @Id
    @Column(name="ID_FALECIDO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long id;

    @Column(name="NOME")
    private String nome;

    @Column(name="IDADE")
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
