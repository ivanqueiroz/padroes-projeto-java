package com.ivanqueiroz.templatemethod;

import com.ivanqueiroz.templatemethod.java8.LutadorAtual;
import com.ivanqueiroz.templatemethod.java8.MetodoAgilImpl;
import com.ivanqueiroz.templatemethod.java8.MetodoForcaBrutaImpl;

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
        
        LutadorAtual lutadorJava8 = new LutadorAtual();
        
        lutadorJava8.mudarMetodo(new MetodoAgilImpl());
        lutador.finalizar();
        
        lutadorJava8.mudarMetodo(new MetodoForcaBrutaImpl());
        

    }
}
