//Day 5  -Q1

package collections.list;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1, 3, 3, 2, 4, 1);
        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println(set);
    }
}