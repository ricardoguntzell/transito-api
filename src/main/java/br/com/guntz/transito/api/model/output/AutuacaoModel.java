package br.com.guntz.transito.api.model.output;

import br.com.guntz.transito.api.domain.model.Autuacao;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter
@Setter
public class AutuacaoModel {

    private Long id;

    private String descricao;

    private BigDecimal valorMulta;

    private OffsetDateTime dataOcorrencia;

    public AutuacaoModel(Autuacao autuacao) {
        BeanUtils.copyProperties(autuacao, this);
    }
}