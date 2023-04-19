package calismalar;

import java.util.Arrays;

public class Arrays4 {
    public static void main(String[] args) {
        /*
        3.soru Verilen array in tum elemanlarini bir soldaki konuma tasiyacak
        bir program yazin. Ornek:Array((1,2,3,4,5)) ise output (2,3,4,5,1) olacak
         */
        int sayilar[] = {1, 2, 3, 4, 5};
       int temp = sayilar [0];
        for (int i = 0; i <sayilar.length-1 ; i++) {
            sayilar[i]= sayilar [i+1];
            System.out.println(Arrays.toString(sayilar));

        }
        sayilar[sayilar.length-1] = temp;
        System.out.println(Arrays.toString(sayilar));//[2, 3, 4, 5, 1]
    }
}
