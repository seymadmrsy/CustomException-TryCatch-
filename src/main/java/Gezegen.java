package org.example;

public enum Gezegen {
    MERKUR(1, 57.9, 2439.7, 1407.6),
    VENUS(2, 108.2, 6051.8, -5832.5),
    DUNYA(3, 149.6, 6371, 23.9),
    MARS(4, 227.9, 3389.5, 24.6),
    JUPITER(5, 778.3, 69911, 9.9),
    SATURN(6, 1427, 58232, 10.7),
    URANUS(7, 2871, 25362, -17.2),
    NEPTUN(8, 4495, 24622, 16.1);


    private final int sira;
    private final double uzaklik;
    private final double yaricap;
    private final double donmeSuresi;

    // --- Constructor ---
    Gezegen(int sira, double uzaklik, double yaricap, double donmeSuresi) {
        this.sira = sira;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }


    public int getSira() {
        return sira;
    }

    public double getUzaklik() {
        return uzaklik;
    }

    public double getYaricap() {
        return yaricap;
    }

    public double getDonmeSuresi() {
        return donmeSuresi;
    }


    public void bilgileriYazdir() {
        System.out.println("Gezegen: " + name());
        System.out.println("Sıra: " + sira);
        System.out.println("Güneş'e uzaklık (milyon km): " + uzaklik);
        System.out.println("Yarıçap (km): " + yaricap);
        System.out.println("Dönme süresi (saat): " + donmeSuresi);

    }
}


