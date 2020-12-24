package model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="TB_VELORIO")
public class Velorio {

    @Id
    @Column(name="ID_VELORIO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long id;

    @Column(name = 'ENTRADA')
    private Date entrada;

    @Column(name = 'SAIDA')
    private Date saida;

    @Column(name = 'ADICIONAL')
    private String adicional;

    @Column(name = 'ALUGUEL')
    private Double aluguel;


}
