package calismalar;

import java.util.Scanner;

public class d1 {
    /*
    Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.


            1 şeker = 1.7 gr


    Örnek Çıktı:
    çay=10
    şeker=2
    Yılda 12.41 kg şeker kullanıyor.

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gunde kac bardak cay iciyorsunuz");
        int cay = scan.nextInt();
        System.out.println("bir bardak icin kac seker kullaniyorsunuz");
        int seker = scan.nextInt();
        //int birSeker = 1.7;
        System.out.println("bir gunluk seker kullanimi: " + cay*seker);
        System.out.println("yillik seker tuketimi: " + seker);
    }
}