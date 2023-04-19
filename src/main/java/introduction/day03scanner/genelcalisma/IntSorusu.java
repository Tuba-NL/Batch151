package introduction.day03scanner.genelcalisma;

public class IntSorusu {
    public static void main(String[] args) {
// interwiew questions usa QA lara sorulmus bir soru

// bir Stringteki tekrarsiz karakteri ekrana yazdiriniz
// String y= "abbccdc"; orjinal soru bu
// bizim ornegimiz daha kisa daha az islem yapmak icin
        String y = "abbccdc";

        char c = y.charAt(0);
        if(y.indexOf(c)== y.lastIndexOf(c)) {
            System.out.println(c);
        }

        char c1 = y.charAt(1);
        if ( y.indexOf(c1) == y.lastIndexOf(c1)){
            System.out.println(c1);
        }

        char c2 = y.charAt(2);
        if ( y.indexOf(c2)== y.lastIndexOf(c2)){
            System.out.println(c2);
        }

        char c3 = y.charAt(3);
        if (y.indexOf(c3)==y.lastIndexOf(c3)){
            System.out.println(c3);
        }

        char c4 = y.charAt(4);
        if (y.indexOf(c4)== y.lastIndexOf(c4)){
            System.out.println(c4);
        }
        char c5 = y.charAt(5);
        if ( y.indexOf(c5)== y.lastIndexOf(c5)) {
            System.out.println(c5);
        }

        char c6 = y.charAt(6);
        if ( y.indexOf(c6) == y.lastIndexOf(c6)){
            System.out.println(c6);
        }

    }
}
