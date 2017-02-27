package com.exmaple;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void shouldReturnZeroForZero() {
        // given
        Fibonacci fibonacci = new Fibonacci();

        // when
        int result = fibonacci.fibonacci(0);

        // then
        assertEquals(0, result);
    }
}
