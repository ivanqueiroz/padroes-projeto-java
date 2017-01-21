package com.ivanqueiroz.templatemethod.java8;

public class MetodoForcaBrutaImpl implements MetodoLutaIf {

    @Override
    public String desafiarOponente() {
        return "Lutador de Karatê Milenar";
    }

    @Override
    public void socarOponente(String oponente) {
        LOGGER.info("Soco forte no {} pelo alto.", oponente);
    }

    @Override
    public void chutarOponente(String oponente) {
        LOGGER.info("Chute forte giratório no ar em direção ao {}", oponente);
    }

    @Override
    public void atirarMagiaOponente(String oponente) {
        LOGGER.info("Hadounken de fogo no {}", oponente);
    }

}
