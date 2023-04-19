package practices.lambda_practice;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.MAX_VALUE;

public class LambdaSorularSabah {


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

        allEvenPrint(nums);
        System.out.println();
        anyOddPrint(nums);
        System.out.println();
        enKuculIlk3Atla50Artis(nums);
        System.out.println();
        ciftElemanlar(nums);
        System.out.println();
        tekElKareYazdir(nums);
        System.out.println();
        tekSayiKup(nums);
        System.out.println();
        benzersizCiftKare(nums);
        System.out.println();
        benzersizCiftSayilarinKareCarpimiYazdir(nums);
        System.out.println();
        maxDeger(nums);
        System.out.println();
        maxValue(nums);
        System.out.println();
        minDeger(nums);
        System.out.println();
        minDeger1(nums);

    }//main

    //1)  Bir listedeki elemanların hepsinin çift sayı olup olmadığını kontrol eden method'u oluşturunuz.
    public static void allEvenPrint(List<Integer> nums) {
        boolean allEven = nums.
                stream().
                allMatch(t -> t % 2 == 0);
        System.out.println("allEven = " + allEven);

    }

    //2)  Bir listedeki elemanların herhangi birinin tek sayı olup olmadığını kontrol eden method'u oluşturunuz
    public static void anyOddPrint(List<Integer> nums) {
        boolean anyOdd = nums.stream().anyMatch(t -> t % 2 != 0);
        System.out.println("anyOdd = " + anyOdd);
    }

    //3)  Bir listedeki en kucuk ilk 3 eleman haricindekilere %50 artis yapan method'u oluşturunuz.
    public static void enKuculIlk3Atla50Artis(List<Integer> nums) {
        nums.stream().sorted().skip(3).map(t-> t*1.5).forEach(t-> System.out.print(t+" "));
    }

    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.
    public static void ciftElemanlar (List<Integer> nums){
        nums.stream().
                filter(t->t%2==0).
                forEach(t-> System.out.print(t+ " "));
    }


    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.
    public static void tekElKareYazdir(List<Integer> nums){
        nums.
                stream().
                filter(t-> t%2!=0).
                map(t-> t*t).
                forEach(t-> System.out.print(t+" "));
    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.
    public static void tekSayiKup (List<Integer> nums){
        nums.stream().
                distinct().
                filter(t->t%2!=0).
                map(t->t*t*t).
                forEach(t-> System.out.print(t+ " "));
    }

    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz
    public static void benzersizCiftKare (List<Integer> nums){
      Integer benzersizCiftKare =
              nums.
              stream().
              distinct().
              filter(t->t%2==0).
              map(t->t*t).reduce(Math::addExact).
              get();
        System.out.println(benzersizCiftKare);
    }


    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz
    public static void benzersizCiftSayilarinKareCarpimiYazdir (List<Integer> nums) {
        Integer benzersizCiftKareCarpimi =
                        nums.
                        stream().
                        distinct().
                        filter(t->t%2 ==0).
                        map(t->t*t).
                        reduce(Math::multiplyExact).
                        get();

        System.out.println(benzersizCiftKareCarpimi);
    }

    //9)Liste ogelerinden max degerini veren bir method olusturunuz
    public static void maxDeger( List<Integer> nums ){

        int maxDeger =
                nums.
                        stream().
                        distinct().
                        reduce(0,(t,u)->t>u?t:u);

        System.out.print(maxDeger);

    }
      //2.Yol
    public static void maxValue(List<Integer> nums){

        int maxValue = nums.
                stream().
                distinct().
                reduce(Math::max).get();

        System.out.println(maxValue);
    }


    //10)Liste ogelerinden minumum degerini veren method olusturunuz
    public static void minDeger( List<Integer> nums ){

        int minDeger =
                nums.
                        stream().
                        distinct().
                        reduce(MAX_VALUE, (t, u) -> t < u ? t : u);

        System.out.print(minDeger);

    }
    public static void minDeger1(List<Integer>nums){
        int minDeger1 = nums.
                stream().
                distinct().
                reduce(Math::min).get();
        System.out.println( minDeger1);
    }

}

