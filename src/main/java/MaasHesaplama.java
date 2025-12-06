package org.example;

public class MaasHesaplama {

    // Maaş hesaplama metodu
    public int maasHesapla(int calismaGunSayisi) {
        int gunlukUcret = 2000;
        int maas = calismaGunSayisi * gunlukUcret;
        int prim = 0;

        if (calismaGunSayisi > 25) {
            prim += (5 * 1000);
            prim += (calismaGunSayisi - 25) * 3000;
        } else if (calismaGunSayisi > 20) {
            prim += (calismaGunSayisi - 20) * 1000;
        }

        return maas + prim;
    }

    //  Mesai durumu metodu
    public String mesaiDurumu(int calismaGunSayisi) {
        if (calismaGunSayisi > 20) {
            return "Fazla Mesai Yapmış";
        } else {
            return "Fazla Mesai Yapılmamış";
        }
    }


    public static void main(String[] args) {
        MaasHesaplama hesap = new MaasHesaplama();
        int sonuc = hesap.maasHesapla(30);
        String mesai = hesap.mesaiDurumu(30);

        System.out.println("Toplam Maaş: " + sonuc + " TL");
        System.out.println("Mesai Durumu: " + mesai);
    }
}
