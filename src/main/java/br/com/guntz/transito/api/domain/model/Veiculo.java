package br.com.guntz.transito.api.domain.model;

import br.com.guntz.transito.api.model.input.VeiculoInputModel;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.time.OffsetDateTime;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@NoArgsConstructor
@Entity(name = "tb_veiculo")
public class Veiculo {

    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @ManyToOne
    private Proprietario proprietario;

    @Column(length = 150)
    private String marca;

    @Column(length = 150)
    private String modelo;

    @Column(length = 8, unique = true)
    private String placa;

    @Column(length = 20)
    @Enumerated(EnumType.STRING)
    private SituacaoVeiculo situacaoVeiculo = SituacaoVeiculo.REGULAR;

    private OffsetDateTime dataCadastro;

    private OffsetDateTime dataApreensao;

    public Veiculo(VeiculoInputModel veiculoInputModel) {
        BeanUtils.copyProperties(veiculoInputModel, this);
        proprietario = new Proprietario(veiculoInputModel.getProprietario());
    }
}
