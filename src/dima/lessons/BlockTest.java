package dima.lessons;

/**
 * Created by dmitriy on 14.05.16.
 */
public class BlockTest {

    public static void main(String[] args) {

        byte x, y;
        y = 20;

        // адресатом э того оператора цикла служит блок кода

        for (x=0; x<10; x++){
            System.out.println("Знaчeниe х: " + x);
            System.out.println("Знaчeниe у: " + y);
            y--;
        }
    }
}
