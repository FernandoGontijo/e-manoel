package com.devx.emanoel.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class SalaDTO implements Serializable {


    private static final long serialVersionUID = 1L;

    private Long id;
    private String descricao;
    private Double preco;



}
