import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demoBlaze {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://www.demoblaze.com/index.html");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[onclick=\"byCat('notebook')\"]")).click();
    }
}
