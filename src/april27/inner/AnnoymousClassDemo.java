package april27.inner;



abstract class Television {

    public abstract void show();
}

interface A {
    void test();
}

public class AnnoymousClassDemo {


    public void test(){
        // Annonymous class

        Television tv = new Television() {

            @Override
            public void show() {

            }
        };

        tv.show();
    }
    public static void main(String[] args) {


        A a = new A() {
            @Override
            public void test() {
                System.out.println("somethibng..");
            }
        };
        a.test();
    }
}


// class Bank ---------
