package com.juego.patrones.decorator;

import com.juego.model.Personaje;

public class EspadaDecorator extends PersonajeDecorator {

    public EspadaDecorator(Personaje personaje) {
        super(personaje);
    }

    @Override
    public void mostrarPersonaje() {
        personaje.mostrarPersonaje();
        System.out.println("Arma extra: Espada Legendaria");
        System.out.println("Ataque aumentado +15");
    }
}