package javaders.day09stringmanipulationsifstatement;

public class C02_IfStatement {
    public static void main(String[] args) {

      //  String y = "abbccdc"

        String y = "aac";//
      char ch  = y.charAt(0);
      if(y.indexOf(ch)== y.lastIndexOf(ch)){
          System.out.println(ch);
      }//if body


        char ch1 = y.charAt(1);
      if(y.indexOf(ch1)== y.lastIndexOf(ch1)){
          System.out.println(ch1);
      }//if body

        char ch2 = y .charAt(2);
      if(y.indexOf(ch2) == y.lastIndexOf(ch2)){
          System.out.println(ch2);
      }//if body

        // Ex : Verilen sayi pozitif ise ekrana "Sayi Pozitif " yazdiran kodu yaziniz
        int num = 65;
      if(num>0) {
          System.out.println("Sayi Pozitif");

      }//if body

       // Ex : Sayi -1 ile 10 arasinda ise ekrana "Verilen Data Rakamdir" yazdiran kodu yaziniz
          int rakam = 13;
      if (rakam>-1 && rakam<10){
          System.out.println("Verilen data rakamdir");
      }
      //sayi 3 basamakli ise "Verilen Data 3 Basamaklidir" yazdiran kodu yazdirin.

     int sayi = -1000;
      sayi = Math.abs(sayi);
      if (sayi>99 && sayi<1000){
          System.out.println("Verilen Data 3 Basamaklidir");
      }
    }
}













