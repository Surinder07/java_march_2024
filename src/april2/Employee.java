package april2;

public class Employee {
    int id;
    String name;

    //                               Parameters
    public void printEmployeeDetails(String name, int id){
        System.out.println(name);
        System.out.println(id);
    }

    public static void main(String[] args) {
        // Object of Employee Class
        Employee employee = new Employee();

        // to call the method we need to use object reference.
        employee.printEmployeeDetails("Sonu", 101);


    }

}
