package day40lambda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> iller = new ArrayList<>(Arrays.asList("Van","MUS","Gumushane","Kutahya","Ankara","MUS", "Ordu","Gaziantep","Hatay","Edirne"));

        bykHarfLenghtArtanDistinct(iller);
        System.out.println();

        bykHarfSonHarfArtanDistinct(iller);
        System.out.println();

        bykHarfLengthArtanDistinctLengthAlfabetikSira(iller);
        System.out.println();

        System.out.println(krkSysBesFzlOlanlariSil(iller));
        System.out.println();

        System.out.println(hIleBaslayanOrUIleBitenElSil(iller));
        System.out.println();


    }//main

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHarfLenghtArtanDistinct(List<String> iller ){
        System.out.print("1) ");
        iller.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+" "));

    }



    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void bykHarfSonHarfArtanDistinct(List<String> iller ) {
        System.out.print("2) ");
        iller.
                stream().
                distinct().
                map(t-> t.toUpperCase()).//Lambda Expression
                sorted(Comparator.comparing(t -> t.charAt(t.length()-1))).//Lambda Expression
                forEach(t-> System.out.print(t + " "));//Lambda Expression
    }




    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar


    public static void bykHarfLengthArtanDistinctLengthAlfabetikSira(List<String> iller ) {
        System.out.print("3) ");
        iller.
                stream().
                distinct().
                map(String ::toUpperCase).//Method Referance()
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).//Method Referance()
                forEach(System.out::println);//Method Referance()
    }



    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz

    public static List<String> krkSysBesFzlOlanlariSil(List<String> iller ) {
        System.out.print("4) ");
        iller.removeIf(t->t.length()>5);
        return iller;
    }

    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz
    public static List<String>hIleBaslayanOrUIleBitenElSil (List<String> iller ){
        System.out.print("5) ");
        iller.removeIf(t->t.startsWith("H") || t.endsWith("u"));
        return iller;
    }



    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin




    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.


}