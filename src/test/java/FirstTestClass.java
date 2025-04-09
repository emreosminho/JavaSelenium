import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\chrome\\chromedriver.exe");

        WebDriver driver =  new ChromeDriver();

        driver.get("https://www.selenium.dev/downloads/");

        Thread.sleep(20000);
        driver.close();

    }
}
