package com.devx.emanoel.model;

import javax.persistence.*;

@Entity
@Table(name="TB_PAGAMENTO")
public class Pagamento {

    @Id
    @Column(name="ID_PAGAMENTO", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="DESCRICAO", length = 45, nullable = false)
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}

