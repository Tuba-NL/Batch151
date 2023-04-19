package practices.day_14_practice;

public class Child extends Parent {

    protected void method4(){
        System.out.println("Child instance method4");
    }

    public static void main(String[] args) {

        /*
        static variable`lari ve static methodlari farkli bir class`dan cagirabilmek icin
        class ismi kullanilir.
        Fakat bu iki class arasinda parent child iliskisi varsa direkt kullanilabilir.
         */


        System.out.println(Parent.isim); //Ali
        System.out.println(isim); //Ali

        isim ="Veli";
        System.out.println(isim); //Veli
        System.out.println(soyIsim); //Can

        soyIsim = "Tan";
        System.out.println(soyIsim); //Tan

        method1();//Parent static method1
        method2();//Parent static method2

        Child obj1 = new Child();
        System.out.println(obj1.yas); //30

        obj1.method3();//Parent instance method3
        obj1.method4();//Child instance method4

        Parent obj2 = new Parent();
        obj2.method4();//Parent instance method4


    }






}
