package com.ivanqueiroz.templatemethod;

/**
 *
 * @author Ivan Queiroz <ivanqueiroz@gmail.com>
 */
public class Aplicacao {

    public static void main(String[] args) {
        Lutador lutador = new Lutador();
        lutador.mudarMetodo(new MetodoForcaBruta());
        lutador.finalizar();
        
        lutador.mudarMetodo(new MetodoAgil());
        lutador.finalizar();
        

    }
}
