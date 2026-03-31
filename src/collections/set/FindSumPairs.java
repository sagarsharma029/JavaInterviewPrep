package collections.set;

import java.util.*;

public class FindSumPairs {
    public static void main(String[] args){

        int[] arr = {1, 2, 4, 3, 5, 6, 8, 9};
        int target = 10;

        Set<Integer> seen = new HashSet<>();
        Set<String> output = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (seen.contains(complement)) {
                int a = Math.min(num, complement);
                int b = Math.max(num, complement);

                String pair = a + "," + b;

                if (!output.contains(pair)) {
                    System.out.println("(" + a + ", " + b + ")");
                    output.add(pair);
                }
            }
            seen.add(num);
        }
    }
}