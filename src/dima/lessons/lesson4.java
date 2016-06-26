package dima.lessons;

/**
 * Created by root on 5/16/16.
 */
public class lesson4 {
    public static void main(String[] args) {

/*
        while (condition){
            statement
        }
  */

        int a = 5;
        int b = 20;
//сначала условие проверяется  => execute
        while (a>b){
            a--;
            System.out.println("a = " +a);
        }
// do while - сначала делает что-то потом проверяем

        do {
            b = b - 1;
            System.out.println("b = " +b);
        }
        while (a > b);



    }

}

