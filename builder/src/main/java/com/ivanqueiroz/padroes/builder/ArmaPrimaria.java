package com.ivanqueiroz.padroes.builder;

/**
 *
 * @author ivanqueiroz
 */
public enum ArmaPrimaria {
    METRALHADORA, FUZIL, RIFLE, ESCOPETA;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
