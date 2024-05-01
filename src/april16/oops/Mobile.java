package april16.oops;

public class Mobile {
     private String brand;
      int capacity;


      // create a method which return specific variables
    // getters/setters

    public String getBrand(){
        return brand;
    }

    public Mobile(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
        System.out.println(brand);
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                '}';
    }
    // keyword : default


    // interafces --- default methods.
}
