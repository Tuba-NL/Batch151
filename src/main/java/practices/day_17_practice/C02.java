package practices.day_17_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02 {
    // Bir tane txt dosyası olusturunuz.
    // txt dosyasının icerisine cumleler yazınız
    // Olusturdugunuz txt dosyasına ulasınız.
    // icerisindeki cumleleri yazdırınız


    // NOT:
    //file ye ulaşmak için dosya yolunu almamız gerek
    //bunun için txt filesinin üstüne sağ tık, copy path,
    // path from contnt root, tırnak içindeki kısma ctrl v yaptık.



 public static void main(String[] args)  {
        String dosyaYolu ="src/main/java/practices/day_17_practice/dosya.txt ";

     try {
         FileInputStream fis = new FileInputStream(dosyaYolu);

         int k=0;

         while ((k=fis.read())!=-1){
             System.out.print((char)k);

         }

     } catch (FileNotFoundException e) {
         throw new RuntimeException(e);
     } catch (IOException e) {
         throw new RuntimeException(e);
     }

 }
}
