package calismalar;

import java.util.Arrays;

public class Arrays5 {
    public static void main(String[] args) {
        /*
      5.soru Verilen bir int array`deki
      en buyuk sayiyi yazdiran bir method olusturun.

         */
        //1. yol methodsuz
        int arr1[] = {10, 8, 7, 3, 11, 33, 23};
        Arrays.sort(arr1);
        System.out.println(arr1[arr1.length - 1]);//33

        System.out.println("***************************************************");

          //2. yol methodlu
        int arr[] = {10, 8, 7, 3, 11, 33, 23};
        maxSayiYazdir(arr);
    }
    public static void maxSayiYazdir(int[] arr) {
        int maxSayi = arr[0];

        for (int w : arr) {
            if (w > maxSayi) {            // for (int i = 0; i < arr.length; i++) {
                maxSayi = w;               // maxSayi = Math.max(maxSayi, arr[i]);
            }
        }
            System.out.println(maxSayi);
        }
    }
