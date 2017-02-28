package com.ivanqueiroz.padroes.builder;

/**
 *
 * @author ivanqueiroz
 */
public enum ArmaSecundaria {

    PISTOLA, REVOLVER, SUB_METRALHADORA, FACA;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}