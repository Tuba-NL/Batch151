package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        // Kullanicidan alacaginiz 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yaziniz.
        // % ==> modulus operatoru sayinin bolumunden kalan sayiyi verir.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz....");

        int sayi = input.nextInt();//1234
        int sonRakam = sayi%10;
        int ilkRakam = sayi/1000;
        System.out.println("ilkRakam+ sonRakam ="+ (ilkRakam+ sonRakam));



        //3 basamaklı bir sayını ilk basamağını almak için (basamak sayısı -1) 0 olan yani 100e bölmeliyiz.
        // 4 basamaklı bir sayını ilk basamağını almak için (basamak sayısı -1) 0 olan yani 1000 e bölmeliyiz.
       //5 basamaklı bir sayını ilk basamağını almak için (basamak sayısı -1) 0 olan yani 10000 e bölmeliyiz.


    }//main
}//class
