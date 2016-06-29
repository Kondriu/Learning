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
        fileReadToList(PathTeacher);
        int a = fileExistContent.size()+1;
        String tString = a+"|"+ firstName + "|" + lastName;
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

    protected static int findTeacherByFullName() throws IOException {
        enterPersonFirstName();
        enterPersonLastName();
        String tid = null;
        int a = -1;
        fileReadToList(PathTeacher);
        for (int i = 0; i < fileExistContent.size(); i++) {

            if (fileExistContent.get(i).toString().indexOf(lastName) != -1) {
                if (fileExistContent.get(i).toString().indexOf(firstName) != -1){
                    tid = fileExistContent.get(i).toString().substring(0,fileExistContent.get(i).toString().indexOf("|"));
                    //System.out.println(a);
                } //else System.out.println("not found");
            }
        }
        return Integer.parseInt(tid)-1;
    }

    protected static void displayFindTeacher () throws IOException {
//        findTeacherByFullName();
        fileReadToList(PathTeacher);
        try {
            String s = fileExistContent.get(findTeacherByFullName()).toString();
            int a1 = (s.indexOf("|"))+1;
            int a2 = (s.indexOf("|",a1));
            System.out.print("Прізвище: " +s.substring(a2,s.length())+"\n");
            System.out.print("Ім’я: " +s.substring(a1,a2)+"\n");
        } catch (NullPointerException e){
            System.out.println("нет такого");
        }
    }
//        deleteStringOfFile(Teacher.PathTeacher,firstName); //удалить учителя из списка учителей
    protected static void deleteTeacher () throws IOException {
        try {
            enterPersonFirstName();
            enterPersonLastName();

            deleteStringOfFile(PathTeacher, (firstName+" "+lastName)); //удалить учителя из списка учителей
        } catch (NullPointerException e){
            System.out.println("!!");
        }

    }

    protected static void replaceTeacher(){


    }

}
