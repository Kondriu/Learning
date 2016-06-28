package dima.homework9.other;

/**
 * Created by dmitriy on 11.06.16.
 */
public class Worker extends Human {
    protected String workplace;
    protected String exp;

    // constructor
    protected Worker(String n, String f, String a, String s, String w, String e) {
        super();
        workplace = w;
        exp = e;
    }
}
