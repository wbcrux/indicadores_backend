package br.gov.es.indicadores.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.annotation.Id;

public abstract class Entity {

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
