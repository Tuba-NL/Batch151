package practices.day_12_practice;

import java.util.concurrent.Callable;

public class C01 {
 //Bu class calistiginda output ne olur. Calisma mantigini anlatiniz.

 String isim= "Hasim";
 int yas = 20;

    public C01(String isim, int yas) {

      this.isim =  isim;
      this.yas = yas;
    }

    public C01() {

    }

    public static void main(String[] args) {
        C01 obj1 = new C01("Nuri",25);

        System.out.println(obj1.isim + "," + obj1.yas);

        C01 obj2 = new C01();

        System.out.println(obj2.isim + "," + obj2.yas);

            }
        }


