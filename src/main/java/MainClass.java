import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.json.JsonOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.Driver;
import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class MainClass {

    static  WebDriver driver;

    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "c:\\Users\\alexa\\IdeaProjects\\test_selenium\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();

//        driver.get("https://en.wikipedia.org/wiki/Main_Page");
//
//        WebElement link = driver.findElement(By.xpath("//li[@id='n-aboutsite']/a"));
//
//        System.out.println(link.getText());
//
//        link.click();

//        driver.get("https://www.amazon.com/");
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//div[@class='a-section grid-row-1']//div[@class='a-section a-spacing-none quadrant-container-0 aok-float-left']//a[@class='a-link-normal quadrant-overlay']")).click();
//
//        driver.findElement(By.xpath("//span[@class='a-list-item']//label//input[@name='s-ref-checkbox-21180942011']")).click();

        driver.get("https://market.yandex.ru/");
        driver.findElement(By.xpath("//span[text()='Бытовая техника']")).click();
        driver.findElement(By.xpath("//div[@class='section _32PriwSr5B _3WZ8yOWVnM _2pc-e5GHOv uVxPQP6pdS']//a[text()='Посудомоечные машины']")).click();
        driver.findElement(By.xpath("//fieldset[@class='_3YUd4sIiO9']//span[text()='Новый']")).click();
        System.out.println("Is radio button selected? " + driver.findElement(By.xpath("//fieldset[@class='_3YUd4sIiO9']//span[text()='Новый']")).isSelected());




        //  driver.quit();
    }
    public static void selectRadioButton(String name){
        driver.findElement(By.xpath("//fieldset[@class='_3YUd4sIiO9']//span[text()='Новый']")).click();
    }
}
