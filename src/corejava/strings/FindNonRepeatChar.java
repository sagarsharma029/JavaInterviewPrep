//Day 4 - Q1

package corejava.strings;

public class FindNonRepeatChar {
    public static void main(String[] args){

        String str = "tester";

        for (int i = 0; i<str.length(); i++){

            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){

                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
