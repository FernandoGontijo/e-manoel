package com.devx.emanoel.model;

import javax.persistence.*;

@Entity
@Table(name="TB_PARENTESCO")
public class Parentesco {

    @Id
    @Column(name="ID_PARENTESCO", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="DESCRICAO", length = 45, nullable = false)
    private String descricao;

    @ManyToOne
    private Pessoa pessoa;

    @ManyToOne
    private Falecido falecido;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Falecido getFalecido() {
        return falecido;
    }

    public void setFalecido(Falecido falecido) {
        this.falecido = falecido;
    }


}
