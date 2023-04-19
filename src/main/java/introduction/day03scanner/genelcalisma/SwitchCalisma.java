package introduction.day03scanner.genelcalisma;

import java.util.Scanner;

public class SwitchCalisma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String m = input.next();

        switch (m){
            case"A":
                System.out.println("first l");
                break;
            case"B":
                System.out.println("second l");
            case"C":
                System.out.println("third l");
                break;
            case"D":
                System.out.println("fourth l");
            default:
                System.out.println("what kind of");
        }


    }
}

