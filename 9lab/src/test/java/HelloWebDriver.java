import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HelloWebDriver {
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.edge.driver", "D:\\browserDrivers\\edgedriver_win64\\msedgedriver.exe");
    	
        WebDriver driver = new EdgeDriver();
        driver.get("https://pastebin.com");
        WebElement CodeInput = driver.findElement(By.id("postform-text"));
        CodeInput.sendKeys("Hello from WebDriver");
        driver.findElement(By.id("select2-postform-expiration-container")).click();
        driver.findElement(By.xpath("//li[text()='10 Minutes']")).click();
        WebElement NameInput = driver.findElement(By.id("postform-name"));
        NameInput.sendKeys("helloweb");
        driver.findElement(By.xpath("//button[@class='btn -big']")).click();
        Thread.sleep(2000);
      //  driver.quit();
    }
}
