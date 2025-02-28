package com.example.TDD;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    // ✅ Prueba para números normales (no múltiplos de 3 ni 5)
    @Test
    void testFizzBuzzReturnsNumber() {
        assertEquals("1", FizzBuzz.fizzbuzz(1));
        assertEquals("2", FizzBuzz.fizzbuzz(2));
        assertEquals("4", FizzBuzz.fizzbuzz(4));
    }

    // ✅ Prueba para múltiplos de 3
    @Test
    void testFizzBuzzMultiplo3() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzbuzz(6));
        assertEquals("Fizz", FizzBuzz.fizzbuzz(9));
        assertEquals("Fizz", FizzBuzz.fizzbuzz(12));
    }

    // ✅ Prueba para múltiplos de 5
    @Test
    void testFizzBuzzMultiplo5() {
        assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(10));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(20));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(25));
    }

    // ✅ Prueba para múltiplos de 3 y 5
    @Test
    void testFizzBuzzMultiplo3y5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(30));
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(45));
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(60));
    }

    // ✅ Prueba con 0 (caso especial)
    @Test
    void testFizzBuzzCero() {
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(0)); // 0 es múltiplo de cualquier número
    }

    // ✅ Prueba con números negativos
    @Test
    void testFizzBuzzNumerosNegativos() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(-3));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(-5));
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(-15));
        assertEquals("-1", FizzBuzz.fizzbuzz(-1));
    }

    // ✅ Prueba con valores grandes
    @Test
    void testFizzBuzzValoresGrandes() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(999));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(5000));
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15000));
        assertEquals("1001", FizzBuzz.fizzbuzz(1001));
    }
}
