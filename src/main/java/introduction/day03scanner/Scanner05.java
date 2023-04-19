package introduction.day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan bir diktorgenin iki kenar uzunlugunu aliniz
        // 1) Alanini hesaplayiniz ==> Kisa kenar * Uzun Kenar
        // 2) Cevresini hesaplayiniz ==> 2*Kisa kenar + 2*Uzun kenar
        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen bir diktortgenin iki kenar uzunlugunu giriniz..." );

        double kisaKenar = input.nextDouble();
        double uzunKenar = input.nextDouble();

        System.out.println("Alan :" +  kisaKenar * uzunKenar );
        System.out.println("Cevre :" +(2*kisaKenar + 2*uzunKenar) );


    }
}
