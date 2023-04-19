package practices.day_04_practice;

import javax.swing.plaf.basic.BasicListUI;
import java.util.Scanner;

public class C01_cdenaya {
    /*
      Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
   'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 'c' ve  'a' harflerini iceren bir kelime giriniz");
        String str = scan.nextLine().toLowerCase();

        int counter = 0; //default deger + ve - sifirdir 0, * ya da / icin default ==>1, String datalar icin "" dir.
        //1.Yol;
        for (int i = 0; i < str.indexOf("c"); i++) {
            if (str.charAt(i) == 'a') {
                counter++;
            }//if body

        }//for body
        System.out.println("c`den once " + counter + " a vardir");

        System.out.println("********************************************");
        //2.Yol;
        int sayac = 0;
        if (str.contains("c") && str.contains("a")) {
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == 'a') {
                    sayac++;
                } else if (str.charAt(i) == 'c') {
                    break;
                }//else if

            }//for loop
            System.out.println("c`den onceki a sayisi " + sayac);

        } else {
            System.out.println("Lutfen 'c' ve 'a' harflerini iceren bir kelime giriniz ");

        }
    }


}
