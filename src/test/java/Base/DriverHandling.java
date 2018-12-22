package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import utility.utility;

import java.io.IOException;

public class DriverHandling {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeMethod
    public void setup () throws IOException, InterruptedException {

        // Declaring webdriver file location
        System.setProperty("webdriver.chrome.driver","src/test/java/driver/chromedriver.exe");

        //Create a Chrome driver. All test and page classes use this driver.
        driver = new ChromeDriver();

        //Create a wait. All test and page classes use this wait.
        wait = new WebDriverWait(driver,15);

        //Maximize Window
        driver.manage().window().maximize();

        //Open the URL
        driver.get(utility.fetchdataProperty("applicationUrl").toString());

    }

    @AfterMethod
    public void teardown () {
        driver.quit();
    }

}
