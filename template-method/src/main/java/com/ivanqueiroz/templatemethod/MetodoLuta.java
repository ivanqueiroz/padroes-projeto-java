package com.ivanqueiroz.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Ivan Queiroz <ivanqueiroz@gmail.com>
 */
public abstract class MetodoLuta {

    private static final Logger LOGGER = LoggerFactory.getLogger(MetodoLuta.class);

    public MetodoLuta() {
    }

    protected abstract String desafiarOponente();

    protected abstract void socarOponente(String oponente);

    protected abstract void chutarOponente(String oponente);

    protected abstract void atirarMagiaOponente(String oponente);

    public void finalizar() {

        String oponente = desafiarOponente();
        LOGGER.info("Lutador desafiado: {}.", oponente);
        socarOponente(oponente);
        chutarOponente(oponente);
        atirarMagiaOponente(oponente);

    }

}
