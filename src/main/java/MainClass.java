import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;
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

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "c:\\Users\\alexa\\IdeaProjects\\test_selenium\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://login.yahoo.com/account/create?.src=ym&.lang=ru-RU&.intl=ru&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.src%3Dfp&authMechanism=primary&specId=yidReg");

        driver.findElement(By.xpath("//div[@class='phone-country-code pure-u-1']//div[@class='puree-dropdown']/select[@role='combobox']")).click();
        driver.findElement(By.xpath("//div[@class='phone-country-code pure-u-1']//div[@class='puree-dropdown']/select[@role='combobox']//option[@role='option'][1]")).click();


    }


    public static void  selectOption(String listName, String option){

        String listXpath = "//div[@id='relative-country-code']//div[@class='puree-dropdown']/select[@role='combobox']";
        String optionXpath = "//div[@id='relative-country-code']//div[@class='puree-dropdown']/select[@role='combobox']//option[1]";

        driver.findElement(By.xpath("//select[@name='shortCountryCode']"));
        driver.findElement(By.xpath("//select[@name='mm']"));






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

//        driver.get("https://market.yandex.ru/");
//        driver.findElement(By.xpath("//span[text()='Бытовая техника']")).click();
//        driver.findElement(By.xpath("//div[@class='section _32PriwSr5B _3WZ8yOWVnM _2pc-e5GHOv uVxPQP6pdS']//a[text()='Посудомоечные машины']")).click();
//        driver.findElement(By.xpath("//fieldset[@class='_3YUd4sIiO9']//span[text()='Новый']")).click();
//        System.out.println("Is radio button selected? " + driver.findElement(By.xpath("//fieldset[@class='_3YUd4sIiO9']//span[text()='Новый']")).isSelected());
//
//      //  following-sibling
//        //  driver.quit();s
//    }
//
//    public static void selectCheckBox(String name) {
//        String rbXpath = "//fieldset[@class='_3YUd4sIiO9']//span[text()='Новый']";
//        if (!driver.findElement(By.xpath("//fieldset[@class='_3YUd4sIiO9']//span[text()='Новый']")).isSelected()) {
//            driver.findElement(By.xpath("//fieldset[@class='_3YUd4sIiO9']//span[text()='Новый']")).click();

    }
}