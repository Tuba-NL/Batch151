package practices.day_15_practice_inheritance;

public class Memur extends Muhasebe{
    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
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


        Memur memur1 = new Memur();

       /*
    memur1 objesi, memur class'ının objesi olmasına ragmen
    inherit ettigi muhasebe ve onunda parent'ı olan personel
     classlarındaki tum dataları alabilir
     */
      //Personel Class`indan
        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyIsim="Tepe";
        memur1.adres="Ankara";
        memur1.tel="312589674";

        //Muhasebe Class`indan
        memur1.saatUcreti=10;
        memur1.statu="Memur";
        memur1.maas=memur1.maasHesapla();

        System.out.println(memur1.persNo);//1001
        System.out.println(memur1.maas);//2400

        System.out.println(memur1.toString());
        //toString() methodu objelerin tum ozelliklerini yazdirmak icin pratik bir yontemdir.


        ////////////////////////////////////////////////////

        Memur memur2 = new Memur();

        memur2.persNo=1002; //Personel
        memur2.saatUcreti=10; //Muhasebe
        memur2.maas=memur2.maasHesapla();//Muhasebe

        System.out.println(memur2.persNo);//1002
        System.out.println(memur2.maas);//2400

        System.out.println(memur2.toString());

    }

    }


