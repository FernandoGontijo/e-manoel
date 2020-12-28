package com.devx.emanoel.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class CeminterioDTO implements Serializable {


    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private Integer telefone;
}
