package introduction.day03scanner.genelcalisma;

import java.util.Scanner;

public class Tuba {
    public static void main(String[] args) {
        /*
        System.out.println(2+3>=5);//t
        System.out.println(2+3<=5);//t
        System.out.println(2+4!=5);//t
        System.out.println(2+3==5);//t

        int g = 2;
        int h =4;
        String i ="A";
        System.out.println((g*h)+( h-g)+i+( g-h)) ;
        System.out.println(( g*h)+( h-g)+( h/g)+i);

*/
         int num1 =4;
         int num2 =5;
         String s1 ="Ali";

        System.out.println(s1+num1+num2);
        System.out.println(num1+s1+num2);
        System.out.println(num1+num2+s1);



/*

        String str = "Ayhan BEYHAN";

        //Which ones change the given String to AYHAN beyhan?

               // Correct Answers
                str = str.replace(str.substring(0), "AYHAN beyhan");

        str = str.replace("Ayhan", "AYHAN");

        str = str.replace("BEYHAN", "beyhan");

        str = str.substring(0,5).toUpperCase();

        str = str.substring(6).toLowerCase();

*/
        Scanner scan = new Scanner(System.in);
        System.out.println("ad ve soyadinizi giriniz");
        String isim = scan.nextLine();
        System.out.println(isim);
    }

}
