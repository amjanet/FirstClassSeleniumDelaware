package waitSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class fluenceWait {
    public static void main(String[] args) {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://demoqa.com/dynamic-properties");

        //permite buscar el elemento en cierto tiempo, y si no lo encuentra intentará buscar dicho elemento hasta el limite de tiempo q le pongas
        Wait<WebDriver> myWait = new FluentWait<myWait>(driver)
                .withTimeout(Duration.ofSeconds(8)) // esperará en este lapso de 8 segundos para encontrar el elemento
                .pollingEvery(Duration.ofSeconds(2)) // intentara encontrar el elementos 2 veces, osea hara dos reintentos
                .ignoring(NoSuchElementException.class);

        WebElement elementoWait = myWait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.id("visibleAfter")); //voy a intentar localizar este elementos durante 8 segundos, y voy a reintentarlo 2 veces
            }
        });


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
