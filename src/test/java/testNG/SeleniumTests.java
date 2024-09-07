package testNG;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumTests {
    //comment

    @Test
    public void test01(){
        WebDriver driver = BrowserUtils.getDriver();
//        driver.navigate().to("https://www.facebook.com/");
//       WebElement email = driver.findElement(By.id("email"));
//        WebElement email2 = driver.findElement(By.cssSelector("#email"));

//        driver.close();
    }


    @Test
    public void test02(){
        WebDriver driver = BrowserUtils.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("http://57.151.123.81:3000/#/");
        WebElement dismissPopup = driver.findElement(By.cssSelector("#mat-dialog-0 > app-welcome-banner > div > div:nth-child(3) > button.mat-focus-indicator.close-dialog.mat-raised-button.mat-button-base.mat-primary.ng-star-inserted"));
        dismissPopup.click();

        WebElement accountButton = driver.findElement(By.id("navbarAccount"));
        accountButton.click();



    //  WebElement loginText = driver.findElement(By.cssSelector("body > app-root > div > mat-sidenav-container > mat-sidenav-content > app-login > div > mat-card > h1"));

    //  WebElement loginButton = driver.findElement(By.id("navbarLoginButton"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#navbarLoginButton")));
        loginButton.click();

        WebElement loginText = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > app-root > div > mat-sidenav-container > mat-sidenav-content > app-login > div > mat-card > h1")));
        Assert.assertEquals(loginText.getText(), "Login", "The site is not on the Login page");

        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("password"));

        email.clear();
        email.sendKeys("bzt@bzt.com");
        password.clear();
        password.sendKeys("abbbbd3");

        driver.close();

    }
}
