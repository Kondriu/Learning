package myClases;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 * Created by dmitriy on 6/2/16.
 */
public class MyFile {
    public static ArrayList fileExistContent;

    //прочитать файл построчно в лист
    public static List fileReadToList (String path) throws IOException {

        BufferedReader reader = null;
        fileExistContent = new ArrayList();
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
        fileWrite(path, (fileExistContent+toAppend));
//        fileWrite(path, (fileExistContent+"\n"+toAppend));


    }
    //удалить заданную символьную строку. передается в "toDelete"
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

    //удалить строку файла целиком
    public static void deleteStringOfFile(String path, String seq) {
        fileExistContent = new ArrayList();

        try {
            fileReadToList(path);
            for (int i =0; i<fileExistContent.size(); i++){
                if (fileExistContent.get(i).toString().indexOf(seq) != -1){
                    fileExistContent.remove(i);
                }
            }
            fileWriteFromList(path);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileWriteFromList (String path){
        StringBuilder str = new StringBuilder();
        for (int i =0; i<fileExistContent.size(); i++){
            str.append(fileExistContent.get(i).toString()+"\n");
        }

        try {
            fileWrite(path,str.toString());
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
