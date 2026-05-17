
package com.juego.model;

import org.junit.jupiter.api.*;
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
        assertEquals(20, guerrero.getAtaque());
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
    @DisplayName("El ataque debe causar daño entre 10 y 30")
    void testRangoAtaque() {

        Personaje oponente = new Personaje("Loki", 100, 15);

        int vidaInicial = oponente.getVida();

        guerrero.atacar(oponente);

        int vidaFinal = oponente.getVida();

        int dano = vidaInicial - vidaFinal;

        assertTrue(
            dano >= 10 && dano <= 30,
            "El daño debe estar entre 10 y 30, fue: " + dano
        );
    }
}

