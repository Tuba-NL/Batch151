package calismalar;

import java.util.Scanner;

public class Arrays7 {
    public static void main(String[] args) {
        /*
        7.soru Verilen bir Array`in istenen bir elemani icerip icermedigini kontrol edip,
         bize true veya false sonucu donen bir method olusturun.
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen kontrol icin bir isim giriniz");
        String arananIsim = scan.nextLine();
        String isimler [] = {"Ali", "Veli", "Ahmet", "Mehmet"};
        contains(isimler, arananIsim);


    }

    public static void contains(String[] isimler, String arananIsim) {
        boolean sonuc = false;

          for (int i = 0; i < isimler.length ; i++) {
            if(isimler[i].equalsIgnoreCase(arananIsim)){
                sonuc = true;
            }

        }
        System.out.println(sonuc);
    }
}
