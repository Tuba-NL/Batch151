package introduction.day03scanner;

public class Runner {
    public static void main(String[] args) {

        Car  myCar = new Car();
        System.out.println(myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        Student tomHanks = new Student();
        System.out.println("tomHanks.name = " + tomHanks.name);
        System.out.println("tomHanks.grade = " + tomHanks.grade);
        System.out.println("tomHanks.adress = " + tomHanks.adress);
        tomHanks.feed();
        tomHanks.study();




    }




}
