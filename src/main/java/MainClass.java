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
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "c:\\Users\\alexa\\IdeaProjects\\test_selenium\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();

//        driver.get("https://en.wikipedia.org/wiki/Main_Page");
//
//        driver.findElement(By.xpath("//form//input[@id='searchInput']")).sendKeys("Selenium webDriver");
//
//        driver.findElement(By.xpath("//form//input[@id='searchButton']")).click();
//
//        System.out.println(driver.findElement(By.xpath("//div[@id='searchText']//input[@id='ooui-php-1']")).getAttribute("value"));
//
//        driver.findElement(By.xpath("//div[@id='searchText']//input[@id='ooui-php-1']")).clear();

        driver.get("https://github.com/");
        driver.findElement(By.xpath("//input[@id='user[login]']")).sendKeys("testUser");
        driver.findElement(By.xpath("//input[@id='user[email]']")).sendKeys("testUser@email.java");
        driver.findElement(By.xpath("//input[@id='user[password]']")).sendKeys("233228");
        driver.findElement(By.xpath("//button[@class='btn-mktg btn-primary-mktg btn-large-mktg f4 btn-block my-3']")).click();

        String massege = driver.findElement(By.xpath("//dd[@class='error']")).getText();

        if (massege.contains("not available")){
            System.out.println("Error!");
        }else
        System.out.println("Log in passed");

//        driver.findElement(By.linkText("Log in"));
//
//        WebElement link = driver.findElement(By.linkText("Log in"));
//
//        WebElement link2 = driver.findElement(By.partialLinkText("Donate"));
//
//        WebElement search = driver.findElement(By.name("search"));
//
//        WebElement buttonSearch = driver.findElement(By.className("searchButton"));
//
//        WebElement buttonSearchMw = driver.findElement(By.id("mw-searchButton"));
//
//        WebElement searchCssSelecror = driver.findElement(By.cssSelector("div#p-search"));
//
//        System.out.println(link.getText());
//
//        System.out.println(link2.getText());

//        driver.get("https://github.com/");
//
//        WebElement button = driver.findElement(By.xpath("//form//button[@class='btn-mktg btn-primary-mktg btn-large-mktg f4 btn-block my-3']"));
//
//        if (button.getText().equals("Sign up for GitHub")) {
//            System.out.println("Success!");
//        }else System.out.println("Fail!");
//
//        System.out.println("Button text is: " + button.getText());


//        button.submit();




//        driver.navigate().to("https://www.selenium.dev/");
//
//        driver.navigate().back();
//
//        driver.navigate().forward();
//
//
//        driver.navigate().refresh();
//
//        System.out.println(driver.getTitle());

      //  driver.quit();
    }
}
