package waitSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class implicitWait {
    public static void main(String[] args) {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://demoqa.com/dynamic-properties");

        //por cada elemento tiene q esperar si o si 6 segundos sin importar q el elemento cargue antes, esto es un problema porq este tiempo es general para todos los elementos, osea afecta a toda la clase
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        WebElement boton = driver.findElement(By.id("visibleAfter"));
        if (boton.isDisplayed()){
            System.out.println("clic boton");
        }else {
            System.out.println("no click");
        }
        driver.findElement(By.id("enableAfter")).click();
        driver.findElement(By.id("colorChange")).click();

    }
}
