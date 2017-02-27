package com.exmaple;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @Before
    public void setUp() throws Exception {
        fibonacci = new Fibonacci();
    }

    @Test
    public void shouldReturnZeroForZero() {
        int result = fibonacci.fibonacci(0);
        assertEquals(0, result);
    }

    @Test
    public void shouldReturnOneForOne() {
        int result = fibonacci.fibonacci(1);
        assertEquals(1, result);
    }

    @Test
    public void shouldReturnOneForTwo() {
        int result = fibonacci.fibonacci(2);
        assertEquals(1, result);
    }

    @Test
    public void shouldReturnTwoForThree() {
        int result = fibonacci.fibonacci(3);
        assertEquals(2, result);
    }
}
