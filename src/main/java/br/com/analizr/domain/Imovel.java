package br.com.analizr.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "imovel")
public class Imovel implements Garantia{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,
            length = 100)
    private String descricao;

    @Column(nullable = false)
    private BigDecimal valorAvaliado;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_endereco",
                referencedColumnName = "id",
                foreignKey = @ForeignKey(name = "fk_endereco_imovel"))
    private Endereco endereco;

    @Override
    public BigDecimal getValorAvaliado() {
        return valorAvaliado;
    }

}
