package com.ivanqueiroz.templatemethod;

/**
 *
 * @author Ivan Queiroz <ivanqueiroz@gmail.com>
 */
public class Lutador {

    private MetodoLuta metodo;

    public Lutador() {
    }

    public void mudarMetodo(MetodoLuta metodo) {
        this.metodo = metodo;
    }

    public void finalizar() {
        metodo.finalizar();
    }
}
