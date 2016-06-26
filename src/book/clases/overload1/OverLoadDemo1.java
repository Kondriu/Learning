package book.clases.overload1;

/**
 * Created by dmitriy on 09.06.16.
 */
public class OverLoadDemo1 {
    void test () {
        System.out.println("нет параметров");
    }
    //Перегружаемый метод, проверяющий наличие одного целочисленного параметра
    void test (int a){
        System.out.println("a: "+ a);
        }
    //Перегружаемый метод, проверяющий наличие два целочисленных параметра
    void test (int a, int b){
        System.out.println("a: "+ a + "\tb: "+ b);
    }
    //Перегружаемый метод, проверяющий наличие параметра типа double
    double test(double a) {
        System.out.println("double a: "+ a);
        return a*a;
    }

}

