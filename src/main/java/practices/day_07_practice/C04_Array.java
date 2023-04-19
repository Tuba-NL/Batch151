package practices.day_07_practice;

import java.util.Arrays;

public class C04_Array {
    public static void main(String[] args) {

        // Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
        // input : 1,2,-3,4,-5,-6
        // output :-1,-2,3,-4,5,6

        int arr[]={1,2,-3,4,-5,-6};

        int brr[]= new int[arr.length];

        int idx = 0;

        for (int each:arr){ // arr`deki herbir elemani foreach ile aldik.
            brr[idx]= each*-1; //her elemanin negatif degerini sirasiyla brr`ye esayn ettik.
            idx++; //index`i her seferinde 1 artiralim

        }
        System.out.println(Arrays.toString(brr));//[-1, -2, 3, -4, 5, 6]
    }
}
