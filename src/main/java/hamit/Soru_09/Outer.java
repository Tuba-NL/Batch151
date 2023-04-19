package hamit.Soru_09;

public class Outer {
    public static void main(String[] args) {
        Computer mouse = new Laptop();
        System.out.println(mouse.getValue(100, 200));
    }
}
