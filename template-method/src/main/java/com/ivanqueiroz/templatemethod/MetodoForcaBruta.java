package com.ivanqueiroz.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Ivan Queiroz <ivanqueiroz@gmail.com>
 */
public class MetodoForcaBruta extends MetodoLuta {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(MetodoForcaBruta.class);
    
    @Override
    protected String desafiarOponente() {
        return "Lutador de Karatê Milenar";
    }
    
    @Override
    protected void socarOponente(String oponente) {
        LOGGER.info("Soco forte no {} pelo alto.", oponente);
    }
    
    @Override
    protected void chutarOponente(String oponente) {
        LOGGER.info("Chute forte giratório no ar em direção ao {}", oponente);
    }
    
    @Override
    protected void atirarMagiaOponente(String oponente) {
        LOGGER.info("Hadounken de fogo no {}", oponente);
    }
    
}
