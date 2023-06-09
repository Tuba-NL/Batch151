
package practices.lambda_practice;

import java.util.ArrayList;
import java.util.List;

public class LambdaSorular1 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);


        elYazdir(nums);
        System.out.println();
        elYazdir1(nums);
        System.out.println();
        listCiftElemanlar(nums);
        System.out.println();
        listCiftElemanlar1(nums);
        System.out.println();
        listTekElemanlariKare(nums);
    }

    //1)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void elYazdir(List<Integer> nums) {
        for (Integer w : nums) {
            System.out.print(w + " ");
        }
    }


    //2)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void elYazdir1(List<Integer> nums) {
        nums.
                stream().
                forEach(t -> System.out.print(t + " "));
    }

    //3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void listCiftElemanlar(List<Integer> nums) {
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void listCiftElemanlar1(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));
    }

    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void listTekElemanlariKare(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " "));
    }


    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)


    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz


    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz


    //9)Liste ogelerinden max degeri veren bir method olusturunuz


    //10)Liste ogelerinden minumum degeri veren method olusturunuz


}

