package may4;

public class Vehicle<T,R> {
    T model;
    R year;

    public Vehicle(T model, R year) {
        this.model = model;
        this.year = year;
    }
}
