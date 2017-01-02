package com.ivanqueiroz.padroes.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Ivan Queiroz <ivanqueiroz@gmail.com>
 */
public class EstrategiaLinhaDeFrente implements EstrategiaAgente{
    
    final static Logger LOGGER = LoggerFactory.getLogger(EstrategiaLinhaDeFrente.class);
    
    @Override
    public void executar() {
        combaterComoLinhaDeFrente();
    }
    
    public static void combaterComoLinhaDeFrente(){
         LOGGER.info("Segurar escudo e invadir.");
    }
    
}
