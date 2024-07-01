package br.gov.es.indicadores.model;

import java.io.Serializable;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class ODSGoal extends Entity implements Serializable {

    @Relationship(type = "TARGETS", direction = Relationship.OUTGOING)
    private ODS ods;
    
}
