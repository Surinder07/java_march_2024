package april9;

public class Demo {

    static {
        System.out.println("Inside the static block...");
    }

    {
        System.out.println("this is called as instance block ? ");
    }

    public static void main(String[] args) {
        System.out.println("Inside the main method");
        Demo d = new Demo();  // createing and ref to that object
        new Demo();


        // stack[method/thread]            Heap  [shareable]
        // Demo d --------->  new Demo();
    }
}

/*
In order to call a  method in Java we need object of that class.

static methods does not need object , it belongs to class rather than object



 */
