package model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TB_SALA")
public class Sala {

    @Id
    @Column(name="ID_SALA")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long id;

    @Column(name="DESCRICAO")
    private String descricao;

    @Column(name="PRECO")
    private Double preco;


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


}
