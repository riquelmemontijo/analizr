package br.com.analizr.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "documento")
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String codigo;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    public enum Tipo {
        CPF,
        CNPJ
    }

}
