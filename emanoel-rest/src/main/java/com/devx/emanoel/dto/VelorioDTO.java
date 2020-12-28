package com.devx.emanoel.dto;

import com.devx.emanoel.model.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class VelorioDTO implements Serializable {


    private static final long serialVersionUID = 1L;

    private Long id;
    private Date entrada;
    private Date saida;
    private String adicional;
    private Double aluguel;
    private Pessoa pessoa;
    private Falecido falecido;
    private Sala sala;
    private Ceminterio ceminterio;
    private Funeraria funeraria;
    private Funcionario funcionario;
    private Pagamento pagamento;

}
