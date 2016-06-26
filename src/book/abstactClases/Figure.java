package book.abstactClases;

/**
 * Created by dmitriy on 10.06.16.
 */
public abstract class Figure {
    double a;
    double b;

    public Figure(double a, double b){
        this.a =a;
        this.b =b;
    }

    abstract double area();

}
