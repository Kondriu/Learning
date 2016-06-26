package book.clases.overload1;

/**
 * Created by dmitriy on 09.06.16.
 */
public class Overload {
    public static void main(String[] args) {

        OverLoadDemo1 ob = new OverLoadDemo1();
        double result;

        //вызвали все варинаты метода test()
        ob.test();
        ob.test(10);
        ob.test(11,12);
        result=ob.test(123.23);
        System.out.println("Результат вызова ob.test(123.23): "+result);
    }
}
