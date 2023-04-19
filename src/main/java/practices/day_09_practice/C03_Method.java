package practices.day_09_practice;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Method {

    public static void main(String[] args) {

          /*
   Kullanıcıdan bir cumle sisteme girmesini isteyiniz.
   method olusturarak cumlede gecen sesli harfleri konsola yazdırınız
*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz...");
        String cumle = scan.nextLine();

        String arr[] = cumle.split("");

        System.out.println(Arrays.toString(arr));

        sesliharfleriyazdir(arr); //method olusturup creat yapinca asagiya kendi otomatik method olusturdu

    }
    public static void sesliharfleriyazdir(String[] arr) {

        for (int i =  0; i< arr.length; i++){ //0`dan arr`in uzunluguna kadar donguye aldik.
            if(arr[i].equalsIgnoreCase("a")// array elemanlari sesli harf mi kontrol ettik.
            || arr[i].equalsIgnoreCase("e")
            || arr[i].equalsIgnoreCase("i")
            || arr[i].equalsIgnoreCase("o")
            || arr[i].equalsIgnoreCase("u")){
                System.out.println(arr[i]);  // sesli harf olanlari yazdirdik.
            }


        }
    }

}
