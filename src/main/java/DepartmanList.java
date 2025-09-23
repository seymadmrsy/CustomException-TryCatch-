
package org.example;
public class DepartmanList {
    public static void main(String[] args) {

        System.out.println("Yazılım Departmanı Personel Listesi");

        Personel personel1 = new Personel();
        Personel personel2 = new Personel();
        Personel personel3 = new Personel();
        Personel personel4 = new Personel();

        personel1.id=1;
        personel1.ad="Mustafa";
        personel1.soyad="Akmaz";
        personel1.pozisyon="Yazılım Mühendisi";

        personel2.id=2;
        personel2.ad="Şeyma";
        personel2.soyad="Demirsoy";
        personel2.pozisyon="QA TESTER";

        personel3.id=3;
        personel3.ad="Bora";
        personel3.soyad="Atar";
        personel3.pozisyon="Developer";



        personel4.id=4;
        personel4.ad="Betül";
        personel4.soyad="Korkmaz";
        personel4.pozisyon="Developer";

        personel1.bilgileriYazdir();
        personel2.bilgileriYazdir();
        personel3.bilgileriYazdir();
        personel4.bilgileriYazdir();



    }


}




