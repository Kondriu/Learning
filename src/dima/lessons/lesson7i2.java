package dima.lessons;

/**
 * Created by root on 5/26/16.
 */
public class lesson7i2 {
    public static void main(String[] args) {

        StringBuilder bldr = new StringBuilder();
        int startOfSubstrIncl = 3;
        int endOfSubstrExcl = 5;
        int indexOffset = 4;
        int charIndex = 4;
        bldr.append("new end"); //дописать к строке в конец
        bldr.delete(startOfSubstrIncl, endOfSubstrExcl); // задаем позицию С... ПО и все между ними удадляем. п
        // причем именно удаляется. финальная строка будет меньше на удаленныйе символы
        bldr.insert(indexOffset, "some sub string"); //вставляется строка "" с заданного места
        bldr.replace(startOfSubstrIncl, endOfSubstrExcl, "replace"); // задали индексс какого начинать заменять
        // по индекс элеменнта по какой закончить. задавть надо точно, чтобы строка помещалась
        bldr.setCharAt(charIndex, 'a'); // задаем конуретный сивол н месте charIndex
        String bldrString = bldr.toString(); //сконвертировани в стринг результат действий
        System.out.println(bldrString);


        String palindrome = "moon";
        StringBuilder buildr = new StringBuilder(palindrome);
        buildr.reverse();


        if (palindrome.equals(buildr.toString()))
            System.out.println("palindrome");
        else {
            System.out.println("not palindrome");
        }

    }
}
