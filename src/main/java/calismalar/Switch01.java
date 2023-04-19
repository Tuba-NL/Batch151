package calismalar;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //Kulllanicidan 2 sayi ve yapilacak islemi alan ve +,-,*,/,% islemlerini yapan kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz...");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("lutfen islem yapiniz. +,-,*,/,% islemlerinden birini kullaniniz ");
        char opr =input.next().charAt(0);

        switch (opr){
            case '+':
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case '-':
                System.out.println(a+"-"+b+"="+(a-b));
                break;
            case '*':
                System.out.println(a+"*"+b+"="+(a*b));
                break;
            case '/':
                System.out.println(a+"/"+b+"="+(a/b));
                break;
            case '%':
                System.out.println(a+"%"+b+"="+ (a*b/100));
                break;
            default:
                System.out.println("gecerli ifade giriniz");


        }
    }
}
