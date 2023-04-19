package javaders.day09stringmanipulationsifstatement;

public class C01_StringManipulations {
    public static void main(String[] args) {
        // ***************** isEmpty () *************\\
        /* 
        isEmpty () bos mu dolu mu diye bakar.Bize boolean 
        
         */
        // EX:Bir String in hic karakter icermedigini gosteren kodu yaziniz
        String str = "";
        //1.Yol lengt()
        boolean bosMu = str.length()==0; //2 is yaptirildi: length en ==
        System.out.println("bosMu = " + bosMu);//true
        
        boolean bosMu2 = str.isEmpty(); //1 is yaptirildi (makbul olan budur)
        System.out.println("bosMu2 = " + bosMu2);//true

        //EX: Bir String`in bosluk haric hic bir karakter icermedigini kontrol eden kodu yaziniz.
        String str2 = " ";
        //1.Yol
        boolean result = str2.replace(" ", "").length()==0;
        System.out.println("result = " + result);//true

        //2.Yol
        boolean result2 = str2.replace(" ", "").isEmpty();
        System.out.println("result2 = " + result2);//true

        String str3 = "*";
        boolean rslt = str3.replace("*","").length()==00;
        boolean rslt2 = str3.replace("*","").isEmpty();
        System.out.println("rslt = " + rslt);//true
        System.out.println("rslt2 = " + rslt2);//true
        
        // ***************  isBlank  ************\\
        /* 
        isBlank; methodu String bir datada Space+hiclik icin true dondurur.
                bosmu dolumu oldugunu kontrol eder . Boolean bir deger dondurur.
                isEmpty den farki variable`da sadece space varsa bosmu dolumu 
                diye soruldugunda isBlank == BOS der.
                                  isEmpty == BOS segil der.
                                          
         */ 
        
        
       // String str2 = " ";
        
        boolean rslt3 = str2.isBlank();
        System.out.println("rslt3 = " + rslt3);//true
        
        boolean rslt4 =  str2.isEmpty();
        System.out.println("rslt4 = " + rslt4);//false

        // *************** indexOf() **************\\

        /*Verilen karakter veya karekterlerin ilk gorunumunun INDEXini verir.
         tekli karekter icinde coklu karakter icinde kullanilabilir.
         Coklu data larda Srtring ifadeninilk gorunumunun ilk karakterinin indexini dondurur
         

         */
        // Ex : Bir String de a ,i ,e karakterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz
        
        String r = "Java is easy to Learn";
        int aIdk = r.indexOf('a');
        System.out.println("aIdk = " + aIdk);//1
        int iIdk = r.indexOf('i');
        System.out.println("iIdk = " + iIdk);//5
        int eIdk = r.indexOf('e');
        System.out.println("eIdk = " + eIdk);//8
        System.out.println("indeksler toplami " + (aIdk +iIdk+ eIdk) ) ;//14

        // EX: Bir String `de "Java" kelimesinin ilk olarak kacinci index`de
        // kullanildigini gosteren kodu yaziniz

        String u = "Ah Java vah Java sen ne guzel seysin Java";
        int idxJava  =u.indexOf("Java");
        System.out.println("idxJava = " + idxJava);//3

        int idxPhyton  =u.indexOf("Phyton");
        System.out.println("idxPhyton = " + idxPhyton);//-1
        
           //  **************************** lastIndex ()*************************\\

        // Ex : Bir String de a ,i ,e karakterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz
        String v = "Java is easy to Learn";

        
        int aLastIdx = v.lastIndexOf('a');//18
        System.out.println("aLastIdx = " + aLastIdx);
        
        int iLastIdx = v. lastIndexOf('i');//5
        System.out.println("iLastIdx = " + iLastIdx);
        
        int eLastIdx = v.lastIndexOf('e');//17
        System.out.println("eLastIdx = " + eLastIdx);


        System.out.println("aLastIdx+iLastIdx+eLastIdx : = " +
                ( aLastIdx+iLastIdx+eLastIdx));//aLastIdx+iLastIdx+eLastIdx : = 40
        

    }
}
