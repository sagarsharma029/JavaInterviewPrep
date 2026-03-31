package collections.map;

import java.util.*;
import java.util.stream.*;

public class ConvertToUpperCase {
    public static void main(String[] args){

        List<String> list = Arrays.asList("apple", "banana", "orange");

        List<String> upperList = list.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(upperList);
    }
}
