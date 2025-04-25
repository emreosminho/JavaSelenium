package Lesson_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com.tr/");
        driver.findElement(By.id("sp-cc-accept")).click();
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone 11");
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        WebElement berlinPhoto = driver.findElement(By.id(""));
        WebElement bostonPhoto = driver.findElement(By.id(""));
        WebElement istanbulPhoto = driver.findElement(By.id(""));

        WebElement ankaraPhoto = driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(bostonPhoto));
        WebElement trabzonPhoto = driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(berlinPhoto));
    }
}
