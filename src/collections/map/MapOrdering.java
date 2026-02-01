//Day 6 - Q3

package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapOrdering {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Banana", 2);
        hashMap.put("Apple", 5);
        hashMap.put("Orange", 3);

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 2);
        treeMap.put("Apple", 5);
        treeMap.put("Orange", 3);

        System.out.println("HashMap Output:");
        System.out.println(hashMap);

        System.out.println("TreeMap Output:");
        System.out.println(treeMap);
    }
}
