//Day 2 - Q2

package corejava.arrays;
import java.util.*;

public class FindSecondLargest {

    public static void main(String[] args) {

        int[] arr = {10, 10, 10};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > secondMax && arr[j] < max) {
                secondMax = arr[j];
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("All numbers are same!");
        } else {
            System.out.println(secondMax);
        }
    }
}
//Alternate using Collections
        /*List<Integer> list = new ArrayList<>(Arrays.asList(10,5,25,40,15));
        int max = Collections.max(list);
        list.remove(Integer.valueOf(max));
        System.out.println(Collections.max(list)); */