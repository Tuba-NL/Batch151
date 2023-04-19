package day30collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {
        //Ex:Ogrenci email adreslerini natural order`da siralanmis olarak depolayiniz.

        //  1.Yol:her eleman eklendiginde siralama yapar o yuzden yavas calisir
        long t1 = System.nanoTime();

        TreeSet<String>emails = new TreeSet<>();
        emails.add("abc@gmail.com");
        emails.add("abd@gmail.com");
        emails.add("abe@gmail.com");
        emails.add("abf@gmail.com");
        emails.add("abg@gmail.com");
        emails.add("abh@gmail.com");
        emails.add("abi@gmail.com");
        emails.add("abj@gmail.com");
        emails.add("abk@gmail.com");
        emails.add("abl@gmail.com");
        System.out.println(emails);//[abc@gmail.com, abd@gmail.com, abe@gmail.com, abf@gmail.com,
        // abg@gmail.com, abh@gmail.com, abi@gmail.com, abj@gmail.com, abk@gmail.com, abl@gmail.com]
        long t2 = System.nanoTime();


      //Interwiev Sorusu
        //2. Yol://HashSet`le hizlica calisir ve  TreeSet i en sona ekledigimiz icin bir kere siralama yapar
        //Not:HashSet benzersiz olduğu için öncelikle hashSet içine koyarız,sonra bunu treeSet e dönüştürürüz.
        //Böylece HashSet'in hızından faydalandıktan sonra TreeSet ile sıraya dizeriz.
        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("abc@gmail.com");
        emailsHs.add("abd@gmail.com");
        emailsHs.add("abe@gmail.com");
        emailsHs.add("abf@gmail.com");
        emailsHs.add("abg@gmail.com");
        emailsHs.add("abh@gmail.com");
        emailsHs.add("abi@gmail.com");
        emailsHs.add("abj@gmail.com");
        emailsHs.add("abk@gmail.com");
        emailsHs.add("abl@gmail.com");
        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs);//[abc@gmail.com, abd@gmail.com, abe@gmail.com, abf@gmail.com,
        // abg@gmail.com, abh@gmail.com, abi@gmail.com, abj@gmail.com, abk@gmail.com, abl@gmail.com]
        long t3 = System.nanoTime();

        System.out.println(t2-t1);//TreeSet
        System.out.println(t3-t2);//HashSet
    }
}