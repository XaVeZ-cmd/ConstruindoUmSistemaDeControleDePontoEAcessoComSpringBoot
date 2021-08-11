package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Getter //embute os getters
@Setter //embute os setters
@AllArgsConstructor //embute os construtores com argumentos
@NoArgsConstructor //embute o contrutor sem argumento
@EqualsAndHashCode //embute os equals e hashcode
@Builder //acessa o objeto diretamente
@Entity
@Audited //se auditar tabelas com chaves primárias compostas, tem que colocar o @Audited em todas
public class JornadaTrabalho {
    @Id
    @GeneratedValue
    private long id;
    private String descricao;
}
