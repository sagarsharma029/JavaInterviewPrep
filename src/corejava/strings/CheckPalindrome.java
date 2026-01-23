//Day 2 - Q1

package corejava.strings;

public class CheckPalindrome {

    public static void main (String[] args){
        String str = "Tenet";
        str = str.toLowerCase();
        String check = "";

        for (int i = str.length() - 1; i>=0; i--){
            check += str.charAt(i);
        }

        if(str.equals(check)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
