package com.ivanqueiroz.templatemethod.java8;


public class MetodoAgilImpl implements MetodoLutaIf {

    @Override
    public String desafiarOponente() {
        return "Lutador de Sumô";
    }

    @Override
    public void socarOponente(String oponente) {
        LOGGER.info("Soco rápido na linha de cintura do {}", oponente);
    }

    @Override
    public void chutarOponente(String oponente) {
        LOGGER.info("Chute médio com duas pernas na linha dos pés do {}", oponente);
    }

    @Override
    public void atirarMagiaOponente(String oponente) {
        LOGGER.info("Chute do pássaro giratório no {}", oponente);
    }
    
}
