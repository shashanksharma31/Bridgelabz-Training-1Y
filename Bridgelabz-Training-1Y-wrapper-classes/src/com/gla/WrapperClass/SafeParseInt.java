package scr.com.gla.Wrapper Class;

public class SafeParseInt {
    static int parse(String s){
        try{
            return Integer.parseInt(s);
        }catch(Exception e){
            return -1;
        }
    }

    public static void main(String[] args){
        System.out.println(parse("123"));
        System.out.println(parse("abc"));
    }
}
