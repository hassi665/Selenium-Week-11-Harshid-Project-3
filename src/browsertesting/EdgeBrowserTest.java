package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {
    public static void main(String[] args) {

        String baseURL = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.msedge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        //launch the URL in EdgeBrowser
        driver.get(baseURL);
        //maximize the browser's window
        driver.manage().window().maximize();
        //give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Print the title of the page
        System.out.println("Page title is : " + driver.getTitle());

        //Print the current URL
        System.out.println("Current URL of page is : " + driver.getCurrentUrl());

        //Print the Page Source
        System.out.println("Page Source : " + driver.getPageSource());

        //Enter the Username to Username field
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("tomsmith");


        //Enter the Password to Password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        //Close the browser
        driver.close();

    }
}
