package org.moinul;

public class MyTest implements MyRunner {
    @Override
    public void run() {
        System.out.print("Factorial Number : " + factorial(5));
    }

    private int factorial(int n) {
        if (n <= 0) return 1;
        return n * factorial(n - 1);
    }
}
