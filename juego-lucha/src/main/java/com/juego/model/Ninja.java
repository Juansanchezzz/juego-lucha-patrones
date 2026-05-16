package com.juego.model;

public class Ninja extends Personaje {

    public Ninja() {
        super("Ninja", 80, 30);
    }

    @Override
    public void mostrarPersonaje() {
        System.out.println("Personaje: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
    }
}
