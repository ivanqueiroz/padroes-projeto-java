package com.ivanqueiroz.padroes.nullobject;

import com.ivanqueiroz.padroes.nullobject.opcional.RotaOpcional;
import com.ivanqueiroz.padroes.nullobject.opcional.RotaOpcionalImpl;
import java.util.Optional;

/**
 *
 * @author Ivan Queiroz <ivanqueiroz@gmail.com>
 */
public class Aplicacao {

    public static void main(String[] args) {
        Rota pontoPartida = new RotaImpl("Terra",
                new RotaImpl("Marte",
                        new RotaImpl("Jupiter",
                                RotaNulaImpl.getInstancia(),
                                new RotaImpl("Saturno",
                                        new RotaImpl("Netuno",
                                                new RotaImpl("Urano",
                                                        RotaNulaImpl.getInstancia(),
                                                        RotaNulaImpl.getInstancia()),
                                                RotaNulaImpl.getInstancia()),
                                        RotaNulaImpl.getInstancia())),
                        RotaNulaImpl.getInstancia()),
                RotaNulaImpl.getInstancia());

        pontoPartida.acelerar();
        
        RotaOpcional terra = new RotaOpcionalImpl("Terra", Optional.ofNullable(null), Optional.ofNullable(null));
        RotaOpcional marte = new RotaOpcionalImpl("Marte", Optional.ofNullable(null), Optional.ofNullable(terra));
        RotaOpcional jupiter = new RotaOpcionalImpl("Jupiter", Optional.ofNullable(marte), Optional.ofNullable(null));
        RotaOpcional saturno = new RotaOpcionalImpl("Saturno", Optional.ofNullable(null), Optional.ofNullable(jupiter));
        RotaOpcional netuno = new RotaOpcionalImpl("Netuno", Optional.ofNullable(saturno), Optional.ofNullable(null));
        RotaOpcional inicio = new RotaOpcionalImpl("Urano", Optional.ofNullable(netuno),Optional.ofNullable(null));

        inicio.acelerar();
    }

}
