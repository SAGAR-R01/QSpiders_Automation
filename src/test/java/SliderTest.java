import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderTest {

    @Test(priority = 1)
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoapps.qspiders.com/ui/slider?sublist=0");
        driver.manage().window().maximize();
        WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));

        Actions act = new Actions(driver);
        Thread.sleep(3000);
        act.dragAndDropBy(slider,860,172).build().perform();

    }

    @Test(priority = 0)
    public void OpenBrowser(){

        ChromeDriver driver = new ChromeDriver();

    }
}
