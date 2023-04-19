package calismalar;

public class ConcatenationSwap {

    public static void main(String[] args) {
        /*
 String s1="Java";
 String s2="Guzel";
 int a=5;
 int b=4;

        System.out.println(s1+" "+s2+" "+a+b);//Java Guzel 54
        System.out.println(s1+" "+a+" "+s2);//Java 5 Guzel
        System.out.println(s1+" "+(a+b)+b);//Java 94
        System.out.println(s1+" "+(a-b)+(a+b));//Java 19
        System.out.println(""+a+b+" "+s2);//54 Guzel

         */
        String isim="Tuba";
        String soyIsim="ICER";
        int age=38;
        System.out.println("Isminiz : "+isim );
        System.out.println("Soyisminiz : "+soyIsim);

        int a=10;
        byte b=3;
        System.out.println(a+b);

        int c=3;
        double d=1.3;
        System.out.println(c+d);

        char ch='a';
        System.out.println(ch);
        System.out.println(ch+c);
        System.out.println(c+ch);


        //swap
        int e=10;
        int f=20;
        System.out.println("Ilk deger : "+"e= "+e+" "+ "f= "+f);
        e=e-f;
        f=e+f;
        e=f-e;
        System.out.println("Son deger : "+"e= "+e+" "+ "f= "+f);


        //3.degisken
        int s1=10;
        int s2=20;
        System.out.println("Ilk deger : "+"s1= "+s1+" "+ "s2= "+s2);
        int s3=s1;
        s1=s2;
        s2=s3;
        System.out.println("Son deger : "+"s1= "+s1+" "+"s2= "+s2);
    }
}
