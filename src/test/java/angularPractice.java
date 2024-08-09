import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class angularPractice {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Janet");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("123456");
        driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();
        driver.findElement(By.id("exampleFormControlSelect1")).click();
        WebElement selectElement = driver.findElement(By.id("exampleFormControlSelect1"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Female");

        driver.findElement(By.cssSelector("input[id='inlineRadio1']")).click();
        driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("17/10/1998");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();




    }
}
