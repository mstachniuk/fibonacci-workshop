package com.exmaple;

public class Fibonacci {
    public int fibonacci(int n) {
        if(n < 2) {
            return n;
        }
        int before1 = 1;
        int before2 = 0;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = before1 + before2;
            before2 = before1;
            before1 = sum;
        }
        return sum;
    }
}
