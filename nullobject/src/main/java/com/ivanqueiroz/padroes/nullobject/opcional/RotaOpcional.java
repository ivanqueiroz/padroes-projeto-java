package com.ivanqueiroz.padroes.nullobject.opcional;

import java.util.Optional;

/**
 *
 * @author Ivan Queiroz <ivanqueiroz@gmail.com>
 */
public abstract class RotaOpcional {
    
    public abstract String getNome();
    public abstract int getTamanhoRota();
    public abstract Optional<RotaOpcional> getEsquerda();
    public abstract Optional<RotaOpcional> getDireita();
    public abstract void acelerar();
    
}
