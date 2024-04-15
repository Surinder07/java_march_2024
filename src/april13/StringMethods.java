package april13;

public class StringMethods {
    public static void main(String[] args) {

        String s1 = "   pragra    ";
        System.out.println(s1.toUpperCase());
        String test = s1.concat("test");
        System.out.println(test);

        boolean s = s1.contains("p");
        System.out.println(s);

        String substring = s1.substring(2,3);
        System.out.println(substring);

        System.out.println(s1.trim());
        int length = s1.length();
        System.out.println(length);

     //  s1.concat()

        //


    }
}
