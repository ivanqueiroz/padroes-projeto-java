package com.ivanqueiroz.padroes.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ivanqueiroz
 */
@Slf4j
public class Aplicacao {

    public static void main(String[] args) {
        Soldado assalto = new Soldado.Builder(Especialidade.ASSALTO, "Cpt Nascimento")
                .comArmaPrimaria(ArmaPrimaria.FUZIL)
                .comArmaSecundaria(ArmaSecundaria.PISTOLA)
                .comColete(Colete.CERAMICO)
                .build();
        log.info("Soldado {}", assalto);

        Soldado suporte = new Soldado.Builder(Especialidade.SUPORTE, "Rambo")
                .comArmaPrimaria(ArmaPrimaria.METRALHADORA)
                .comAparelho(Aparelhos.C4)
                .build();
        log.info("Suporte {}", suporte);

        Soldado engenheiro = new Soldado.Builder(Especialidade.ENGENHEIRO, "Jack Bauer")
                .comAparelho(Aparelhos.SMOKE)
                .comArmaSecundaria(ArmaSecundaria.PISTOLA)
                .comColete(Colete.KEVLAR)
                .build();
        log.info("Engenheiro {}", engenheiro);

        Soldado batedor = new Soldado.Builder(Especialidade.BATEDOR, "Chris Kyle")
                .comArmaPrimaria(ArmaPrimaria.RIFLE)
                .comArmaSecundaria(ArmaSecundaria.REVOLVER)
                .comColete(Colete.ALUMINIO)
                .comAparelho(Aparelhos.SMOKE)
                .build();
        log.info("Batedor {}", batedor);
    }

}
