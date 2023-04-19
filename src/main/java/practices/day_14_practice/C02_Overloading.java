package practices.day_14_practice;

public class C02_Overloading {
    public static void main(String[] args) { /*
        //Ayni classta ayni isimde method olusturunuz
        //Ayni classta ayni isimde method olusturabilmek icin:
          1)Parametrelerin data turleri degistirilebilir.
          2)Parametrelerin sayisileri degistirilebilir
          3)Parametrelerin data turleri farkli ise ,parametrelerin yeri degistirilebilir.
        */

        toplama(55, 66);
        toplama(2.3, 4.5);

        carpma(1,2,3);
        carpma(1,2,3,4);

        cikarma(3.7,1.3f);
        cikarma(1.3f, 3.7);
    }//main
 // 1)Parametrelerin data turleri degistirilebilir.
    private static void toplama(int a, int b) {
        System.out.println("iki int deger toplandi:" + (a + b));
    }
    private static void toplama(double a, double b) {
        System.out.println("iki double deger toplandi:" + (a + b));
    }


    //2)Parametrelerin sayisileri degistirilebilir
    private static void carpma (int a, int b, int c){
        System.out.println("uc int deger carpildi:" + (a*b*c));
    }
    private static void carpma (int a, int b, int c, int d) {
        System.out.println("dort int deger carpildi:" + (a * b * c *d));
    }

    //3)Parametrelerin data turleri farkli ise ,parametrelerin yeri degistirilebilir.
    private static void cikarma (double a, float b) {
        System.out.println("ilki double, ikincisi float cikarma islemi yapildi:" + (a - b));

    }
        private static void cikarma (float b, double a){
            System.out.println("ilki float, ikincisi double cikarma islemi yapildi:" + (a-b));

    }
}//class