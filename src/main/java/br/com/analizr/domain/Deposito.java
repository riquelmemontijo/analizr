package br.com.analizr.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "deposito")
public class Deposito implements Garantia{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,
            length = 100)
    private String descricao;

    @Column(nullable = false)
    private BigDecimal valorAvaliado;

    @Override
    public BigDecimal getValorAvaliado() {
        return this.valorAvaliado;
    }
}
