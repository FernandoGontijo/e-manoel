package com.devx.emanoel.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="TB_VELORIO")
public class Velorio {

    @Id
    @Column(name="ID_VELORIO", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name = "ENTRADA", nullable = false)
    private Date entrada;

    @Column(name = "SAIDA", nullable = false)
    private Date saida;

    @Column(name = "ADICIONAL", length = 45)
    private String adicional;

    @Column(name = "ALUGUEL",nullable = false)
    private Double aluguel;

    @ManyToOne
    private Pessoa pessoa;

    @ManyToOne
    private Falecido falecido;

    @ManyToOne
    private Sala sala;

    @ManyToOne
    private Ceminterio ceminterio;

    @ManyToOne
    private Funeraria funeraria;

    @ManyToOne
    private Funcionario funcionario;

    @ManyToOne
    private Pagamento pagamento;

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

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Ceminterio getCeminterio() {
        return ceminterio;
    }

    public void setCeminterio(Ceminterio ceminterio) {
        this.ceminterio = ceminterio;
    }

    public Funeraria getFuneraria() {
        return funeraria;
    }

    public void setFuneraria(Funeraria funeraria) {
        this.funeraria = funeraria;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public String getAdicional() {
        return adicional;
    }

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

    public Double getAluguel() {
        return aluguel;
    }

    public void setAluguel(Double aluguel) {
        this.aluguel = aluguel;
    }



}
