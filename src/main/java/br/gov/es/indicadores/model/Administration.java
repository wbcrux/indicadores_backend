package br.gov.es.indicadores.model;

import java.io.Serializable;

import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Administration extends Entity implements Serializable {
    
    private String name;

    private Boolean status;

    private Number startYear;

    private Number endYear;

    private Number referenceYear;

    private String description;

    public Administration(){
    }

    public Number getEndYear() {
        return endYear;
    }
    public String getName() {
        return name;
    }
    public Number getReferenceYear() {
        return referenceYear;
    }
    public String getDescription() {
        return description;
    }
    public Number getStartYear() {
        return startYear;
    }
    public Boolean getStatus() {
        return status;
    }


}
