package calismalar;

import java.util.ArrayList;

public class Collection4 {
    public static void main(String[] args) {
      /*  Array Elemanları: sari,yesil,mavi,pembe

                **mavi rengini turuncu ile değiştirelim.**

```
        Beklene Çıktı:
```

```
[sari,yesil,mavi,pembe]
```

```
[sari,yesil,turuncu,pembe]
```*/
        ArrayList<String> words = new ArrayList<>();

        words.add("sari");
        words.add("yesil");
        words.add("mavi");
        words.add("pembe");
        System.out.println(words);
        words.set(2, "turuncu");
        System.out.println(words);
    }
}