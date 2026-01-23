//Day 2 - Q3

package corejava.strings;

public class StringImmutability {
    public static void main(String[] args){

        String s1 = "QA Tester";
        String s2 = s1;

        System.out.println("Before changing s1 - ");
        System.out.println("s1 -> " + s1);
        System.out.println("s2 -> " + s2);

        s1 = "Senior ".concat(s1);

        System.out.println("After changing s1 - ");
        System.out.println("s1 -> " + s1);
        System.out.println("s2 -> " + s2);

    }
}
