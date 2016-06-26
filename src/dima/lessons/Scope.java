package dima.lessons;

/**
 * Created by dmitriy on 15.05.16.
 */
public class Scope {

    public static void main(String[] args) {
        int x;
        x=10;

        if (x == 10){
            int y = 20;
            System.out.println("Х и У: " +x +" "+y);
            x=y*2;}
                  //y = 100;
    }
}
