package dima.homework8.filework;

import java.io.IOException;

/**
 * Created by dmitriy on 28.06.16.
 */
public class readbyline extends MyFileOld{
    public static void main(String[] args) throws IOException {
        String path = "/home/dmitriy/Рабочий стол/Expert/teacher.txt";
        fileReadToList(path);
        for (int i=0; i<fileExistContent.size(); i++){
            System.out.println("------------");
            System.out.println(fileExistContent.get(i));
        }
    }

}
