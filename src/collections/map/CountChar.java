//Day 5 - Q2

package collections.map;
import java.util.*;

public class CountChar {
    public static void main(String[] args){

        String str = "testing";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i<str.length(); i++){

            char c = str.charAt(i);

            int count = map.getOrDefault(c, 0);
            map.put(c, count + 1);

        }

        System.out.println(map);
    }
}
