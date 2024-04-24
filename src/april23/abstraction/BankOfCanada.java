package april23.abstraction;

public abstract  class BankOfCanada {


    int x;
    // constructor
    // why?

    public BankOfCanada(int x) {
        this.x = x;
        System.out.println(x);
    }

    public abstract double getRate();


}
class Bmo extends BankOfCanada {

    public Bmo(int x) {
        super(x);
    }

    @Override
    public double getRate() {
        return 5.5;
    }
}


class MainBank {
    public static void main(String[] args) {
       BankOfCanada bankOfCanada = new Bmo(10);
        System.out.println(bankOfCanada.getRate());


    }
}
