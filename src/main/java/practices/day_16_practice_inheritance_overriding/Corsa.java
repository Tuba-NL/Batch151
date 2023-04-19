package practices.day_16_practice_inheritance_overriding;

import java.util.PropertyResourceBundle;

public class Corsa extends Opel {

    protected String hiz = "Corsa max 200 km hiz yapar";
    protected String yakit = "Corsa benzinli ve elektriklidir";
    protected String model = "Corsa";


     protected void motor(){
        System.out.println("CORSA ARABALAR CEVRECI MOTOR KULLANIR");
    }

    protected void yakitTuketimi() {
        System.out.println("CORSA 5.6 LT YAKIT TUKETIR");
    }

    protected void vitesSayisi() {
        System.out.println("CORSA 5 VİTESLİDİR");
    }

    public static void main(String[] args) {

               /*
        inheritance variable;

         Olusturdugumuz objenin data turu hangi class'a aitse oradan baslayarak bakar.
         Yoksa parent'ına gider.
         ilk buldugu yerden alır
         */


        /*
        inheritance method;

        Olusturdugumuz objenin data turu hangi class'a aitse oradan baslayarak bakar.
        Yoksa parent'ına gider.
        Buldugu yerden hemen almaz. Override edilmismi diye kontrol eder.
        (Constructor class'ına kadar aynı isimde method var mı diye kontrol eder)
        Override edileni alır.

         */

        Corsa arb1 = new Corsa();

        System.out.println(arb1.hareket);//Arabalar tekerlek ile hareket eder
        System.out.println(arb1.hiz);//Corsa max 200 km hiz yapar
        System.out.println(arb1.yakit);//Corsa benzinli ve elektriklidir
        System.out.println(arb1.marka);//Opel
        System.out.println(arb1.sirketMerkezi);//Almanya
        System.out.println(arb1.model);//Corsa

        arb1.motor();//CORSA ARABALAR CEVRECI MOTOR KULLANIR

        System.out.println();

        Opel arb2 = new Corsa();
        System.out.println(arb2.hareket);//Arabalar tekerlek ile hareket eder
        System.out.println(arb2.hiz);//Opel arabalar max 220 km hiz yapar
        System.out.println(arb2.yakit);//Arabalar farkli yakitlar kullanabilir
        System.out.println(arb2.marka);//Opel
        System.out.println(arb2.sirketMerkezi);//Almanya
        //  System.out.println(arb2.model);//CTE

        arb2.motor();//CORSA ARABALAR CEVRECI MOTOR KULLANIR
        arb2.garanti();//OPEL ARABALAR 2 YIL GARANTILIDIR
        arb2.yakitTuketimi();//CORSA 5.6 LT YAKIT TUKETIR
        //arb2.vitesSayisi();//CTE

        System.out.println();

        Araba arb3 = new Corsa();
        System.out.println(arb3.hareket);//Arabalar tekerlek ile hareket eder
        System.out.println(arb3.hiz);//Arabalar motor gucune gore hiz yapar
        System.out.println(arb3.yakit);//Arabalar farkli yakitlar kullanabilir
        System.out.println(arb3.marka);//Arabalar uretildikleri markaya sahiptir
        //System.out.println(arb3.sirketMerkezi);//CTE
        //System.out.println(arb3.model);//CTE

        arb3.yakitTuketimi();//CORSA 5.6 LT YAKIT TUKETIR
        arb3.motor();//CORSA ARABALAR CEVRECI MOTOR KULLANIR
        //arb3.garanti();//CTE
        //arb3.vitesSayisi();//CTE
    }
}
