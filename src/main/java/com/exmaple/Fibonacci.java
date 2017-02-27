package com.exmaple;

public class Fibonacci {
    public int fibonacci(int n) {
        double sqrt5 = Math.sqrt(5);
        double oneDivSqrt5 = 1 / sqrt5;
        double x1 = (1 + sqrt5) /2;
        double x2 = (1 - sqrt5) / 2;

        double fib = oneDivSqrt5 * Math.pow(x1, n) - oneDivSqrt5 * Math.pow(x2, n);

        return (int) Math.round(fib);
    }
}
