package tests.day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C04_RelativeLocators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        //2 ) Berlin’i 3 farkli relative locator ile locate edin

        /*
        <img id="pid7_thumb" src="bots/sl-berlin-bot.png" class="ui-li-thumb">
        Relative locators locate edemedigimiz bir elementi locate etmek icin kullanırız
        Bu soruda ornek olması acısından BERLIN elementini locate edemedigimizi varsayıyoruz
         */
        //3 ) Relative locator’larin dogru calistigini test edin
        WebElement bostonElementi = driver.findElement(By.xpath("//img[@id='pid6_thumb']"));
        WebElement sailorElementi = driver.findElement(By.xpath("//img[@id='pid11_thumb']"));
        WebElement byAreaElementi = driver.findElement(By.xpath("//img[@id='pid8_thumb']"));
        WebElement nYCElementi = driver.findElement(By.xpath("//img[@id='pid3_thumb']"));

        WebElement berlin1 =driver.findElement(RelativeLocator.with(By.tagName("img")).above(sailorElementi));
        WebElement berlin2 =driver.findElement(RelativeLocator.with(By.id("pid7_thumb")).below(nYCElementi).toRightOf(bostonElementi));
        WebElement berlin3 = driver.findElement(RelativeLocator.with(By.className("ui-li-thumb")).toLeftOf(byAreaElementi));

        // 1.Locater test etmek icin
        String expectedIdValue ="pid7_thumb";
        String actualIdValue1 =berlin1.getAttribute("id");

        if (expectedIdValue.equals(actualIdValue1)){
            System.out.println("berlin id value testi PASSED");
        }else  {
            System.out.println("berlin id value testi FAILED");
        }
        // 2.Locater Test icin
        String expectedIdValue2 ="pid7_thumb";
        String actualIdValue2 =berlin2.getAttribute("id");

        if (expectedIdValue2.equals(actualIdValue2)){
            System.out.println("berlin id value testi PASSED");
        }else  {
            System.out.println("berlin id value testi FAILED");
        }

        //3. Locater testi
        // 2.Locater Test icin
        String expectedIdValue3 ="pid7_thumb";
        String actualIdValue3 =berlin3.getAttribute("id");

        if (expectedIdValue3.equals(actualIdValue3)){
            System.out.println("berlin id value testi PASSED");
        }else  {
            System.out.println("berlin id value testi FAILED");
        }
        Thread.sleep(3000);
        driver.close();
    }
}
