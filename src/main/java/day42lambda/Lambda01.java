package day42lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");
        names.add("Brad");


        System.out.println(sortWithLastCharDistinctUpperInList(names));

        System.out.println(sortWithLengthReversedSameLengthInNaturalLowerInList(names));

        System.out.println(isLengthMoreThanTwo(names));

        System.out.println(noLengthLessThanThree(names));

        System.out.println(atLeastOneLengthLessThanFour(names));
    }

    //Ex 1: List elemanlarını son harflerine göre natural order'da tekrarsız olarak büyük harfle bir List'in içinde return ediniz
    // [Tom, Alex, Jim, Michael, Mary, Alexander, Alex] ==> [MICHAEL, TOM, JIM, ALEXANDER, ALEX, MARY]
    public static List<String> sortWithLastCharDistinctUpperInList(List<String> names) {
        return names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                collect(Collectors.toList());// Normalde distinct elemanlari depolamak icin "Set" kullanilir.
        // ama lambda'daki collect(Collectors.toSet()); method'u elemanlari
        // rastgele siralar halbuki bu soruda rastgele siralama kabul edilmiyor.
        // Bu yuzden mecburen collect(Collectors.toList()); kullandik.
    }

    //Ex 2: List elemanlarını character sayilarina göre ters sirada`da kucuk harfle bir List'in içinde return ediniz.
    //Ayni karakter sayisina sahip elemanlar kendi icinde alfabetik sirada olsun.
    // [Tom, Alex, Jim, Michael, Mary, Alexander, Alex] ==> Alexander,Michael,Alex,Alex, Mary,Jim,Tom]

    public static List<String> sortWithLengthReversedSameLengthInNaturalLowerInList(List<String> names) {
        return names.
                stream().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length).reversed().thenComparing(t -> t.charAt(0))).
                collect(Collectors.toList());

    }

     /* Match
      allMatch() ==> tum elemanlar sarti saglarsa true dondurur
       anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
      noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
 */

    //Example 3: List elemanlarinin tamaminin character sayisinin 2 den buyuk olup olmadigini kontrol eden methodu olusturunuz
    public static boolean isLengthMoreThanTwo(List<String> names) {
        return names.stream().allMatch(t -> t.length() > 2);
    }

    //Example 4: List elemanlarinin hicbirinin character sayisinin 3 den kucuk olup olmadigini kontrol eden methodu olusturunuz
    public static boolean noLengthLessThanThree(List<String> names) {
        return names.stream().noneMatch(t -> t.length() < 3);
    }


    //Example 5: List elemanlarinin en az birinin character sayisinin 4 den kucuk olup olmadigini kontrol eden methodu olusturunuz
    public static boolean atLeastOneLengthLessThanFour(List<String> names) {
        return names.stream().anyMatch(t -> t.length() < 4);
    }

}

