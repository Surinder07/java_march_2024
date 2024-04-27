package april27.inner;

public class OuterClass {


    int x = 10;

    public void outterClassMethod(){

    }

    static class InnerClass {
        int y = 0;

        public void innerClassMethod(){
           //  System.out.println(x);

        }
    }

    public static void main(String[] args) {

//        OuterClass outerClass = new OuterClass();
//        OuterClass.InnerClass obj = outerClass.new InnerClass();
//        obj.innerClassMethod();


        OuterClass.InnerClass ob = new OuterClass.InnerClass();
        ob.innerClassMethod();
    }
}
