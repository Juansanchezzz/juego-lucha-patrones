package com.juego.patrones.decorator;

import com.juego.model.Personaje;

public abstract class PersonajeDecorator extends Personaje {

    protected Personaje personaje;

    public PersonajeDecorator(Personaje personaje) {

        super(
            personaje.getNombre(),
            personaje.getVida(),
            personaje.getAtaque()
        );

        this.personaje = personaje;
    }

    @Override
    public void mostrarPersonaje() {
        personaje.mostrarPersonaje();
    }
}