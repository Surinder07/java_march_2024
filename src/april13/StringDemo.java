package april13;

public class StringDemo {
    public static void main(String[] args) {

        String s1 = "pragra";
        String s2 = "pragra";
        String s3 = new String("pragra");
        String s4 = new String("Pragra");
        char[] chars = s1.toCharArray();


        System.out.println(s1 == s3); // false
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s4); // false
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equalsIgnoreCase(s4));// true


        /*

        String s = "Pragra"

        reverse the string


         */




    }
}
