package practices.day_02_practice;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {
        // INTERWIEW QUESTIONS
        // Ex : Kullanicidan aldiginiz bir sekil ile asagidaki sekli olusturan kodu yaziniz

        /*

                  A     // 2 space+ ch + 2 space
                 A A    // 1 space + ch + 1 space +ch + 1 space
                A A A  //  1 ch + 1 space +1 ch + 1 space+ 1 ch
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter veriniz...");
        char ch = input.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);

        // Ex : Kullanicidan 2 sayi alip 4 islem yapan ve islemlerin
        // sonuclarini ekrana yazdiran basit bir hesap makinesi kodunu yaziniz
        System.out.println("Lutfen 2 sayi veriniz");

        int sayi1=input.nextInt();
        int sayi2 = input.nextInt();
        System.out.println(sayi1+sayi2);
        System.out.println( sayi1-sayi2);
        System.out.println(sayi1*sayi2);
        System.out.println(sayi1/sayi2);

    //Ex  kullanicidan alacaginiz 5 basamakli bir sayinin ilk 2 ve son 2  rakamlari toplamini
    //bulan kodu yaziniz

        // 1.Yol
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int num = input.nextInt();//12345

        int ilkIkiRkm = num/1000;
        System.out.println("ilkIkiRkm = " + ilkIkiRkm);

        int ilkIkiToplam = (ilkIkiRkm%10)+(ilkIkiRkm/10);
        System.out.println("ilkIkiToplam = " + ilkIkiToplam);

        int sonIkiRkm= num%100;//45
        int sonIkiRkmToplam = (sonIkiRkm%10)+(sonIkiRkm/10);
        System.out.println("sonIkiRkmToplam = " + sonIkiRkmToplam);
        int toplam=ilkIkiToplam+sonIkiRkmToplam;
        System.out.println("toplam = " + toplam);





    }//main
}//class