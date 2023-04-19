package calismalar;

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
     /*
     2.soru bir array olusturun ve olusturdugunuz arraydeki sayilari kucukten buyuge siralayin
      */
        int sayilar [] = {3,7,11,5,9};
        System.out.println(Arrays.toString(sayilar));//[3, 7, 11, 5, 9]
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));//[3, 5, 7, 9, 11]
    }
}
