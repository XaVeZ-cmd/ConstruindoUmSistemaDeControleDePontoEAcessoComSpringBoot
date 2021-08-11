package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter //embute os getters
@Setter //embute os setters
@AllArgsConstructor //embute os construtores com argumentos
@NoArgsConstructor //embute o contrutor sem argumento
@EqualsAndHashCode //embute os equals e hashcode
@Builder //acessa o objeto diretamente
@Entity
@Audited
public class CategoriaUsuario {
    @Id
    private long id;
    private String descricao;
}

