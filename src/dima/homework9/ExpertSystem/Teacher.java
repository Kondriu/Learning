package dima.homework9.ExpertSystem;

import java.io.IOException;

import static myClases.MyFile.*;

/**
 * Created by dmitriy on 28.06.16.
 */
public class Teacher extends Human {



    protected static void addTeacher () throws IOException {
        enterPersonFirstName();
        enterPersonLastName();
        enterScience();
        String tString = firstName + " " + lastName + "|"+science ;
        fileAppend(PathTeacher, tString);
        //fileWrite(PathTeacher, tString);

    }
    protected static void findTeacherByFirstName() throws IOException {
        enterPersonFirstName();
        fileReadToList(PathTeacher);
        //StringBuilder str = new StringBuilder(fileReadToString(PathTeacher));
        for (int i = 0; i < fileExistContent.size(); i++) {

            if (fileExistContent.get(i).toString().indexOf(firstName) != -1) {
                System.out.println(fileExistContent.get(i));
            }
        }

    }

    protected static void findTeacherByLastName() throws IOException {
        fileReadToList(PathTeacher);
        enterPersonLastName();
        for (int i = 0; i < fileExistContent.size(); i++) {

            if (fileExistContent.get(i).toString().indexOf(lastName) != -1) {
                System.out.println(fileExistContent.get(i));
            }
        }
    }

    protected static void findTeacherByFullName() throws IOException {
        enterPersonFirstName();
        enterPersonLastName();

        fileReadToList(PathTeacher);
        for (int i = 0; i < fileExistContent.size(); i++) {

            if (fileExistContent.get(i).toString().indexOf(lastName) != -1) {
                if (fileExistContent.get(i).toString().indexOf(firstName) != -1){
                    System.out.println(fileExistContent.get(i));
                }
            }
        }
    }




}
