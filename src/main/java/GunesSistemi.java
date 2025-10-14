package org.example;

public class GunesSistemi {
    public static void main(String[] args) {
        System.out.println("GÜNEŞ SİSTEMİ GEZEGENLERİ");


        for (Gezegen gezegen : Gezegen.values()) {
            gezegen.bilgileriYazdir();
        }
    }
}
