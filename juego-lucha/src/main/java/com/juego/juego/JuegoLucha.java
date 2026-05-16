package com.juego.juego;

import com.juego.model.Personaje;
import com.juego.patrones.decorator.EspadaDecorator;
import com.juego.patrones.factory.GuerreroFactory;
import com.juego.patrones.factory.PersonajeFactory;

public class JuegoLucha {

    public static void main(String[] args) {

        PersonajeFactory fabrica = new GuerreroFactory();

        Personaje guerrero = fabrica.crearPersonaje();

        System.out.println("=== PERSONAJE BASE ===");
        guerrero.mostrarPersonaje();

        System.out.println("\n=== PERSONAJE CON DECORATOR ===");

        Personaje guerreroConEspada = new EspadaDecorator(guerrero);
        guerreroConEspada.mostrarPersonaje();
    }
}