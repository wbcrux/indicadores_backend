package br.gov.es.indicadores.service;

// import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.es.indicadores.dto.IndicadoresGeraisDto;
import br.gov.es.indicadores.model.Administration;
import br.gov.es.indicadores.repository.AdministrationRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class HomeService {

    @Autowired
    private AdministrationRepository administrationRepository;

    // @Autowired
    // private final LocalDate dataAtual;
    
    public IndicadoresGeraisDto getData(){

        // Number year = dataAtual.getYear();
        Number year = 2024;

        Administration administrationData = administrationRepository.getAdministrationByYear(year);

        return fitIndicator(administrationData);
    }

    private IndicadoresGeraisDto fitIndicator(Administration administrationData){
        IndicadoresGeraisDto indicator = IndicadoresGeraisDto.builder()
                                            .name(administrationData.getName())
                                            .build();

        return indicator;
    }
}
