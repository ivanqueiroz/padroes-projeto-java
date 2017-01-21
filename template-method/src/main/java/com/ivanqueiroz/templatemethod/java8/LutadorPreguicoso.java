package com.ivanqueiroz.templatemethod.java8;

/**
 *
 * @author Ivan Queiroz <ivanqueiroz@gmail.com>
 */
public class LutadorPreguicoso {
    
    private MetodoXiterIf metodoXiter;
    
    public LutadorPreguicoso() {
    }

    public void mudarMetodo(MetodoXiterIf metodo) {
        this.metodoXiter = metodo;
    }

    public void finalizar() {
        metodoXiter.finalizar();
    }
    
}
