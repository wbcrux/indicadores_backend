package br.gov.es.indicadores.dto;

import lombok.Builder;

@Builder
public record IndicadoresGeraisDto(
    String name,
    Boolean status,
    Number startYear,
    Number endYear,
    Number referenceYear,
    String description,
    OverviewIndicadoresGeraisDto overview
) {

    public IndicadoresGeraisDto() {
        this(null, null, null, null, null, null, null);
    }
}

final record OverviewIndicadoresGeraisDto(
    String areasEstrategicas,
    String desafios,
    String indicadores
) {}

