package book.clases.stack;

/**
 * Created by dmitriy on 09.06.16.
 */
public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        //разместить числва
        for (int i = 0; i<10; i++){
            mystack1.push(i);
        }
        for (int i = 10; i<20; i++){
            mystack2.push(i);
        }

        //извлечь эти числа
        System.out.println("содержиме 1 стека");
        for (int i = 0; i < 10; i++){
            System.out.println(mystack1.pop());
        }

        System.out.println("содержиме 2 стека");
        for (int i = 0; i < 10; i++){
            System.out.println(mystack2.pop());
        }


    }
}
