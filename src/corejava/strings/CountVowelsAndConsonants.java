//Day 2 - Q2

package corejava.strings;

import java.util.Arrays;
import java.util.List;

public class CountVowelsAndConsonants {

    public static void main (String[] args){

        String str = "automation";
        int vowelCount = 0;
        int consonantsCount = 0;

        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

        for(int i = 0; i < str.length(); i++){
            if(vowels.contains(str.charAt(i))){
                vowelCount ++;
            }
            else{
                consonantsCount++;
            }
        }
        System.out.println("Vowel Count      - " + vowelCount);
        System.out.println("Consonants Count - " + consonantsCount);
    }
}
