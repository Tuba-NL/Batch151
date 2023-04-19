package practices.day_15_practice_inheritance;

public class Isci extends Muhasebe {

    /*
    Bu class`dan da obje olusturabiliriz. Bu class`in child class`larinin olmasi
     obje olusturmaya engel degil ,fakat isciler icin ,surakli isci e ustabasi
      olmaktan baska ihtimal olmadigi icin isci class`indan isci uretmeye (obje) gerek yok.
     */
    protected String isciStatu = "Surekli Isci";
    protected void mesai(){
        System.out.println("Isciler gunluk 8 saat ve haftada 5 gun calisir");
    }
}
