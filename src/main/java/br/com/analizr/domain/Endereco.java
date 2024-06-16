package br.com.analizr.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,
            length = 150)
    private String logradouro;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false,
            length = 100)
    private String complemento;

    @Column(nullable = false,
            length = 50)
    private String bairro;

    @Column(nullable = false,
            length = 100)
    private String cep;

}
