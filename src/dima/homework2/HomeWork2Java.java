package dima.homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Created by root on 5/11/16.
 */
public class HomeWork2Java {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new FirefoxDriver();
        //перейти на страницу Приватбанка
        driver.get("https://privatbank.ua/");
        //подождем чтобы все загрузилось Thread.sleep(5000);


        //находим на странице поле со значением покупки (с помощью xPath)
        WebElement elementBy = driver.findElement(By.xpath(".//*[@id='selectByPB']/tr[3]/td[2]"));
        //нашел только способ получить данные как текст:
        String privatbankBuyUSD = elementBy.getText(); //надо поискать как сразу число получить
        //проверяю что получил
//        System.out.println( "Приватбанк. USD покупка: " +privatbankBuyUSD + "(строка)");
        //преобразовываю полученный текст в число:
        double dPrivatbankBuyUSD = new Double(privatbankBuyUSD);
        //проверяю что получил
        System.out.println( "Приватбанк. USD покупка: " +dPrivatbankBuyUSD);

        //повторяю все то-же, только для ячейки с данными о продажах
        WebElement elementSell = driver.findElement(By.xpath(".//*[@id='selectByPB']/tr[3]/td[3]"));
        String privatbankSellUSD = elementSell.getText();
//        System.out.println( "Приватбанк. USD продажа: " +privatbankSellUSD + "(строка)");
        double dPrivatbankSellUSD = new Double(privatbankSellUSD);
        System.out.println( "Приватбанк. USD покупка: " +dPrivatbankSellUSD);

        driver.close();


//------------перейти на страницу НБУ

        WebDriver driver3 = new ChromeDriver();

        driver3.get("http://www.bank.gov.ua/control/uk/curmetal/detail/currency?period=daily");
        //подождем чтобы все загрузилось        Thread.sleep(5000);

        //получаем в double курс покупки USD
        WebElement elementNBUBuy = driver3.findElement(By.xpath("html/body/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div[4]/table[4]/tbody/tr[7]/td[5]"));
        String sNBUBuyUSD = elementNBUBuy.getText();
//        System.out.println( "НБУ. USD покупка: " +sNBUBuyUSD + "(строка)");

        //получаем в double курс продажи USD
        WebElement elementNBUSell = driver3.findElement(By.xpath("html/body/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div[4]/table[4]/tbody/tr[7]/td[5]"));
        String sNBUSellUSD = elementNBUSell.getText();
//        System.out.println( "НБУ. USD продажа: " +sNBUSellUSD + "(строка)");



        //переводим полученные значения в числа:
        double dNBUBuyUSD1 = new Double (sNBUBuyUSD);
        double dNBUBuyUSD = dNBUBuyUSD1/100;
        System.out.println( "НБУ. USD покупка: " +dNBUBuyUSD);

        double dNBUSellUSD1 = new Double (sNBUSellUSD);
        double dNBUSellUSD = dNBUSellUSD1/100;
        System.out.println( "НБУ. USD продажа: " +dNBUSellUSD);

        driver3.close();


// среди банков - были только два (Приват и НБУ) которые хранили данные на странце которые можно сразу привести в Дабл
// остальные бакни показывают курс используя запятую, а не точку для разделения целой части и дробной.
// надо отдельно покурить как решить.
// решение (скорее просто костыль) нашел - надо найти и использовать команду которая заменит в полученной строке "," на "."

//------------укрсиб
        WebDriver driver2 = new ChromeDriver();

        //перейти на страницу Укрсиббанка
        driver2.get("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/");
        //подождем чтобы все загрузилось        Thread.sleep(5000);

        //получаем в String курс покупки USD:
        WebElement elementUkrSibBye = driver2.findElement(By.xpath(".//*[@id='no_tabs_content']/table/tbody/tr[1]/td[3]")); //нашли элемент
        String sUkrSibBuyUSD = elementUkrSibBye.getText(); //получили содержимое элемента в виде строки
        //получаем в double курс покупки USD:
        String dotsUkrSibBuyUSD = sUkrSibBuyUSD.replace(',', '.'); //преобразуем запятую в точку
//        System.out.println("Ощадбанк. покупка: "+dotsOschadBuyUSD+" - строка c точкой"); //для проверки
        double dUkrSibBuyUSD = Double.parseDouble(dotsUkrSibBuyUSD); //перевели в дабл
        System.out.println("Укрсиб. покупка: " +dUkrSibBuyUSD);

        //Получаем в String курс продажи USD
        WebElement elementUkrSibSell = driver2.findElement(By.xpath(".//*[@id='no_tabs_content']/table/tbody/tr[1]/td[4]"));
        String sUkrSibSellUSD = elementUkrSibSell.getText();
//        System.out.println("Ощадбанк. продажа: " +sUkrSibSellUSD +" - строка");
        //корректируем полученную строку
        String dotsUkrSibSellUSD = sUkrSibSellUSD.replace(',', '.');
//        System.out.println("Ощадбанк. продажа: " +dotsUkrSibSellUSD + " - строка с точкой");
        //получаем в double курс продажи USD:
        double dUkrSibSellUSD = Double.parseDouble(dotsUkrSibSellUSD);
        System.out.println("Укрсиб. продажа: " +dUkrSibSellUSD);

        driver2.close();




//------------Аваль

        WebDriver driver4 = new ChromeDriver();

        //перейти на страницу банка
        driver4.get("https://www.aval.ua/ru/personal/everyday/exchange/exchange/");
        //подождем чтобы все загрузилось
        //Thread.sleep(5000);

