package dima.homework9.other;

/**
 * Created by dmitriy on 11.06.16.
 */
public class Teacher extends Worker {

    protected String classRoom;
    protected String groupName;


    // constructor
    protected Teacher(String n, String f, String a, String s, String w, String e, String classRoom, String groupName) {
        super(n, f, a, s, w, e);
        this.classRoom = classRoom;
        this.groupName = groupName;
    }

}
