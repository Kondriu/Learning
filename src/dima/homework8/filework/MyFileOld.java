package dima.homework8.filework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitriy on 6/2/16.
 */
public class MyFileOld {
    public static ArrayList fileExistContent = new ArrayList();

    //прочитать файл
    public static List fileReadToList (String path) throws IOException {

        BufferedReader reader = null;
        String line;

        try {
            reader = new BufferedReader(new FileReader(path));
            while ((line = reader.readLine()) != null) {
                fileExistContent.add(line); //читается файл

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }return fileExistContent;
    }

    public static String fileReadToString (String path) throws IOException {

        BufferedReader reader = null;
        String line = "";
        String content = "";

        try {
            reader = new BufferedReader(new FileReader(path));
            while ((line = reader.readLine()) != null) {
                content += line+"\n"; //читается файл, сохраняется в строку
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }return content;
    }

    // отобразить
    public static String fileDisplayList (String path) throws IOException {
        String read = fileReadToList(path).toString();
        String content = read.substring(1,(read.length()-1));
        return content;
    }
    public static String fileDisplayString (String path) throws IOException {
        String content = fileReadToString(path);
        return content;
    }

    //записать
    public static void fileWrite (String path, String addLine) throws IOException {

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter( new FileOutputStream(path)));

        //writer.newLine();
        writer.append(addLine);
        writer.close();
    }

    //дописать в конец
    public static void fileAppend (String path, String toAppend) throws IOException {

        StringBuilder fileExistContent = new StringBuilder();
        fileExistContent.append(fileReadToString(path));
        fileWrite(path, (fileExistContent+"\n"+toAppend));

    }
    //удалить заданную строку. передается в "toDelete"
    public static void deleteString (String path, String toDelete) throws IOException {

        String oldFile = fileReadToString(path);
        StringBuilder updatedFile = new StringBuilder(oldFile);
        int firstIndex, lastIndex;

        firstIndex = updatedFile.indexOf(toDelete);
        lastIndex = firstIndex+toDelete.length();
        if (firstIndex != -1) {
            updatedFile.delete(firstIndex, lastIndex);
        }else System.out.println("нет такой фразы");
        fileWrite(path,updatedFile.toString());
    }
}
