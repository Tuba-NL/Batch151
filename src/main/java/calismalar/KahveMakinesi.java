package calismalar;


import java.util.Scanner;
public class KahveMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi kahveyi istersiniz?");
        System.out.println("1.Turk kahvesi");
        System.out.println("2.Filtre kahve");
        System.out.println("3.Espresso");
        

        String hangikahve = scan.nextLine().toLowerCase();

        if (hangikahve.equalsIgnoreCase("Turk Kahvesi") ||
                hangikahve.equalsIgnoreCase("Filtre Kahve") ||
                hangikahve.equalsIgnoreCase("Espresso")) {
            System.out.println("Kahve hazirlaniyor");
        } else {
            System.out.println("Gecersiz tanimlama");


        }

            System.out.println("Kahvenize sut ister misiniz?(Evet ya da hayir olarak cevaplayin)");
             String sut =scan.nextLine();

        if (sut.equalsIgnoreCase("evet")){
            System.out.println("Sut ekleniyor");
        }else if (sut.equalsIgnoreCase("hayir")){
            System.out.println("Sut eklenmiyor");
        }else{
            System.out.println("yanlis islem yaptiniz");

        }


        System.out.println("Kahvenize seker ister misiniz?(Evet ya da hayir olarak cevaplayin)");
        String seker = scan.nextLine();
        if(seker.equalsIgnoreCase("evet")){
            System.out.println("Seker ekleniyor");

        }else if (seker.equalsIgnoreCase("hayir")){
            System.out.println("Seker eklenmiyor");
        }else{
            System.out.println("yanlis islem yaptiniz");
        }


    }//main



}//class