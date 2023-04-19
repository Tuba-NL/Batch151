package practices.day_02_practice;

public class C04_SwitchCase {
    public static void main(String[] args) {
             /*

      Bir restoranda, müşteriler menüden yemeklerini seçerler.
      Restoran, müşterilerin seçtiği yemeği pişirmek için bir
      program yazilmasini ister. Örneğin, müşteriler menuden hangi yemegi
      secerse  o menunun musteriye hazirlanip sunuldugu ve ucretin
      belirlendigi bir program yaziniz
      */

      String yemek = "hamburger";
      switch (yemek) {
          case "hamburger":
              System.out.println("Hamburger Menusu 200Tl");
              break;
          case "pizza":
              System.out.println("Pizza Menusu 500Tl");
              break;
          case "tavuk":
              System.out.println("Tavuk Menusu 700Tl");
              break;
          default:
              System.out.println("Oyle bir secenegimiz yok");
      }
              /*
              Bir arac kiralama sitesinde secilen araba markasina gore degisen kiralam ucretine gore
              Toplam odenecek fiyati gostern kodu yaziniz
              SUV ==>500.0
              SEDAN ==> 400.0
              HATCBACK ==> 350.0
              geriye kalanlar ==>300.0 TL
              double toplamUcret = kiralamaUcreti * kiralanacakGunSayisi;

             */
              String aracTuru = "Suv";
              int kiralanacakGunSayisi = 5;
              double kiralamaUcreti;

              switch (aracTuru) {
                  case "Suv":
                      kiralamaUcreti = 500.0;
                      break;
                  case "Sedan":
                      kiralamaUcreti = 400.0;
                      break;
                  case "Hacback":
                      kiralamaUcreti = 350.0;
                      break;
                  default:
                      kiralamaUcreti = 300.0;
                      break;


              }
              double toplamUcret = kiralamaUcreti * kiralanacakGunSayisi;
              System.out.println("toplamUcret = " + toplamUcret);

            /*
        Hayvanat bahçesinde ziyaretçilere yemek vermek için bir robot kullanılıyor.
        Ziyaretciler hangi hayvani beslemek istiyorsa onun ismini yazsin  ve Robotta
        gidip o hayvani beslesin.Örneğin, ziyaretçilerin "fil" hayvanını beslemek
        istediklerini söylediklerinde, robot fil hayvanının yanına gider ve
        onlara yemek verir.Ziyaretçilerin hangi hayvanları beslemek istediklerini
        kontrol eden bir program yaziniz  (elephant,  lion ,giraffe  )
        default  ==> belirtile hayvan bulunamadi
         */

      }


    }
