package com.ivanqueiroz.padroes.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Ivan Queiroz <ivanqueiroz@gmail.com>
 */
public class Aplicacao {

    final static Logger LOGGER = LoggerFactory.getLogger(Aplicacao.class);
    
    public static void combaterComoLinhaDeFrente(){
         LOGGER.info("Segurar escudo e invadir.");
    }
    
    public static void combaterComoEngenheiro(){
        LOGGER.info("Armar torreta, jogar granadas de efeito e plantar minas.");
    }
    
    public static void combaterComoSuporte(){
        LOGGER.info("Esperar feridos e ajudar.");
    }

    public static void main(String[] args) {

        LOGGER.info("Inimigos localizados dentro do forte!");
        AgenteSecreto agente = new AgenteSecreto(new EstrategiaLinhaDeFrente());
        agente.combater();

        LOGGER.info("Inimigos efetuando disparos!");
        agente.mudarEstrategia(new EstrategiaEngenharia());
        agente.combater();

        LOGGER.info("Equipe sendo alvejada!");
        agente.mudarEstrategia(new EstrategiaSuporte());
        agente.combater();

        LOGGER.info("Java 8 Lambdas");
        LOGGER.info("Inimigos localizados dentro do forte!");
        agente = new AgenteSecreto(() -> LOGGER.info("Segurar escudo e invadir."));
        agente.combater();
        
        LOGGER.info("Inimigos efetuando disparos!");
        agente.mudarEstrategia(() -> LOGGER.info("Armar torreta, jogar granadas de efeito e plantar minas."));
        agente.combater();
        
        LOGGER.info("Equipe sendo alvejada!");
        agente.mudarEstrategia(()-> LOGGER.info("Esperar feridos e ajudar."));
        agente.combater();
        
        LOGGER.info("Java 8 Method References");
        LOGGER.info("Inimigos localizados dentro do forte!");
        agente.mudarEstrategia(Aplicacao::combaterComoLinhaDeFrente);
        agente.combater();
        
        LOGGER.info("Inimigos efetuando disparos!");
        agente.mudarEstrategia(Aplicacao::combaterComoEngenheiro);
        agente.combater();
        
        LOGGER.info("Equipe sendo alvejada!");
        agente.mudarEstrategia(Aplicacao::combaterComoSuporte);
        agente.combater();
        
    }

}
