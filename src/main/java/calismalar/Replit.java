package calismalar;

import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

                Örnek Çıktı:

        Alan: 32

        Çevre: 24
*/
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz");
        int kisaKenar = scan.nextInt();
        int uzunKenar = scan.nextInt();

        int alan = kisaKenar * uzunKenar;
        int cevre = 2*kisaKenar+2*uzunKenar;
        System.out.println(alan);
        System.out.println(cevre);

         */
        int sum = 0;
        int ortalama = 0;
        int[] arr ={22, 20, 30, 28, 50};
        for ( int w :arr) {
             sum = sum+w;
             ortalama = sum/5;

        }
        System.out.println(sum);
        System.out.println(ortalama);
    }
}
