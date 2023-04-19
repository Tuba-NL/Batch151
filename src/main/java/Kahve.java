import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Kahve {
    public static void main(String[] args) {
        Kahve obj = new Kahve();
        obj.showMenu();



    }

    Scanner input = new Scanner(System.in);

    String option;

    void showMenu() {
        System.out.println("Welcome to COFFEE HAYAL ");
        System.out.println("Please enter number coffee that you want to drink ");
        System.out.println("\n");
        System.out.println("1. Türk kahvesi");
        System.out.println("2. Filtre Kahve");
        System.out.println("3. Espresso");
        System.out.println("4. Exit");

        do {

            System.out.println("*************************************************************************************");
            System.out.println("Enter an option");
            System.out.println("*************************************************************************************");
            option = input.nextLine().toUpperCase(Locale.ROOT);
            System.out.println("\n");

            switch (option) {
                case "TURK KAHVESI":
                    System.out.println(option + "Hazirlaniyor");
                    System.out.println("\n" + "\n");
                    secenekler();
                    break;
                case "FILTRE KAHVE":
                    System.out.println(option + " Hazirlaniyor...");
                    System.out.println("**********************************************************************");
                    System.out.println("\n" + "\n");
                    secenekler();
                    break;
                case "ESPRESSO":
                    System.out.println(option + " Hazirlaniyor...");
                    System.out.println("**********************************************************************");
                    System.out.println("\n" + "\n");
                    secenekler();
                    break;
                case "EXIT":
                    System.out.println(option + " yapiliyor...");
                    System.out.println("**********************************************************************");
                    System.out.println("\n" + "\n");
                    break;
                default:
                    System.out.println("Invalid option!!  Please try again");
                    break;
            }
        } while (!option.equalsIgnoreCase("exit"));
    }

    void secenekler() {

        do {
            System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):");
            String strSeker = input.next();

            if (strSeker.equalsIgnoreCase("evet")) {
                System.out.println("Süt ekleniyor...");
                System.out.println("**********************************************************************");
                System.out.println("\n" + "\n");
                break;
            } else if (strSeker.equalsIgnoreCase("hayir")) {
                System.out.println("Süt eklenmiyor!!!");
                System.out.println("**********************************************************************");
                System.out.println("\n" + "\n");
                break;
            } else {
                System.out.println("lutfen gecerli bir deger giriniz");
                System.out.println("**********************************************************************");
                System.out.println("\n" + "\n");
            }
        } while (true);
        String bosKod1 = input.nextLine();

        do {
            System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) :");
            String strSut = input.next();

            try {
                if (strSut.equalsIgnoreCase("evet")) {
                    System.out.println("Kac seker istiyorsunuz" + "\n1 ile 5 arasinda secim yapiniz");
                    int kacSeker = input.nextInt();
                    System.out.println(kacSeker + " Seker ekleniyor");
                    System.out.println("**********************************************************************");
                    System.out.println("\n" + "\n");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Dikkat sadece 1 ile 5 arasinda rakam girmelisiniz!!"
                        + "\n Lutfen tekrar deneyin...:)");
            }
            if (strSut.equalsIgnoreCase("evet")) {
                System.out.println("Kac seker istiyorsunuz" + "\n1 ile 5 arasinda secim yapiniz");
                int kacSeker = input.nextInt();
                System.out.println(kacSeker + " Seker ekleniyor");
                System.out.println("**********************************************************************");
                System.out.println("\n" + "\n");
                break;
            } else if (strSut.equalsIgnoreCase("hayir")) {
                System.out.println("Seker eklenmedi!!!");
                System.out.println("**********************************************************************");
                System.out.println("\n" + "\n");
                break;
            } else {
                System.out.println("lutfen gecerli bir deger giriniz");
                System.out.println("**********************************************************************");
                System.out.println("\n" + "\n");
            }
        } while (true);
        String bosKod = input.nextLine();

        do {
            System.out.println("Kahveniz hangi boyutta olsun? (Büyük boy - Orta boy - Küçük boy olarak giriniz.) : ");
            String strBoyut = input.nextLine().toUpperCase();
            if (strBoyut.equalsIgnoreCase("BUYUK BOY")) {
                System.out.println(strBoyut + option + "hazirdir.Afiyet olsun...");
                System.out.println("**********************************************************************");
                System.out.println("\n" + "\n");
            } else if (strBoyut.equalsIgnoreCase("KUCUK BOY")) {
                System.out.println(strBoyut + " " + option + " hazirdir. Afiyet olsun...");
                System.out.println("**********************************************************************");
                System.out.println("\n" + "\n");
                break;
            } else if (strBoyut.equalsIgnoreCase("ORTA BOY")) {
                System.out.println(strBoyut + " " + option + " hazirdir. Afiyet olsun...");
                System.out.println("**********************************************************************");
                System.out.println("\n" + "\n");
                break;
            } else {
                System.out.println("Lutfen gecerli bir deger giriniz");
                System.out.println("**********************************************************************");
                System.out.println("\n" + "\n");
            }

        } while (true);

    }
}
