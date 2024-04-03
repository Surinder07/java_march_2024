package april2;

import java.util.Scanner;

public class Student {

    // variables , fields , member variables
    int id;
    String name;

    // member functions / methods
    public void showStudent() {
        System.out.println(id);
        System.out.println(name); // Argument
    }

    // what is a method?
    // set of block of statements which execute a specific task
    // examples ? main() , print() , close(), charAt(), toLowerCase(), next()


    /*access_modifier return_type nameOfMethod(){
      // some functionality is written

      return statement;

    }

    // Parameters
    // Arguments
    */

      public String askName(String name){ // parameter
          return "Sonu";
      }

      public void muteOptions(){
          System.out.println("Sonu muted himself");
      }




















    public static void main(String[] args) {

        // Object
        // How to create Object ?
        // name_of_class reference = new name_of_class();
        // new ? it will allocate memory to the object
        // heap and stack
        // int x = 10;
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        scanner.next();

    }

}
