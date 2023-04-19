package practices.day_15_practice_inheritance;

public class Ustabasi extends Isci{
    @Override
    public String toString() {
        return "Ustabasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Ustabasi ustabasi1 = new Ustabasi();

        ustabasi1.isim="Murat";
        ustabasi1.soyIsim="Gokcek";
        ustabasi1.saatUcreti=15;
        ustabasi1.maas= ustabasi1.maasHesapla();
        ustabasi1.statu="Isci";
        ustabasi1.isciStatu="ustabasi";


        System.out.println(ustabasi1.isim);//Murat
        System.out.println(ustabasi1.soyIsim);//Gokcek
        System.out.println(ustabasi1.toString());
        ustabasi1.mesai();//Isciler gunluk 8 saat ve haftada 5 gun calisir

    }
}
