package may4;

public class Employee<T, R> {

    T id;
    R name;

    public Employee(T id, R name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
class Main {
    public static void main(String[] args) {

        Employee<String, String> employee = new Employee<>("101", "Pragra");
        System.out.println(employee);

        Employee<Integer, Integer> employee2 = new Employee<>(101,101);
        System.out.println(employee);

    }
}

// flexitbility of working with any type of data
// type safety


// create a class Vehicle<T,R> ----
