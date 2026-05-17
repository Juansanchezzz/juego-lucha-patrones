package com.juego.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonajeTest {

    private Personaje guerrero;

    @BeforeEach
    void setUp() {

        guerrero = new Personaje("Thor", 100, 20);
    }

    @Test
    @DisplayName("Debe crear personaje correctamente")
    void testCreacionPersonaje() {

        assertEquals("Thor", guerrero.getNombre());
        assertEquals(100, guerrero.getVida());
        assertTrue(guerrero.estaVivo());
    }

    @Test
    @DisplayName("Debe reducir vida al recibir daño")
    void testRecibirDano() {

        guerrero.recibirDano(30);

        assertEquals(70, guerrero.getVida());
    }

    @Test
    @DisplayName("La vida no debe ser negativa")
    void testVidaNoNegativa() {

        guerrero.recibirDano(150);

        assertEquals(0, guerrero.getVida());
        assertFalse(guerrero.estaVivo());
    }

    @Test
    @DisplayName("No debe aceptar daño negativo")
    void testDanoNegativo() {

        guerrero.recibirDano(-20);

        assertEquals(100, guerrero.getVida());
    }

    @Test
    @DisplayName("Personaje debe morir con daño excesivo")
    void testMuertePersonaje() {

        guerrero.recibirDano(500);

        assertEquals(0, guerrero.getVida());
        assertFalse(guerrero.estaVivo());
    }

    @Test
    @DisplayName("Debe atacar correctamente")
    void testAtaque() {

        Personaje enemigo = new Personaje("Loki", 100, 15);

        guerrero.atacar(enemigo);

        assertTrue(enemigo.getVida() < 100);
    }

    @Test
    @DisplayName("Debe lanzar excepción al atacar null")
    void testAtacarNull() {

        assertThrows(NullPointerException.class, () -> {
            guerrero.atacar(null);
        });
    }
}