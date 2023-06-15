package tests.day02_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //wise quarter anasayfaya gidelim
        driver.navigate().to("https://www.wisequarter.com");
        Thread.sleep(2000);
        // ayni browserda amazon anasayfaya gidelim
        driver.navigate().to("https://www.amazon.com.tr");

        //tekrar wise anasayfaya donun
        driver.navigate().back();
        Thread.sleep(2000);
        // yeniden amazona git
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.close();


    }
}