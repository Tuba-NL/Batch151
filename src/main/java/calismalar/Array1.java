package calismalar;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        //Iki boyutlu Array`i bir boyutlu Array e ceviriniz
        int numbers [][] = {{5,4},{2,3,2}};//==> {5,4,2,3,2}
        int toplamElemanSayisi = 0;
        for (int [] w: numbers){
        toplamElemanSayisi= toplamElemanSayisi+w.length;
        }
        System.out.println(toplamElemanSayisi);//5
        int newArr [] = new int[toplamElemanSayisi];
        System.out.println(Arrays.toString(newArr));//[0, 0, 0, 0, 0]
         int idx = 0;
        for (int[] w:numbers){
            for (int k: w ) {
                newArr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));//[5, 4, 2, 3, 2]
        }
    }

