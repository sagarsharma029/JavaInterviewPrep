//Day 3 - Q1

package corejava.strings;

import java.util.Arrays;
import java.util.List;

public class ReverseAllStrings {

    public static void main(String[] args){

        String sentence = "Java is powerful";
        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words){

            String rev = "";
            for (int i=word.length()-1; i>=0; i--){
                rev += word.charAt(i);
            }

            result += rev+" ";
        }
        System.out.println(result.trim());

    }
}
