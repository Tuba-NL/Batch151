package calismalar;

import org.w3c.dom.css.Counter;

public class Deneme {
/*
   static int count=0;
    public void increment() {
        count++;
    }

    public static void main(String[] args) {
        Deneme obj1= new Deneme();
        Deneme obj2= new Deneme();
        obj1.increment();
        obj2.increment();
        System.out.println("Obj1: count is="+ obj1.count);
        System.out.println("Obj2: count is="+ obj2.count);



 */


    int x;
    static int y;

    Deneme(int i) {
        x += i;
        y += i;
    }

    public static void main(String[] args) {
        new Deneme(2);
        Deneme dnm = new Deneme(3);
        System.out.println(dnm.x + "," + dnm.y);


      StringBuilder isim1 = new StringBuilder("Java");
      isim1.reverse();
      System.out.println("isim1 = " + isim1);

    }




}
