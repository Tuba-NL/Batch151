package day17multidimensionalarraypassbyvalue;

public class PassByValue01 {

    public static void main(String[] args) {

        int shirtPrice = 200;
        System.out.println( discount("student",shirtPrice));
        System.out.println(shirtPrice);
        shirtPrice =discount("veteran",shirtPrice);
        System.out.println(shirtPrice);
    }
    //Discount Method`u olusturunuz
    public static int discount (String type,int price){
        switch(type){
            case "student":
                price = price-20;
                break;
            case "veteran":
                price = price-40;
                break;
            case "senior":
                price =price-30;
                break;
            default:
                price=price;
        }
        return price;
    }
}
