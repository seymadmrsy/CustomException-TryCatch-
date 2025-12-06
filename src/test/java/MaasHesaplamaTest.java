package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;



public class MaasHesaplamaTest {

    MaasHesaplama hesap = new MaasHesaplama();

    //Normal Çalışan Maaş Testi
    @Test
    public void testMaasHesaplama20Gun() {
        int sonuc1 = hesap.maasHesapla(20);
        int beklenen1 = 40000;
        System.out.println("Normal Maaş ile Çalışan");
        System.out.println("--------------------------");
        System.out.println("Methoddan Gelen Sonuç : " + sonuc1);
        System.out.println("Olması Beklenen Sonuç : " + beklenen1);
        //Assert.assertEquals(beklenen, sonuc,"Maaş Hesaplaması Yanlış !");
        Assert.assertEquals(sonuc1, beklenen1, "Maaş Hesaplaması Yanlış!");
    }

    @Test
    //Fazla Mesai Yapan
    public void testMaasHesaplama25Gun(){
        int sonuc2 = hesap.maasHesapla(25);
        int beklenen2 = 55000 ;
        System.out.println("--------------------------");
        System.out.println("Methoddan Gelen Sonuç : " + sonuc2);
        System.out.println("Olması Beklenen Sonuç : " + beklenen2);
        Assert.assertEquals(sonuc2, beklenen2, "Maaş Hesaplaması Yanlış!");
    }

    //Çok Fazla Mesai Yapan Personel
    @Test
    public void testMaasHesaplama30Gun(){
        int sonuc3 = hesap.maasHesapla(30);
        int beklenen3 = 80000;
        System.out.println("--------------------------");
        System.out.println("Methoddan Gelen Sonuç : " + sonuc3);
        System.out.println("Olması Beklenen Sonuç : " + beklenen3);
        Assert.assertEquals(sonuc3, beklenen3, "Maaş Hesaplaması Yanlış!");

    }
}
