package model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TB_PARENTESCO")
public class Parentesco {

    @Id
    @Column(name="ID_PARENTESCO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long id;

    @Column(name="DESCRICAO")
    private String descricao;
}
