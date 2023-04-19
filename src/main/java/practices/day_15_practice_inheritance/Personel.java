package practices.day_15_practice_inheritance;

public class Personel {
    // bir fabrikada gerekli olan departmanları;
    // Personel, Muhasebe, Memur, Isci, Surekliİsci, Ustabasi olarak farklı classlara ayırınız
    // Muhasebe departmanı, Personel departmanına baglı olacak
    // Memur ve Isci departmanları, Muhasebe departmanına baglı olacak
    // Surekliİsci ve UstaBasi departmanları, İsci departmanına baglı olacak

    // Memur, Surekliİsci ve UstaBası departmanlarından obje olusturarak,
    // variable'lara kendi departmanlarına gore deger atayınız ve yazdırını

    /*
    Personel class`i en ustteki clas oldugu icin herkes icin var olan datalari
    burada olusturabiliriz.
     */

    protected int persNo;
    protected String isim;
    protected String soyIsim;
    protected String adres="Adres girilmedi";
    protected String tel="Tel girilmedi";
}
