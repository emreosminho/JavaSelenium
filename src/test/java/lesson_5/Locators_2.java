package lesson_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com.tr/");
        driver.findElement(By.id("sp-cc-accept")).click();
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();
        String sonucSayisi = driver.findElement(By.xpath("//div[@class=\"sg-col-inner\"]/h2/span")).getText();
        System.out.println(sonucSayisi);



    }
}
