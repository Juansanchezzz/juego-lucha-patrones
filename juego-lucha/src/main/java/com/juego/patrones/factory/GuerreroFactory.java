package com.juego.patrones.factory;

import com.juego.model.Guerrero;
import com.juego.model.Personaje;

public class GuerreroFactory extends PersonajeFactory {

    @Override
    public Personaje crearPersonaje() {
        return new Guerrero();
    }
}
