//Day 1 - Q3

package corejava.strings;

public class CountOccurrence {
    public static void main(String[] args) {

        String str = "testing";

        for (int i = 0; i<str.length(); i++){

            char c = str.charAt(i);

            if (str.indexOf(c) != i){
                continue;
            }

            int count = 0;

            for (int j = 0; j<str.length(); j++){
                if(str.charAt(j) == c){
                    count ++;
                }
            }

            System.out.println(c + "->" + count);
        }
    }
}
