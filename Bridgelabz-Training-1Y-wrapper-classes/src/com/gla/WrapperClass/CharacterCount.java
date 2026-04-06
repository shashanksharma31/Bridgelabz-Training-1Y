package scr.com.gla.Wrapper Class;

public class CharacterCount {
    public static void main(String[] args) {
        String s = "a1@b2";
        int l=0,d=0,sp=0;

        for(char c:s.toCharArray()){
            if(Character.isLetter(c)) l++;
            else if(Character.isDigit(c)) d++;
            else sp++;
        }

        System.out.println(l);
        System.out.println(d);
        System.out.println(sp);
    }
}
