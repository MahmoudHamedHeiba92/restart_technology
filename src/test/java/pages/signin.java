package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utility.utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class signin {
    WebDriver driver;
    public signin (WebDriver driver) {
        this.driver=driver;

    }
    public void ClickonSigUpBtn() throws IOException {
        driver.findElement(By.xpath(utility.fetchlocatorProperty("SignUp_btn_xpath"))).click();
    }

    public void EnterEmailAddress(String Email) throws IOException {
        driver.findElement(By.xpath(utility.fetchlocatorProperty("Email_address_xpath"))).sendKeys(Email);
    }

    public void ClickOnNextBtn2() throws IOException {
        driver.findElement(By.xpath(utility.fetchlocatorProperty("Next2_btn_xpath"))).click();
    }

    public void EnterPassword(String password) throws IOException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(utility.fetchlocatorProperty("password_xpath"))).sendKeys(password);
    }

    public void ClickOnNextBtn3() throws IOException {
        driver.findElement(By.xpath(utility.fetchlocatorProperty("Next3_btn_xpath"))).click();
    }

    public void Verfiysignin() throws IOException{
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement account = driver.findElement(By.xpath(utility.fetchlocatorProperty("Account_xpath")));
        Assert.assertTrue(account.isDisplayed());
    }

}
