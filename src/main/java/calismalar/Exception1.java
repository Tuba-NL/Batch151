package calismalar;

public class Exception1 {
    public static void main(String[] args) {
        String s="";
        try{
            s+="t";
        }catch (Exception e){
            s+="c";
        }finally {
            {
                s+="f";
            }
            s+="a";
            System.out.print(s);//tfa
        }
    }
}
