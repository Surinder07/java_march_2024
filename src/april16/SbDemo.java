package april16;

public class SbDemo {
    public static void main(String[] args) {

        String s1 = new String("Mouse");
        System.out.println(s1);
        String s2 = s1.concat(" Keyboard");


        // mutable
        StringBuffer sb = new StringBuffer("Pragra");
        System.out.println(sb);

        sb.append(" Incorp. ");

        System.out.println(sb);
        System.out.println(sb.reverse());


        StringBuilder stringBuilder = new StringBuilder("test");



    }
}
