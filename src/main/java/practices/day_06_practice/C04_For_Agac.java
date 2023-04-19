package practices.day_06_practice;

import java.util.Scanner;

public class C04_For_Agac {

    public static void main(String[] args) {
         /*

         Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.

         Asagıdaki agac seklini konsala yazdırınız

        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Yaprak Satir Sayisini Giriniz");
        int yaprakSatirSayisi = scan.nextInt();

        System.out.println("Govde Satir Sayisini Giriniz");
        int govdeSatirSayisi = scan.nextInt();

        String yaprak = "";
        for (int i = 0; i < yaprakSatirSayisi; i++) { // 0'dan yaprak satır sayısına kadar donguye aldık

            yaprak = yaprak + "^";
            System.out.println(yaprak);
        }
        for (int j = 0; j < govdeSatirSayisi; j++) { //0'dan govde satır sayısına kadar donguye aldık
            System.out.println("|||");

        }


    }
}
