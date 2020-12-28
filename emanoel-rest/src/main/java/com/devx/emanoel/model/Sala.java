package com.devx.emanoel.model;

import javax.persistence.*;

@Entity
@Table(name="TB_SALA")
public class Sala {

    @Id
    @Column(name="ID_SALA", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="DESCRICAO", length = 45, nullable = false)
    private String descricao;

    @Column(name="PRECO", nullable = false)
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
