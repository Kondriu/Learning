
package dima.homework3;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by dmitriy on 16.05.16.
 */

public class HomeWork3Selenium {

   /*
Открыть сайт http://liniakino.com/showtimes/aladdin/
Выбрать любой сеанс на фильм “Перший месник: Протистояння” 18 травня, середа
Вывести в консоль список занятых и свободных мест. (в любом удобном для вас виде)
    */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://liniakino.com/showtimes/aladdin/");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='content-inner']/div/ul/li[3]/div[2]/div[1]/div/ul/li[3]/a")).click(); // открівается на 19 число. сеанс 21:40
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe"))); //надо переключить фокус дравера на открывшийся фрейм

        // надо сделать цикл, кторый будет генерить для каждого места хпас по принципу i++,
        // проверять доступность (возможно кликая и проверяя наличие кнопки купить)
        // и так-же генерировать соотвсевующий номер ряда и номер места, и выводить в консоль

        int a=1;
            for (int r = 1; r <= 8; r++) {
                for (int i = 1; i <= 19; i++) {
                    driver.findElement(By.xpath(".//*[@id='hall-scheme-container']/div/div[" + a + "]")).click();
                    boolean present;
                    try {
                        driver.findElement(By.xpath(".//*[@id='hall-scheme-buttons']/button[2]")).isDisplayed();
                        present = true;
                        System.out.println("Ряд " + r + ", Место " + i + "\t - свободно.");
                    } catch (NoSuchElementException e) {
                        present = false;
                        System.out.println("Ряд " + r + ", Место " + i + "\t - занято.");
                    }
                    driver.findElement(By.xpath(".//*[@id='hall-scheme-container']/div/div[" + a + "]")).click();
                    a++;
                }
            }

            for (int i = 1; i <= 23; i++) {
                    driver.findElement(By.xpath(".//*[@id='hall-scheme-container']/div/div[" + a + "]")).click();
                    try {
                        driver.findElement(By.xpath(".//*[@id='hall-scheme-buttons']/button[2]")).isDisplayed();
                        System.out.println("Ряд " + 9 + ", Место " + i + "\t - свободно.");
                    } catch (NoSuchElementException e) {
                        System.out.println("Ряд " + 9 + ", Место " + i + "\t - занято.");
                    }
                    driver.findElement(By.xpath(".//*[@id='hall-scheme-container']/div/div[" + a + "]")).click();
                    a++;
                }

        driver.close();

    }
}
