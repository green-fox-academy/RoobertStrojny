package com.greenfox.fibonacci;

public class Fibonacci {
    public Fibonacci() {
    }

    public Integer getFibonacci(int index) {
        if (index <= 0) {
            return null;
        }
        if (index == 1) {
            return 1;
        }
        if (index == 2) {
            return 1;
        }

        return getFibonacci(index - 1) + getFibonacci(index - 2);
    }

}
