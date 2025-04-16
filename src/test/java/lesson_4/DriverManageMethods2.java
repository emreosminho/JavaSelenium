package lesson_4;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManageMethods2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1.Youtube sayfasına gidelim
        driver.get("https://www.youtube.com/");
        // 2. sayfanın konumuu ve boyutlarını al
        System.out.println("Sayfanın konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutu: " + driver.manage().window().getSize());
        // 3. sayfanın istediğimiz konum ve boyuta gelmesi
        driver.manage().window().setPosition(new Point(0,0));
        driver.manage().window().setSize(new Dimension(600,600));
        // 4. sayfa istediğimiz konuma geldi mi test edelim
        int xKor = driver.manage().window().getPosition().getX();
        int yKor = driver.manage().window().getPosition().getY();
        int wight = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();
        if (xKor == 0 && yKor == 0){
            System.out.println("Sayfa doğru konumda bulunmaktadır...");
        } else {
            System.out.println("Konum yanlış kontrol ediniz.....");
        }

        if (wight == 600 && height == 600){
            System.out.println("Sayfa doğru boyutlardadır.");
        } else {
            System.out.println("Sayfa boyutu yanlıştır Tekrar kontrol ediniz....");
        }

        driver.wait(2000);
        driver.close();
    }
}
