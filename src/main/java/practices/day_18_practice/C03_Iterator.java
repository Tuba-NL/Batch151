package practices.day_18_practice;

import java.util.*;

public class C03_Iterator {
    public static void main(String[] args) {
          /*
    Bir Deque olusturunuz icerisine int elemanlar ekleyiniz.
    5'den buyuk elemanları iterator ile yazdırınız

     */

        Deque<Integer> dq = new LinkedList<>(Arrays.asList(1,8,3,6,7));
        System.out.println(dq);


         Iterator itr = dq.iterator();//deque`lerde index yapisi yoktur, bu sebeple iterator kullanilir.

        while (itr.hasNext()){//yaninda eleman var mu kontrol ediyorum

            Object sayi = itr.next();//itr`i bir adim ileriye atiyorum
                                     //uzeinden gectigi elemani bize donduruyor.


            if((Integer)sayi>5){// sayi 5`ten buyuk mu kontrol ediyorum.Buyuk ise
                System.out.print(sayi+" ");// yazdiriyorum.


            }
        }

    }
}
