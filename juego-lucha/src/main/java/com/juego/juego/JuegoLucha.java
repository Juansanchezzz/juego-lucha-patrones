package com.juego.juego;

import com.juego.model.Personaje;
import com.juego.model.Guerrero;
import com.juego.model.Ninja;

public class JuegoLucha {

    public static void main(String[] args) {

        Personaje guerrero = new Guerrero();
        Personaje ninja = new Ninja();

        System.out.println("===== INICIO DE LA BATALLA =====");

        while (guerrero.estaVivo() && ninja.estaVivo()) {

            guerrero.atacar(ninja);

            System.out.println(
                ninja.getNombre() +
                " tiene " +
               ninja.getVida() +
                " HP"
            );

            if (!ninja.estaVivo()) {
                break;
            }

            ninja.atacar(guerrero);

            System.out.println(
                guerrero.getNombre() +
                " tiene " +
                guerrero.getVida() +
                " HP"
            );

            System.out.println("----------------------");
        }

        System.out.println("===== FIN DE LA BATALLA =====");

        if (guerrero.estaVivo()) {
            System.out.println("Ganó el Guerrero");
        } else {
            System.out.println("Ganó el Ninja");
        }
    }
}
