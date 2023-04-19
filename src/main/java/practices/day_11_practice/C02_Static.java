package practices.day_11_practice;

public class C02_Static {

    static String okulismi = "Yildiz Koleji";

    static int okulNo;

    static boolean okulAcikMi;

    /*

okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
Bu static variable'leri main icerisinde yazdıralım

*/
    public static void main(String[] args) {
        //Static variable`lara, class icerisindeki tum methodlardan direkt ulasilir.
        System.out.println(okulismi);  // Yildiz Koleji
        System.out.println(okulNo);  // 0
        System.out.println(okulAcikMi); //false

        ////////////////////////////////////////////////////////////////
       // Not: Static variable'lere class içerisinde ki tüm metodlardan direk ulaşabiliriz
        //Static variable`lar gokteki ay gibidir.
        //Static variable`lar class`a baglidir.
        //static variable`in degeri bir kisi tarafindan degistirilirse, herkes icin degisiklige ugrar.

        okulNo = 102;
        System.out.println(okulNo);  //102

        staticMethod();

        System.out.println(okulNo); //200

    }

    private static void staticMethod() {

        okulNo = 200;
        System.out.println(okulNo);  //200
    }
}
