package april27;

public interface Furniture {
    int numberOfLegs = 4;

    void area();
    void perimeter();
    void material();
}

class Chair implements Furniture {

    @Override
    public void area() {
        System.out.println("area of chair....");
    }

    @Override
    public void perimeter() {
        System.out.println("perimeter of chair....");
    }

    @Override
    public void material() {
        System.out.println("material of chair....");
    }
}

class Table implements Furniture {
    @Override
    public void area() {

    }

    @Override
    public void perimeter() {

    }

    @Override
    public void material() {

    }
}

class MainDemo {
    public static void main(String[] args) {

        Furniture furniture = new Table();
        furniture.area();
        furniture.material();
        furniture.perimeter();

    }
}

/*

10 mins
create Furniture ------





 */
