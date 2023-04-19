package calismalar;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        // Kullanicidan bir ulke ismi aliniz .Alinan ulke adina gore kisaltmalari yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir ulke ismi giriniz");
        String countryName = input.nextLine();

        switch (countryName.toLowerCase()){
            case "turkey":
                System.out.println("TR");
            break;
            case "america":
                System.out.println("US");
            break;
            case "england":
                System.out.println("UK");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "fransa":
                System.out.println("FR");
                break;
            default:
                System.out.println("Bu ulke tanimli degil");

        }
    }
}
