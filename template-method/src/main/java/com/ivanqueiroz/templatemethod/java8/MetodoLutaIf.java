package com.ivanqueiroz.templatemethod.java8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Ivan Queiroz <ivanqueiroz@gmail.com>
 */
public interface MetodoLutaIf {
    
    static final Logger LOGGER = LoggerFactory.getLogger(MetodoLutaIf.class);
    
    public String desafiarOponente();

    public void socarOponente(String oponente);

    public void chutarOponente(String oponente);

    public void atirarMagiaOponente(String oponente);
    
    public default void finalizar(){
        
        String oponente = desafiarOponente();
        LOGGER.info("Lutador desafiado: {}.", oponente);
        socarOponente(oponente);
        chutarOponente(oponente);
        atirarMagiaOponente(oponente);
        
    }
}
