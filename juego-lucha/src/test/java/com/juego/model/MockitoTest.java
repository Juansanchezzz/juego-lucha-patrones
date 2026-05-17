package com.juego.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockitoTest {

    @Test
    void testSimple() {

        String nombre = "Mockito funcionando";

        assertEquals("Mockito funcionando", nombre);
    }
}

