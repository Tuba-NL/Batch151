package practices.day_17_practice;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

    public class C03 {

        // Bir tane txt dosyası olusturunuz.
        // txt dosyasının icerisine cumleler yazınız
        // Olusturdugunuz txt dosyasına ulasınız.
        // icerisindeki cumleleri yazdırınız

        public static void main(String[] args) {
            /*
            Bir kod yazilirken olasi exceptionlari ongorup exception olustugunda
            javanin ne yapmasini istedigimize karar vermeliyiz.

            1- Eger exception olustugunda kodun calismaya devam etmesini istemiyorsak;
            method isminin yanina olusabilecek exception`i deklare ederiz.

            2- Eger exception olussa da kodun calismaya devam etmesini istiyorsak;
            sorun olusturabilecek kodu try blogunun icine yazmaliyiz.
            Catch bloguna ise exception durumunda java`nin ne yapmasini istedigimizi yazmaliyiz.
             */


            String dosyaYolu = "src/main/java/day_17_praaaaactice/dosya.txt";

            try {
                FileInputStream fis = new FileInputStream(dosyaYolu);

                int k=0;

                while ((k=fis.read())!=-1){
                    System.out.print((char) k);
                }



            } catch (FileNotFoundException e) {//ilk catch ya dosya yoksa icin
               // e.printStackTrace();
                System.out.println("yoluma devam ediyorum");
            }
            catch (IOException e) {//ikinci catch ise ya okuyamazsam icin
               // e.printStackTrace();
                System.out.println("Yoluma devam ediyorum");
            }


        }


    }
/*
    Exceptionlar icin parent child iliskisi mevcuttur,
    eger bir kod icin birden fazla exception olusma ihtimali varsa
    oncelikle olasi exceptionlar parent child iliskisi tasiyor mu bakmamiz gerekir,
    eger parent child iliskisi yoksa , istedigimiz sirada catch cumleleri olusturabiliriz.


   Eger parent child iliskisi varsa sadece parent exception`i yazabiliriz;
   veya ikisini de yazmak istersek child`i once parent`i sonra yazmaliyiz.
 */
