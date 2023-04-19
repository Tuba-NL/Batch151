package day30collections;
//Mehmet Hoca`nin dersinden:
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set03 {
    /*
    1) Set`ler tekrarsiz(==>unique) eleman depolamak icin kullanilir.
    2) 3 tane Set Classi vardir:
     a)HashSet Class:
     "Hash" benzersiz bir id olusturma teknigidir. Bu teknige hashing technique denir.
     "HashSet"elemanlari rastgele siralar.
     "HashSet" elemanlari siralamadigindan cok hizli calsisir.
     "HashSet" ler tekrarsiz eleman depolamak icin kullanilir.
     "HashSet" ler  "null'i eleman olarak kabul eder.

     b)LinkedHashSet Class:
     "LinkedHashSet" elemanlari sizin verdiginiz siraya gore (insertion order)
      dizdiklerinden  "HashSet"lere gore yavastir.
      "LinkedHashSet" ler tekrarsiz eleman depolamak icin kullanilir.
      "LinkedHashSet" ler null'i eleman olarak kabul eder.

      c)TreeSet Class:
      "TreeSet" ler elemanlari natural order (kucukten buyuge, alfabetik sira) ya gore dizerler.
      "TreeSet" ler elemanlari  natural ordere gore dizdiklerinden cok yavastirlar.
      En yavas set  "TreeSet" ler dir.
      "TreeSet" ler tekrarsiz eleman depolamak icin kullanilir.
      "TreeSet"ler "null'i eleman olarak kabul etmez.

     */
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Merve");
        hs.add("Tuba");
        hs.add("Sema");
        hs.add("Fatih");
        hs.add("Rana");
        hs.add("Sema");// Tekrarli eleman eklediginizde hata vermez ama tekrarli elemani bir kere depolar.
        System.out.println(hs);//[Fatih, Sema, Rana, Merve, Tuba]

        System.out.println(hs.hashCode());//149615145


        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(313);
        lhs.add(19);
        lhs.add(353);
        lhs.add(7);
        lhs.add(null);
        System.out.println(lhs);//[313, 19, 353, 7, null]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(313);
        ls.add(195);
        ls.add(353);
        ls.add(17);
        System.out.println(ls);//[313, 195, 353, 17]

        lhs.retainAll(ls);// ortak elemanlari lhs icinde bize verdi
        System.out.println(lhs);//[313, 353]
        System.out.println(ls);//[313, 195, 353, 17]


        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
       // ts.add(null);//expection veriyor.
        System.out.println(ts);//[A, G, R, U, Z]

        System.out.println(ts.first());//A
        System.out.println(ts.last());//Z

        System.out.println(ts.lower('R'));//G verilen elemanin bir onceki elemani verir.
        System.out.println(ts.lower('D'));//A

        System.out.println(ts.higher('R'));//U varsa bir sonrakini verir.
        System.out.println(ts.higher('T'));//U yoksa  sonrakini verir

        System.out.println(ts.headSet('R'));//[A, G]
        System.out.println(ts.headSet('R',true));//[A, G, R]

        System.out.println(ts.tailSet('R'));//[R, U, Z]
        System.out.println(ts.tailSet('R', false));//[U, Z]

        System.out.println(ts.ceiling('R'));//R varsa kensini  verir, HIGHER le farki.
        System.out.println(ts.ceiling('T'));//U yoksa  sonrakini verir.

        System.out.println(ts.floor('G'));//G eleman varsa aynisini verir.
        System.out.println(ts.floor('D'));//A yoksa oncekini verir , LOWER daki gibi

        System.out.println(ts.subSet('G', 'Z'));//[G, R, U]
        System.out.println(ts.subSet('G',false, 'Z',true));//[R, U, Z]




    }
}
