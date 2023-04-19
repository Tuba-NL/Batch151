package practices.day_01_practice;

public class Q01_variables {
    public static void main(String[] args) {
        int age = 15;
        int number = 43;
        String isim = "Ali";


        System.out.println(age);
        System.out.println("number = " + number);
        System.out.println("isim = " + isim);

        int myAge = age;
        System.out.println("myAge = " + myAge);
        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);

        int year = 2022, month = 3, day = 15;
        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("day = " + day);

        year = 2023;
        System.out.println("year = " + year);

        year = 2030;
        System.out.println("year = " + year);

        isim = "veli";
        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);

        double x;
        double y = 55.6;
        double z = 10;
        x = y;
        x = 15.3;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);



    }
}
