package br.com.analizr.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,
            length = 100)
    private String nome;

    @OneToOne
    @JoinColumn(name = "id_documento",
                referencedColumnName = "id",
                foreignKey = @ForeignKey(name = "fk_documento_cliente"))
    private Documento documento;

    @Column(length = 50)
    private String email;

    @Column(nullable = false)
    private BigDecimal rendaMensal;

    @Column(nullable = false)
    private BigDecimal rendaComprometida;

    @Enumerated(EnumType.STRING)
    private Status status;

    public enum Status {
        INADIMPLENTE,
        INATIVO,
        ATIVO
    }

}
