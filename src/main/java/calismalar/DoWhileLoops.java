package calismalar;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        //9dan 190 a kadar 7nin kati olan tum tamsayilari ekrana yazdiriniz

/*
        //  String s="";
        int i = 9;
        do {
            if (i % 7 == 0) {
                //   s=s+i+" ";
            }
            i++;

        } while (i < 191);
        System.out.println(i);


/*
    int i = 9;
do {

        if (i % 7 == 0) {
        System.out.print(i + " ");
        }
        i++;
        } while (i < 191);
      */
        /*
        System.out.println("*****************************************");
        //sifr Techpro.06
         Scanner input = new Scanner(System.in);
        System.out.println("Lutffen gecerli bir parola giriniz....");
        String prw = input.next();
        boolean kucukHarf = prw.replaceAll("[^a-z]", "").length() > 0;
        boolean buyukHarf = prw.replaceAll("[^A-Z]", "").length() > 0;
        boolean ozelKarekter = prw.replaceAll("[\\p{Punct}]", "").length() > 0;
        boolean uzunluk = prw.length() > 7;
        do {
            boolean gecerli = kucukHarf && buyukHarf && ozelKarekter && uzunluk;

            if (gecerli == true) {
                System.out.println("sifrenizi kabul edimistir " + (kucukHarf && buyukHarf && ozelKarekter && uzunluk));
                break;

            } else {
                System.out.println("Grilen sifre yanlistr...");

              //  break;
            }
        } while (true);

*/
         Scanner input = new Scanner(System.in);
        String sifre;
        boolean kucukHarfVar = false;
        boolean buyukHarfVar = false;
        boolean ozelKarakterVar = false;
        do {
            System.out.print("Lütfen bir şifre girin: ");
            sifre = input.nextLine();

            for (int i = 0; i < sifre.length(); i++) {
                char karakter = sifre.charAt(i);
                if (Character.isLowerCase(karakter)) {
                    kucukHarfVar = true;
                } else if (Character.isUpperCase(karakter)) {
                    buyukHarfVar = true;
                } else if (!Character.isLetterOrDigit(karakter)) {
                    ozelKarakterVar = true;
                }
            }
            if (sifre.length() < 8) {
                System.out.println("Hata: Şifre en az 8 karakter olmalıdır.");
            } else if (!kucukHarfVar) {
                System.out.println("Hata: Şifre küçük harf içermelidir.");
            } else if (!buyukHarfVar) {
                System.out.println("Hata: Şifre büyük harf içermelidir.");
            } else if (!ozelKarakterVar) {
                System.out.println("Hata: Şifre özel karakter içermelidir.");
            }
        } while (sifre.length() < 8 || !kucukHarfVar || !buyukHarfVar || !ozelKarakterVar);
        System.out.println("Şifreniz kabul edilmiştir.");



    }
}