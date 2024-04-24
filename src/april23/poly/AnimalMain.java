package april23.poly;

class Animal {
    public void makeSound(){
        System.out.println("Animal is making sound...");
    }
}

class Dog extends Animal {
    @Override     // annotations... for the compiler
    public void makeSound() {
        System.out.println("Dog barks...");
    }
}

public class AnimalMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.makeSound();

    }
}

/*
               Shape   [getArea()]
            |          |
        Rectangle     Circle
l*b                         PI r2

 */
