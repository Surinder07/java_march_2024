package april9;

public class AndroidStaticDemo {

    String brand;
    int capacity;
    static String os = "Android";

    public AndroidStaticDemo(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    public void printDetails(){
        System.out.println(brand);
        System.out.println(capacity);
        System.out.println(os);
        System.out.println();
    }

    public static void main(String[] args) {
        AndroidStaticDemo a1 = new AndroidStaticDemo("Samsung",256);
        AndroidStaticDemo a2 = new AndroidStaticDemo("Lg",128);
        AndroidStaticDemo a3 = new AndroidStaticDemo("Oneplus",512);
        AndroidStaticDemo a4 = new AndroidStaticDemo("Motorolla",512);

        a1.printDetails();
        a2.printDetails();
        a3.printDetails();
        a4.printDetails();
    }
}
