package may8.emp;

import java.util.ArrayList;
import java.util.List;

public class EmpList {
    public static void main(String[] args) {

        List<Employee> empListList = new ArrayList<>();
        empListList.add(new Employee("John","john@gmail.com",39, "Canada"));
        empListList.add(new Employee("Mark","mark@gmail.com",25, "US"));
        empListList.add(new Employee("Peter","peter@gmail.com",36, "US"));
        empListList.add(new Employee("Mike","mike@gmail.com",39, "Australia"));
        empListList.add(new Employee("Smith","smith@gmail.com",22, "Mexico"));
        empListList.add(new Employee("Joe","Joe@gmail.com",60, "US"));
        empListList.add(new Employee("Dan","Dan@gmail.com",55, "Canada"));
        empListList.add(new Employee("Will","Will@gmail.com",50, "Mexico"));

        // 1. all the employees with age greater than 35

        for (Employee emp : empListList) {

            if(emp.getAge() > 50) {
            // System.out.println(emp);

                System.out.println(emp.getName());

            }
        }


    }
}
