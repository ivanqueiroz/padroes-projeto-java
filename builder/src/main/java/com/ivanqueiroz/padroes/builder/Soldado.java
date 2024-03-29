package com.ivanqueiroz.padroes.builder;

import lombok.Getter;

/**
 *
 * @author ivanqueiroz
 */
@Getter
public class Soldado {

    private final Aparelhos aparelho;
    private final String nome;
    private final Especialidade especialidade;
    private final ArmaPrimaria armaPrimaria;
    private final ArmaSecundaria armaSecundaria;
    private final Colete colete;

    private Soldado(Builder builder) {
        this.aparelho = builder.aparelho;
        this.nome = builder.nome;
        this.especialidade = builder.especialidade;
        this.armaPrimaria = builder.armaPrimaria;
        this.armaSecundaria = builder.armaSecundaria;
        this.colete = builder.colete;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Esse é um ")
                .append(especialidade)
                .append(" chamado ")
                .append(nome);

        if (armaPrimaria != null) {
            sb.append(" utilizando ");
            sb.append(armaPrimaria).append(" como arma principal ");
        }

        if (armaSecundaria != null) {
            sb.append(" de reserva uma ").append(armaSecundaria);
        }
        
        if (colete != null) {
            sb.append(" vestindo um colete do tipo ").append(colete);
        }
        
        if (aparelho != null) {
            sb.append(" utilizando um ").append(aparelho).append(" para entrar");
        }
        
        sb.append('.');
        return sb.toString();
    }

    /**
     *
     * A classe Builder
     *
     */
    public static class Builder {

        private final String nome;
        private final Especialidade especialidade;
        private Aparelhos aparelho;
        private ArmaPrimaria armaPrimaria;
        private ArmaSecundaria armaSecundaria;
        private Colete colete;

        /**
         * Constructor
         *
         * @param especialidade
         * @param nome
         */
        public Builder(Especialidade especialidade, String nome) {
            if (especialidade == null || nome == null) {
                throw new IllegalArgumentException("Especialidade ou nome não podem ser vazios");
            }
            this.especialidade = especialidade;
            this.nome = nome;
        }

        public Builder comArmaPrimaria(ArmaPrimaria armaPrimaria) {
            this.armaPrimaria = armaPrimaria;
            return this;
        }

        public Builder comArmaSecundaria(ArmaSecundaria armaSecundaria) {
            this.armaSecundaria = armaSecundaria;
            return this;
        }

        public Builder comColete(Colete colete) {
            this.colete = colete;
            return this;
        }

        public Builder comAparelho(Aparelhos aparelho) {
            this.aparelho = aparelho;
            return this;
        }

        public Soldado build() {
            return new Soldado(this);
        }
    }

}
