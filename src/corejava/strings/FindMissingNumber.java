package corejava.strings;

public class FindMissingNumber {
    public static void main(String[] args){

        int [] arr = {1,2,3,4,6};
        int n = 6;

        int total = n*(n+1)/2;

        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }

        System.out.println(total - arraySum);
    }
}
