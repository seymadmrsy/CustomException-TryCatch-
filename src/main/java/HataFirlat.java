package org.example;

public class HataFirlat {

    public static void main(String[] args) {

        try {
            int result = Calculator.divide(10, 0);
            System.out.println("Sonuç: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Hata yakalandı: " + e.getMessage());
        }
    }
}
