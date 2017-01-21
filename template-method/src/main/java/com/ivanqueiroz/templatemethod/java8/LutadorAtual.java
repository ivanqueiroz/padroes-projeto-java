package com.ivanqueiroz.templatemethod.java8;

/**
 *
 * @author Ivan Queiroz <ivanqueiroz@gmail.com>
 */
public class LutadorAtual {

    private MetodoLutaIf metodo;

    public LutadorAtual() {
    }

    public void mudarMetodo(MetodoLutaIf metodo) {
        this.metodo = metodo;
    }

    public void finalizar() {
        metodo.finalizar();
    }
}
