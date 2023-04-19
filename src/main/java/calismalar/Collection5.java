package calismalar;

import java.util.ArrayList;

public class Collection5 {
    public static void main(String[] args) {
        /*
        Bir ArrayList oluşturum ve önce ArrayListi yazdıralım sonra index numarasına göre tek tek yazdıralım.

        ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu

```
        Beklenen Çıktı:
```

```
        Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]
```

```
        siyah
```

```
        mavi
```

```
        kirmizi
```

```
        yesil
```

```
        mor
```

```
        turuncu
```*/


        ArrayList<String> myList = new ArrayList<>();

//String color;
        myList.add("siyah");
        myList.add("mavi");
        myList.add("kirmizi");
        myList.add("yesil");
        myList.add("mor");
        myList.add("turuncu");


        System.out.println(myList);
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println(myList.get(3));
        System.out.println(myList.get(4));
        System.out.println(myList.get(5));
    }
}
