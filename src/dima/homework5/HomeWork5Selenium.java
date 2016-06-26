package dima.homework5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.LazyCommandExecutor;

/**
 Задача по Selenium:

 Написать программу которая будет заходить в вконтакте. Проверять есть ли у кого-то день рождения сегодня.
 Если есть то:
 Отправляете ему поздравление в виде - Привет, Имя_юзера! + рандомная фраза из списка заготовленных фраз.


 Тоесть вы должны:

 Создать список заготовленных фраз
 Создать метод для входа в вк
 Метод для проверки есть ли у кого-то день рождения сегодня
 Метод для отправки сообщения
 */
public class HomeWork5Selenium {

    static WebDriver driver = new ChromeDriver();
    public static String message;

    public static void main(String[] args) throws InterruptedException {
        message = ", с днем рождения!";

        vkLogin();
        checkBirthday();
        sendMessage();
        driver.close();
    }

    public static void vkLogin (){
        driver.get("http://vk.com/"); //
        driver.findElement(By.xpath(".//*[@id='quick_email']")).sendKeys("dmitriy.vladimirovich@gmail.com");
        driver.findElement(By.xpath(".//*[@id='quick_pass']")).sendKeys("Ltkmaf");
        driver.findElement(By.xpath(".//*[@id='quick_login_button']")).click();
    }

    public static void checkBirthday() throws InterruptedException {

        driver.get("http://vk.com/friends?w=calendar");
/*
        String src = driver.findElement(By.cssSelector(".bd_actions > a:nth-child(1)")).getText();
        System.out.println(src);
        #bd_friend_row81734857 > div.fl_l.bd_actions > a:nth-child(1)
        /id81734857
        #bd_friend_row180574111 > div.fl_l.bd_actions > a:nth-child(1)
        /id180574111
        наверное надо использовать do_while пока находит таие эл-ты
*/
        driver.findElement(By.cssSelector(".bd_actions > a:nth-child(1)")).click();

        //получилось сделать клик по "сегодняшним дняим рождения"через такой тип селектора
    }

    public static void sendMessage () throws InterruptedException {

        driver.findElement(By.xpath(".//*[@id='mail_box_editable']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='mail_box_editable']")).sendKeys(generateMessage());
        Thread.sleep(1000);
        //driver.findElement(By.xpath(".//*[@id='mail_box_send']")).click();
    }

    public static String generateMessage () {
        String str = driver.findElement(By.cssSelector("td:nth-child(1) > div > nobr")).getText();
        return str+message;
    }
}
