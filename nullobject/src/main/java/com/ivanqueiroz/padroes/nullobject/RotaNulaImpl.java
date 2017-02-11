package com.ivanqueiroz.padroes.nullobject;

public class RotaNulaImpl extends Rota {

    private static final RotaNulaImpl INSTANCIA = new RotaNulaImpl();

    public static RotaNulaImpl getInstancia() {
        return INSTANCIA;
    }

    @Override
    String getNome() {
         return "";
    }

    @Override
    int getTamanhoRota() {
        return 0;
    }

    @Override
    Rota getEsquerda() {
        return null;
    }

    @Override
    Rota getDireita() {
        return null;
    }

    @Override
    void acelerar() {
    }

}
