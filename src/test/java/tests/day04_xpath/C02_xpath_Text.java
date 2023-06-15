package tests.day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_xpath_Text {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Bu soruyu text locator kullanarak yapın
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        WebElement addElementButton= driver.findElement(By.xpath("//*[text()='Add Element']"));
        addElementButton.click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//*[text()='Delete']"));
        if (deleteButton.isDisplayed()){
            System.out.println("Delete button testi PASSED");
        }else {
            System.out.println("Delete button testi FAILED");
        }
        //4- Delete tusuna basin
        Thread.sleep(2000);
        deleteButton.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        //WebElement addElementText = driver.findElement(By.tagName("h3"));
        WebElement addElementText = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if (addElementText.isDisplayed()){
            System.out.println("Add/Remove Elements gorunurluk testi PASSED");
        } else {
            System.out.println("Add/Remove Elements gorunurluk testi FAILED");
        }

        Thread.sleep(3000);
        driver.close();

    }
}
