package com.ivanqueiroz.padroes.builder;

/**
 *
 * @author ivanqueiroz
 */
public enum Aparelhos {
    FLASHBANG, STUN, C4, SMOKE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
