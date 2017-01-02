package com.ivanqueiroz.padroes.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EstrategiaEngenharia implements EstrategiaAgente {

    final static Logger LOGGER = LoggerFactory.getLogger(EstrategiaEngenharia.class);

    @Override
    public void executar() {
        combaterComoEngenheiro();
    }
    
    public static void combaterComoEngenheiro(){
        LOGGER.info("Armar torreta, jogar granadas de efeito e plantar minas.");
    }

}
