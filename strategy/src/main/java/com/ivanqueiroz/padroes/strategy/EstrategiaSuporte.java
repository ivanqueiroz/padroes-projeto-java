package com.ivanqueiroz.padroes.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EstrategiaSuporte implements EstrategiaAgente {

    final static Logger LOGGER = LoggerFactory.getLogger(EstrategiaSuporte.class);

    @Override
    public void executar() {
        LOGGER.info("Esperar feridos e ajudar.");
    }

}
