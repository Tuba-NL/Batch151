package calismalar;

public class Exception2 {
    public static void main(String[] args) {
        System.out.println(exceptions());//acde
    }
    @SuppressWarnings("finally")
    public static String exceptions(){
        String result="";
        String v=null;
        try {
            try {
                result=result+"a";
                v.length();
                result=result+"b";
            }catch (NullPointerException e){
                result=result+"c";
            }finally {
                result=result+"d";
                throw  new Exception();
            }

            }catch (Exception e){result=result+"e";
        }
        return result;
    }
}
