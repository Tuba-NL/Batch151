package calismalar;

public class Arrays6 {
    public static void main(String[] args) {
        /*
      6.soru Verilen String bir Array`de en uzun
      ve en kisa String`leri yazdiran bir method olusturun
         */
        String sehirler []={"KahramanMaras","Batman","Mus","Kars","Izmir","Canakkale"};
        enUzunVeEnKisa(sehirler);
    }

    public static void enUzunVeEnKisa(String[] sehirler) {
        String enUzunKelime = sehirler[0];
        String enKisaKelime = sehirler[0];
        for (String w:sehirler){
            if(w.length()>enUzunKelime.length()){
                enUzunKelime =w;
        }
        if(w.length()<enKisaKelime.length()){
            enKisaKelime=w;
        }
    }
        System.out.println("en kisa kelime : " + enKisaKelime);
        System.out.println("en uzun kelime : " + enUzunKelime);
}
}