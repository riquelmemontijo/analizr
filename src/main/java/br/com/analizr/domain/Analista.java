package br.com.analizr.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "analista")
public class Analista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,
            length = 100)
    private String nome;

    @Column(nullable = false,
            length = 50)
    private String email;

}
