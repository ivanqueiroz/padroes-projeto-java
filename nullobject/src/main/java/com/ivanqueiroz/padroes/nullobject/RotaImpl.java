package com.ivanqueiroz.padroes.nullobject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RotaImpl extends Rota {

    private static final Logger LOGGER = LoggerFactory.getLogger(RotaImpl.class);

    private final String nome;
    private final Rota direita;
    private final Rota esquerda;

    public RotaImpl(String nome, Rota esquerda, Rota direita) {
        this.nome = nome;
        this.direita = direita;
        this.esquerda = esquerda;
    }

    @Override
    String getNome() {
        return this.nome;
    }

    @Override
    int getTamanhoRota() {
        return 1 + direita.getTamanhoRota() + esquerda.getTamanhoRota();
    }

    @Override
    Rota getEsquerda() {
        return esquerda;
    }

    @Override
    Rota getDireita() {
        return direita;
    }

    @Override
    void acelerar() {
        LOGGER.info(nome);
        if (esquerda.getTamanhoRota() > 0) {
            esquerda.acelerar();
        }
        if (direita.getTamanhoRota() > 0) {
            direita.acelerar();
        }
    }

}
