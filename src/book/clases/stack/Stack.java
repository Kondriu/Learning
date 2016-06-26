package book.clases.stack;

/**
 * Created by dmitriy on 09.06.16.
 */
public class Stack {

    int stk[] = new int[10];
    int tos;

    // инициализировать вершину стека
        Stack() {
        tos = -1;
    }

    //разместить элемент в стеке
    void push (int item){
        if (tos ==9)
            System.out.println("Stack owerflow.");
        else {
            stk[++tos] = item;
        }
    }

    //извлеч элемент из стека
    int pop (){
        if (tos < 0){
            System.out.printf("Stack not load.");
            return 0;
        } else {
            return stk[tos--];
        }
    }
}
