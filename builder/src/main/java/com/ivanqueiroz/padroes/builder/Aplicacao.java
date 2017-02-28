package com.ivanqueiroz.padroes.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author ivanqueiroz
 */
public class Aplicacao {

    private static final Logger LOGGER = LoggerFactory.getLogger(Aplicacao.class);

    public static void main(String[] args) {
        Soldado assalto = new Soldado.Builder(Especialidade.ASSALTO, "Cpt Nascimento")
                .comArmaPrimaria(ArmaPrimaria.FUZIL)
                .comArmaSecundaria(ArmaSecundaria.PISTOLA)
                .comColete(Colete.CERAMICO)
                .build();
        LOGGER.info(assalto.toString());

        Soldado suporte = new Soldado.Builder(Especialidade.SUPORTE, "Rambo")
                .comArmaPrimaria(ArmaPrimaria.METRALHADORA)
                .comAparelho(Aparelhos.C4)
                .build();
        LOGGER.info(suporte.toString());

        Soldado engenheiro = new Soldado.Builder(Especialidade.ENGENHEIRO, "Jack Bauer")
                .comAparelho(Aparelhos.SMOKE)
                .comArmaSecundaria(ArmaSecundaria.PISTOLA)
                .comColete(Colete.KEVLAR)
                .build();
        LOGGER.info(engenheiro.toString());

        Soldado batedor = new Soldado.Builder(Especialidade.BATEDOR, "Chris Kyle")
                .comArmaPrimaria(ArmaPrimaria.RIFLE)
                .comArmaSecundaria(ArmaSecundaria.REVOLVER)
                .comColete(Colete.ALUMINIO)
                .comAparelho(Aparelhos.SMOKE)
                .build();
        LOGGER.info(batedor.toString());
    }

}
