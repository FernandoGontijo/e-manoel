package com.devx.emanoel.dto;

import com.devx.emanoel.model.Falecido;
import com.devx.emanoel.model.Pessoa;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class ParentescoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String descricao;
    private Pessoa pessoa;
    private Falecido falecido;

}
