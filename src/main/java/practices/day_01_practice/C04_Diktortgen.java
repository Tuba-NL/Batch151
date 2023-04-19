package practices.day_01_practice;

import java.util.Scanner;

public class C04_Diktortgen {


    public static void main(String[] args) {

        // Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini
        // ayri ayri sisteme girmesini isteyiniz.
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Dikdortgenin a kenarini giriniz");
        int a = scan.nextInt();

        System.out.println("Dikdortgenin b kenarini giriniz");
        int b = scan.nextInt();

        System.out.println("Dikdortgenin Cevresi:"+ ((2*a)+(2*b)));

    }
}
