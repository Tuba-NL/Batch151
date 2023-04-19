package day28interface;
/*
  1)Child        Parent
    Class     ==> Class : extends
    interface ==>interface : extends
    Class     ==> interface : implements
    interface ==>Class : olamaz...
    Ayni ise "extends", farkli ise "implements"kullanilir
    "interface" i Class`in Child`i yapma.

    Abstract Class ile Interface arasindaki farklar nelerdir?
  *1)Abstract Class'lar hem "abstract" hem de "concrete" method'lar icerebilir fakat interface'ler sadece "abstract" method icerir.
   Ama interface'lerde istersek "default" ve "static" keyword'lerini kullanarak "concrete" method uretebiliriz.
  *2)Abstract Class'lar multiple inheritance'i desteklemez ama interface'ler destekler.
  *3)Abstract Class'lar icinde her turlu variable olusturulabilir, interface'ler icindeki variable'lara public, static, ve final olmak zorundadir.
   4)"interface"  Class'in child'i olamaz ama "abstarct class" class'in child'i olabilir.
   5)Abstract class'larda constructor vardir ama object uretemez, interface'lerde constructor yoktur bu yuzden object uretilemez.
     */


public interface Mammal extends Animal{

    String feedBaby = "Milk";
    int age = 6;
}
