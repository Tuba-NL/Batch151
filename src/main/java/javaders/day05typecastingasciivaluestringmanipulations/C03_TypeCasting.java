package javaders.day05typecastingasciivaluestringmanipulations;

public class C03_TypeCasting {

    public static void main(String[] args) {
        /*

        Numeric Data Type`larinin birbirine donusturulmesine Type Casting denir.
        Numeric Data Typelari: byte<short<int<long<float<double

        Kucuk Data Type`lerinin Buyuk Data Type`lerine donusturulmesine
        Auto Widening( Otomatik Genisletme) denir. ==>Kucuk kutunun Buyuk Kutunun icine yerlestirilmesi

           Buyuk kutunun Kucuk kutuya donusturulmesinde Java sorumlulugu kabul etmez.
         Data kaybi olabilecegi icin code'u yazanlara birakir.Buna "Explicit Narrowing"
         (Aciktan Daraltma ) denir.


     */
        // byte data type`ini int   data typeìne ceviriniz...
        byte age = 13;
        int ageInt = age;//AutoWidening (Otomatik Genisletme)

        //long data type ini short data type ne ceviriniz...
        long population = 1234;
        short populationShort = (short) population;// Explicit Narrowing (Aciktan Daraltma)

        // int data type`nì float type`ina ceviriniz...
        int boy = 170;
        float boyFloat =boy;

        //short data typeìni byte data typena ceviriniz...
        short numberShort = 115;
        byte numberByte = (byte) numberShort;


    }

}
