package calismalar;

import java.util.Arrays;
import java.util.Scanner;

public class Deneme1 {
    public static void main(String[] args) {
        //Kullanicinin coklu data'yi bir array'e yerlestirebilmesi icin gereken kodu yaziniz.
        /*
            1)Kullanicidan data almak icin Scanner object olustur
            2)Coklu data'yi yerlestirmek icin bir array olusturmaliyim
            3)Array olusturabilmek icin kullanicidan array'e kac tane eleman koyacagini almaliyim.
            4)loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyim.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kac isim gireceginizi yaziniz");
        int ogrenciSayisi = scan.nextInt();

        System.out.println("cikmak isterseniz q ya basiniz");
        String ogrenciIsim []= new String[ogrenciSayisi];
        for (int i = 0; i<ogrenciIsim.length  ; i++) {
            System.out.println("giriniz"+(i+1)+".isim");
            String isim = scan.next();
            if(isim.equalsIgnoreCase("q")){
              break;
            }else{
                ogrenciIsim[i]=isim;
            }

        }
        System.out.println(Arrays.toString(ogrenciIsim));
    }
}
