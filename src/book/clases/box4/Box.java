package book.clases.box4;

/**
 * Created by dmitriy on 08.06.16.
 */
public class Box {
    double wight;
    double height;
    double depth;

    double volume () {
        return height * depth * wight;
    }

    void setDim(double w, double h, double d){
        wight = w;
        height = h;
        depth = d;

    }

}
