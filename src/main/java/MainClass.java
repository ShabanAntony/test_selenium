import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.sql.SQLOutput;

public class MainClass {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "c:\\Users\\alexa\\IdeaProjects\\test_selenium\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(800, 600));

        driver.get("https://www.google.com");
        driver.navigate().to("https://www.selenium.dev/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        System.out.println(driver.getTitle());

        driver.quit();
    }
}
