package lesson_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // https://www.amazon.com.tr/ git
        driver.get("https://www.amazon.com.tr/");

        // Çerezleri kabul et
        driver.findElement(By.id(    "sp-cc-accept")).click();

        // Arama butonuna iphone 11 yaz ve arama  işlemini yap
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11");
        driver.findElement(By.id("nav-search-submit-button")).click();



    }
}
