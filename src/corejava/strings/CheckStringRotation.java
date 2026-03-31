package corejava.strings;

public class CheckStringRotation {
    public static void main (String[] args){
        String s1 = "ABCD";
        String s2 = "CDAB";

        String s3 = s1 + s1;

        if(s3.contains(s2)){
            System.out.println("True");
        }
    else{
            System.out.println("False");
        }
    }
}
