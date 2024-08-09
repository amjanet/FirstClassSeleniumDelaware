import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class bank {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(option);
        driver.get("http://dbankdemo.com/bank/login");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".form-control")).sendKeys("janet");
        driver.findElement(By.cssSelector("#password")).sendKeys("123456");
//        driver.findElement(By.xpath("//button[@id='submit']")).click();
        driver.findElement(By.linkText(" Sign Up Here")).click();
    }
}
