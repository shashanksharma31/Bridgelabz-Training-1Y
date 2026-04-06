package scr.com.gla.Wrapper Class;

public class ShoppingCart {
    public static void main(String[] args) {
        String[] arr = {"250","499","99","abc"};
        int sum = 0;

        for(String s:arr){
            try{
                sum += Integer.parseInt(s);
            }catch(Exception e){}
        }

        System.out.println(sum);
    }
}
