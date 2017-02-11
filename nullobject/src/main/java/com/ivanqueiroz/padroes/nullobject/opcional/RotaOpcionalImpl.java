package com.ivanqueiroz.padroes.nullobject.opcional;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RotaOpcionalImpl extends RotaOpcional {

    private static final Logger LOGGER = LoggerFactory.getLogger(RotaOpcionalImpl.class);

    private final String nome;
    private final Optional<RotaOpcional> direita;
    private final Optional<RotaOpcional> esquerda;

    public RotaOpcionalImpl(String nome, Optional<RotaOpcional> direita, Optional<RotaOpcional> esquerda) {
        this.nome = nome;
        this.direita = direita;
        this.esquerda = esquerda;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int getTamanhoRota() {
        return 1 + (direita.isPresent() ? direita.get().getTamanhoRota() : 0) + (esquerda.isPresent() ? esquerda.get().getTamanhoRota() : 0);
    }

    @Override
    public Optional<RotaOpcional> getEsquerda() {
        return esquerda;
    }

    @Override
    public Optional<RotaOpcional> getDireita() {
        return direita;
    }

    @Override
    public void acelerar() {
        LOGGER.info(nome);
        
        esquerda.filter(r -> r.getTamanhoRota() > 0)
                .ifPresent(RotaOpcional::acelerar);
        
        direita.filter(r -> r.getTamanhoRota() > 0)
                .ifPresent(RotaOpcional::acelerar);

    }

}
