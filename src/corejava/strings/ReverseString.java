//Day 1 - Q1

package corejava.strings;

public class ReverseString {
    public static void main(String [] args){
        String str = "Selenium";
        String rev = "";

        for (int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}

