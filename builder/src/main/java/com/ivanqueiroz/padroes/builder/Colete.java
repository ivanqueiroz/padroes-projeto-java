package com.ivanqueiroz.padroes.builder;

/**
 *
 * @author ivanqueiroz
 */
public enum Colete {
    KEVLAR, CERAMICO, ACO, ALUMINIO;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
