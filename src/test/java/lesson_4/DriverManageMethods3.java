package lesson_4;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManageMethods3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1.Amazon sayfasına gidelim
        driver.get("https://www.amazon.com/");

    }
}
