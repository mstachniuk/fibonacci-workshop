package com.exmaple;

public class Fibonacci {
    public int fibonacci(int n) {
        if(n < 2) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
