package javaders.day05typecastingasciivaluestringmanipulations;

public class C01_MatematikselIslemler {

    /*
    -Java`da farkli data type`leri arasinda islem yapiliyorsa
    sonuc buyuk olan data type`inin turunde olur.
    -Karsilastirtma operatorlerinde sonuc hep boolean doner.
    < Kucuktur
    > Buyuktur
    == Esittir
    != Esit degildir
    <= Kucuk esittir
    >= Buyuk esittir
    && and (ve) operatoru
    || or (veya) operatoru
     */
    public static void main(String[] args) {

        System.out.println(4*(5+2)/3); // 9
        // int/int ==>int olacagi icin9.33333334 yerine virgulden sonrasini
        // siler ve tamsayi kismini alir biz ekranda 9 rakamini goruruz.

        System.out.println(6*16/8); //12

        double sonuc = 4*(5+2)/3 ;
        System.out.println("sonuc =" +sonuc); //9.0

        double sonuc2 = 4.0*(5+2)/3;
        System.out.println("sonuc2 ="+sonuc2);// 9.33334

        System.out.println(4*(1+5)/3); //8

        int sayi1 = 5;
        int sayi2 = 2;
        double sayi3 = 2;
        System.out.println(sayi1/sayi2); //2 normalde 2.5 ancak int/int=int olacagi icin
        //tamsayi kismi alinir virgulden sonrasi atilir.

        System.out.println(sayi1/sayi3); //2.5

        System.out.println(sayi1+sayi3/sayi2); //6.0

        boolean first = 2<4;
        boolean second = 2+6 != 8;
        boolean third = 2+3*5<20;

        System.out.println("first="+ first); //true
        System.out.println("second="+second); //false
        System.out.println("third="+third);  //true

        System.out.println(first && second); //false
        System.out.println(first || second || third); //true

        }
    }

