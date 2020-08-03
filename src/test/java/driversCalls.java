public class driversCalls {
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

//        driver.findElement(By.xpath("//form//input[@id='searchInput']")).sendKeys("Selenium webDriver");
//
//        driver.findElement(By.xpath("//form//input[@id='searchButton']")).click();
//
//        System.out.println(driver.findElement(By.xpath("//div[@id='searchText']//input[@id='ooui-php-1']")).getAttribute("value"));
//
//        driver.findElement(By.xpath("//div[@id='searchText']//input[@id='ooui-php-1']")).clear();

//        driver.get("https://github.com/");
//        driver.findElement(By.xpath("//input[@id='user[login]']")).sendKeys("testUser");
//        driver.findElement(By.xpath("//input[@id='user[email]']")).sendKeys("testUser@email.java");
//        driver.findElement(By.xpath("//input[@id='user[password]']")).sendKeys("233228");
//        driver.findElement(By.xpath("//button[@class='btn-mktg btn-primary-mktg btn-large-mktg f4 btn-block my-3']")).click();
//
//        String massege = driver.findElement(By.xpath("//dd[@class='error']")).getText();
//
//        if (massege.contains("not available")){
//            System.out.println("Error!");
//        }else
//        System.out.println("Log in passed");

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