        //получаем в String курс покупки USD
        WebElement elementAvalBuy = driver4.findElement(By.xpath(".//*[@id='bar-center']/div[1]/div/div[1]/table/tbody/tr[2]/td[2]"));
        String sAvalBuyUSD = elementAvalBuy.getText();
//        System.out.println( "Аваль. USD покупка: " +sAvalBuyUSD + " (строка)");

        //получаем в String курс продажи USD
        WebElement elementAvalSell = driver4.findElement(By.xpath(".//*[@id='bar-center']/div[1]/div/div[1]/table/tbody/tr[2]/td[3]"));
        String sAvalSellUSD = elementAvalSell.getText();
//        System.out.println( "Аваль. USD продажа: " +sAvalSellUSD + " (строка)");

// чтобы уменьшить писанину - сразу заменю "," на "."
// хотя так делать не правильно - вдруг поменяют фомат числа на сайте и мой код работать не будет

        //получаем в double курс покупки USD
        String dotsAvalBuyUSD = sAvalBuyUSD.replace(',', '.');
        //проверим что получилось:
//        System.out.println("Аваль. покупка: " + dotsAvalBuyUSD + " - скорректированная строка");
        //переведем в дабл
        double dAvalBuyUSD = Double.parseDouble(dotsAvalBuyUSD);
        //проверим что получилось
        System.out.println("Аваль. покупка: " + dAvalBuyUSD );


        //получаем в double курс покупки USD
        String dotsAvalSellUSD = sAvalSellUSD.replace(',', '.');
        //проверим что получилось:
//        System.out.println("Аваль. продажа: " + dotsAvalSellUSD + " - скорректированная строка");
        //переведем в дабл
        double dAvalSellUSD = Double.parseDouble(dotsAvalSellUSD);
        //проверим что получилось
        System.out.println("Аваль. продажа: " + dAvalBuyUSD);


        driver4.close();

//----------------Ощадбанк

        //по аналогии с предидущими

        WebDriver driver5 = new ChromeDriver();

        //перейти на страницу Ощадбанка
        driver5.get("http://www.oschadbank.ua/ua/");
        //подождем чтобы все загрузилось
        //Thread.sleep(5000);

        //получаем в String курс покупки USD:
        WebElement elementOschadBuy = driver5.findElement(By.xpath(".//*[@id='site-content']/section[2]/div/div/div/div[1]/div/div[1]/span[2]/strong[1]")); //нашли элемент
        String sOschadBuyUSD = elementOschadBuy.getText(); //получили содержимое элемента в виде строки
//        System.out.println("Ощадбанк. покупка: "+sOschadBuyUSD + " - строка"); //для проверки
        //получаем в double курс покупки USD:
        String dotsOschadBuyUSD = sOschadBuyUSD.replace(',', '.'); //преобразуем запятую в точку
//        System.out.println("Ощадбанк. покупка: "+dotsOschadBuyUSD+" - строка c точкой"); //для проверки
        double dOschadBuyUSD = Double.parseDouble(dotsOschadBuyUSD); //перевели в дабл
        System.out.println("Ощадбанк. покупка: " +dOschadBuyUSD);

        //Получаем в String курс продажи USD
        WebElement elementOschadSell = driver5.findElement(By.xpath(".//*[@id='site-content']/section[2]/div/div/div/div[1]/div/div[1]/span[2]/strong[2]"));
        String sOschadSellUSD = elementOschadSell.getText();
//        System.out.println("Ощадбанк. продажа: " +sOschadSellUSD +" - строка");
        //корректируем полученную строку
        String dotsOschadSellUSD = sOschadSellUSD.replace(',', '.');
//        System.out.println("Ощадбанк. продажа: " +dotsOschadSellUSD + " - строка с точкой");
        //получаем в double курс продажи USD:
        double dOschadSellUSD = Double.parseDouble(dotsOschadSellUSD);
        System.out.println("Ощадбанк. продажа: " +dOschadSellUSD);


        driver5.close();

        System.out.println("-----------------------------------");

        double averageBuy = ((dPrivatbankBuyUSD+dAvalBuyUSD+dNBUBuyUSD+dOschadBuyUSD+dUkrSibBuyUSD)/5);
        System.out.println("Средний курс покупки USD: " +averageBuy);

        double averageSell = ((dNBUSellUSD+dAvalSellUSD+dOschadSellUSD+dPrivatbankSellUSD+dUkrSibSellUSD)/5);
        System.out.println("Средний курс продажи USD: " +averageSell);

//нагулил такой способ отсортировать переменные - как работает представляю очень приблизительно:

        double [] data = {dPrivatbankBuyUSD, dAvalBuyUSD, dNBUBuyUSD, dOschadBuyUSD, dUkrSibBuyUSD};
        sort(data);
        System.out.println("Минимальный курс покупки: " +data[0]);


        double [] data2 = {dNBUSellUSD, dAvalSellUSD, dOschadSellUSD, dPrivatbankSellUSD, dUkrSibSellUSD};
        sort(data2);
        System.out.println("Максималный курс продажи: " +data2[4]);

    }

//метод пузырьковой сортировки.
//просто копипаста из википедии, со старницы "Сортировка пузырьком".
//Заменил только в типах данных "int" "double":

    public static void sort (double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swapped = true;
                }
            }

            if(!swapped)
                break;
        }
    }

}
