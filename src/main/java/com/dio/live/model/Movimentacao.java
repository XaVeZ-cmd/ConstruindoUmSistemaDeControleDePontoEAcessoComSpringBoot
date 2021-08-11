package com.dio.live.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movimentacao {
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable //Utilizar para chaves primárias compostas
    public class MovimentacaoId implements Serializable{
        private long idMovimento;
        private long idUsuario;
    }
    @Id
    @EmbeddedId //Faz referência a classe que compõe a chave primária composta
    private MovimentacaoId id; // A classe embutida entra como um objeto id para a classe principal
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Calendario calendario;
}
