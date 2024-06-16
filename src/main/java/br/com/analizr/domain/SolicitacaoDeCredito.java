package br.com.analizr.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "solicitacao_de_credito")
public class SolicitacaoDeCredito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_cliente",
                referencedColumnName = "id",
                foreignKey = @ForeignKey(name = "fk_cliente_solicitacao"))
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_analista",
                referencedColumnName = "id",
                foreignKey = @ForeignKey(name = "fk_cliente_solicitacao"))
    private Analista analista;

    @Column(nullable = false)
    private BigDecimal valorSolicitado;

    @Enumerated(EnumType.STRING)
    private Parecer parecer;

    public enum Parecer {
        REJEITADO,
        ACEITO,
        ACEITO_COM_REDUCAO
    }

}
