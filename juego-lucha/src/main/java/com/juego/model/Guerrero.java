package com.juego.model;

public class Guerrero extends Personaje {

    public Guerrero() {
        super("Guerrero", 100, 20);
    }

    @Override
    public void mostrarPersonaje() {
        System.out.println("Personaje: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
    }
}