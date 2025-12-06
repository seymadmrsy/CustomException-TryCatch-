package org.example;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class MaasHesaplamaDataProviderTest {

    MaasHesaplama hesap = new MaasHesaplama();

    @Test(dataProvider = "maas")
    public void maasHesaplamaDataProviderTest(int calismaGunSayisi, int beklenenMaas) {
        int expectedMaas = hesap.maasHesapla(calismaGunSayisi);
        System.out.println("Gün Sayısı: " + calismaGunSayisi);
        System.out.println("Beklenen Maas: " + beklenenMaas);
        System.out.println("Hesaplanan Maaş: " + expectedMaas);
        System.out.println("-----------------------------------");
        Assert.assertEquals(expectedMaas,beklenenMaas, calismaGunSayisi + "gün için maaş hatalı");
    }
    @DataProvider(name = "maas")
    public Object[][] maas() {
        return new Object[][]{
                {20, 40000},
                {25, 55000},
                {30, 80000}
        };
    }

}
