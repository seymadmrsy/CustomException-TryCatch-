package org.example;

public class Calculator {

    public static int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Sıfıra bölme işlemi hatası");
        }
        return a / b;
    }
}
