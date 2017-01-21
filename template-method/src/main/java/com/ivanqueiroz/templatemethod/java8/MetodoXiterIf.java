package com.ivanqueiroz.templatemethod.java8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Ivan Queiroz <ivanqueiroz@gmail.com>
 */
public interface MetodoXiterIf {

    static final Logger LOGGER = LoggerFactory.getLogger(MetodoXiterIf.class);

    public String desafiarOponente();

    public default void soltarMagiaEmCima() {
        LOGGER.info("Hadouken na cara de {}", desafiarOponente());
    }

    public default void soltarMagiaEmbaixo() {
        LOGGER.info("Hadouken nas pernas de {}", desafiarOponente());
    }

    public default void soltarMagiaNoAr() {
        LOGGER.info("Hadouken na cabeça de {}", desafiarOponente());
    }

    public default void finalizar() {
        LOGGER.info("Lutador desafiado: {}.", desafiarOponente());
        soltarMagiaEmCima();
        soltarMagiaEmbaixo();
        soltarMagiaNoAr();
    }

}
