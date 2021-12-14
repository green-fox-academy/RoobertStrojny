package com.greenfox.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void fibonacci_is_right() {
        Fibonacci f = new Fibonacci();
        assertNull(f.getFibonacci(0));
        assertEquals(1, f.getFibonacci(1));
        assertEquals(1, f.getFibonacci(2));
        assertEquals(2, f.getFibonacci(3));
        assertEquals(3, f.getFibonacci(4));
        assertEquals(5, f.getFibonacci(5));
        assertEquals(8, f.getFibonacci(6));
        assertEquals(13, f.getFibonacci(7));
        assertEquals(21, f.getFibonacci(8));
        assertEquals(34, f.getFibonacci(9));
        assertEquals(55, f.getFibonacci(10));
    }

}