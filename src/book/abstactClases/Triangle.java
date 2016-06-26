package book.abstactClases;

/**
 * Created by dmitriy on 10.06.16.
 */
public class Triangle extends Figure {
    public  Triangle(double a, double b){
        super (a, b);
    }

    @Override
    double area() {
        return a*b/2;
    }
}
