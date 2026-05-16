package com.juego.juego;

import com.juego.model.Personaje;
import com.juego.patrones.factory.GuerreroFactory;
import com.juego.patrones.factory.NinjaFactory;
import com.juego.patrones.factory.PersonajeFactory;

public class JuegoLucha {

    public static void main(String[] args) {

        PersonajeFactory guerreroFactory = new GuerreroFactory();
        Personaje guerrero = guerreroFactory.crearPersonaje();

        PersonajeFactory ninjaFactory = new NinjaFactory();
        Personaje ninja = ninjaFactory.crearPersonaje();

        guerrero.mostrarPersonaje();

        System.out.println("----------------");

        ninja.mostrarPersonaje();
    }
}
