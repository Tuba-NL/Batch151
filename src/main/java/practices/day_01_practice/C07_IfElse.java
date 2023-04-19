package practices.day_01_practice;

import java.util.Scanner;

public class C07_IfElse {

    public static void main(String[] args) {

        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Ilk sayiyi giriniz");
        int ilkSayi = scan.nextInt();


        System.out.println("Ikinci sayiyi giriniz");
        int ikinci = scan.nextInt();

        if(ilkSayi>ikinci){

            System.out.println("Ilk sayi ikinci sayidan buyuktur");

        }else{

            System.out.println("Ilk sayi ikinci sayidan buyuk degildir");
        }
    }
}
