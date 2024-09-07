import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {
    //comment

    @Test
    public void test01(){
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("https://www.facebook.com/");
//       WebElement email = driver.findElement(By.id("email"));
//        WebElement email2 = driver.findElement(By.cssSelector("#email"));

//        driver.close();
    }


    @Test
    public void test02(){
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://57.151.123.81:3000/#/");

        driver.close();

    }
}
