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
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainClass {

    static WebDriver driver;

    String dropDownCCode = "shortCountryCode";
    String dropDownMonth = "mm";


    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "c:\\Users\\alexa\\IdeaProjects\\test_selenium\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://market.yandex.ru/");

        driver.findElement(By.xpath("//span[text()='Бытовая техника']")).click();

        driver.findElement(By.xpath("//a[text()='Стиральные машины']")).click();

        //driver.findElement(By.xpath("//div[@class='_178jz2CyDL']/div[2]/ul[@class='_2y67xS5HuR']"));
        List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class=\"_178jz2CyDL\"]/div[2]//input[@type=\"checkbox\"]"));
        System.out.println(checkboxes.size());
        checkboxes.get(1).click();

    }












    }