package com.ivanqueiroz.padroes.builder;

/**
 *
 * @author ivanqueiroz
 */
public enum Especialidade {

    ASSALTO, ENGENHEIRO, SUPORTE, BATEDOR;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
