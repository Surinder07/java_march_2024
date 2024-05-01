package april30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) {

        // checked exceptions

        File file = new File("nofile.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        try {
            System.out.println("Hello");
            Thread.sleep(5000);
            System.out.println("Hello after sleep ");
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}
