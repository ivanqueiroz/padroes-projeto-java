package com.ivanqueiroz.padroes.nullobject;

/**
 *
 * @author Ivan Queiroz <ivanqueiroz@gmail.com>
 */
public abstract class Rota {

    abstract String getNome();
    abstract int getTamanhoRota();
    abstract Rota getEsquerda();
    abstract Rota getDireita();
    abstract void acelerar();

}
