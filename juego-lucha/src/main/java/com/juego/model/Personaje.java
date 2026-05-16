
package com.juego.model;

import java.util.Random;

public class Personaje {

    protected String nombre;
    protected int vida;
    protected int ataque;

    private final int MAX_DANO = 30;
    private final int MIN_DANO = 10;

    private Random rand;

    public Personaje(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.rand = new Random();
    }

    public void atacar(Personaje oponente) {

        int dano = rand.nextInt(MAX_DANO - MIN_DANO + 1) + MIN_DANO;

        oponente.recibirDano(dano);

        System.out.println(
            this.nombre + " ataca a " +
            oponente.getNombre() +
            " causando " + dano + " puntos de daño."
        );
    }

    public void recibirDano(int dano) {

        if (dano < 0) {
            return;
        }

        this.vida -= dano;

        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public void mostrarPersonaje() {
        System.out.println("Personaje: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }
}

