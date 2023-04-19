package day31collectionsmaps;

import java.util.*;
/*
        MY NOTES:
        Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
        "key" kismi tekrarsiz, "value kismi tekrarli olabilir.
        Mapler "key" ve "value" structur'ini kullanir.
        Map'lerdeki elemanlara "entry" denir.
        Elemanlarin tamanina ise "EntrySet" denilir.
        "Entry"ler tekrarsiz kullanim oldugu icin "EntrySet"denilir.
        "Key" ve "Value"lar ayri ayri data type`leinde olabilirler.
        "Map"ler Collection degildir, farkli bir yapidir.


        HashMap`ler "entry"leri rastgele siralar, bu yuzden en hizli map`dir.
                */

public class HashMap01 {

    public static void main(String[] args) {

        HashMap<String, Integer> countryPopulation = new HashMap<>();

        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye",83000000);
        countryPopulation.put("Netherland", 18000000);
        System.out.println(countryPopulation);//{Turkiye=83000000, USA=400000000, Nederland=18000000, Germany=83000000, Albania=3000000}


       // get() methodu "key" ile calisir ve "value" kismini verir
        int usaPopulation = countryPopulation.get("USA");
        System.out.println(usaPopulation);//400000000

        //Butun key`leri nasil alabiliriz?
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);//[Turkiye, USA, Netherland, Germany, Albania]

        //Butun "value"lari nasil alabiliriz?
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);//[83000000, 400000000, 18000000, 83000000, 3000000]

        //Ex: countryPopulation map`indeki ulkelerin nufuslarinin ortalamasi nedir?
        Collection<Integer> value = countryPopulation.values();
        int sum = 0;
        for (Integer w : value){
            sum = sum + w;

        }
        System.out.println(sum/ value.size());//117400000


        //entrySet() "entry"leri kalip halinde alip bize "Set"in icine kopyarak verir.
        //Loop`lar map`ler ile kullanilamaz. Sadece entry`ler arasinda gezmek istedigimizde loop kullanabiliriz.
        System.out.println(countryPopulation.entrySet());//[Turkiye=83000000, USA=400000000, Netherland=18000000, Germany=83000000, Albania=3000000]
        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries);//[Turkiye=83000000, USA=400000000, Netherland=18000000, Germany=83000000, Albania=3000000]

        //Ex:countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin toplamini bulunuz
        int toplam = 0 ;

        for ( Map.Entry<String,Integer> w : entries ){
            toplam = toplam + w.getKey().length() + w.getValue();
        }
        System.out.println(toplam);//;587000034
    }
}
