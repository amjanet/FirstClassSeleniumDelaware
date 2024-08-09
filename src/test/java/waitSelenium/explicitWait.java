package waitSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class explicitWait {
    public static void main(String[] args) {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(option);
        driver.get("https://demoqa.com/dynamic-properties");

        //permite dar tiempo en cada elemento, es mejor q el impliciwait porque especifica cuanto tiempo darle por elemento, de igual manera, tiene q esperar dicho tiempo para recien buscar el elemento
        WebDriverWait myWaitVar1 = new WebDriverWait(driver, Duration.ofSeconds(6));
        myWaitVar1.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));

        WebDriverWait myWaitVar2 = new WebDriverWait(driver, Duration.ofSeconds(2));
        myWaitVar2.until(ExpectedConditions.visibilityOfElementLocated(By.id("enableAfter")));

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
