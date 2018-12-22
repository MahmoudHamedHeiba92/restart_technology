package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utility.utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class registration {
    WebDriver driver;

    public registration(WebDriver driver) {
        this.driver=driver;

    }

    public void ClickOnSigUpBtn() throws IOException {
        driver.findElement(By.xpath(utility.fetchlocatorProperty("SignUp_btn_xpath"))).click();
    }

    public void ClickOnCreatNewAcc() throws IOException {
        driver.findElement(By.xpath(utility.fetchlocatorProperty("CreatNewAcc_btn_xpath"))).click();
    }

    public void EnterFirstName(String firstname) throws IOException {
        driver.findElement(By.xpath(utility.fetchlocatorProperty("FirstName_xpath"))).sendKeys(firstname);
    }

    public void EnterLastName(String lastname) throws IOException {
        driver.findElement(By.xpath(utility.fetchlocatorProperty("LastName_xpath"))).sendKeys(lastname);
    }

    public void EnterEmail(String email) throws IOException {
        driver.findElement(By.xpath(utility.fetchlocatorProperty("Email_xpath"))).sendKeys(email);
    }

    public void EnterPassWord(String password) throws IOException {
        driver.findElement(By.xpath(utility.fetchlocatorProperty("PassWord_xpath"))).sendKeys(password);

    }

    public void EnterConfirmPassword(String password) throws IOException {
        driver.findElement(By.xpath(utility.fetchlocatorProperty("confirm_PassWord_xpath"))).sendKeys(password);

    }

    public void ClickOnNextBtn() throws IOException {
        driver.findElement(By.xpath(utility.fetchlocatorProperty("Next_btn_xpath"))).click();
    }

    public void VerifyMobileNumberFeild () throws IOException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement mobile = driver.findElement(By.xpath(utility.fetchlocatorProperty("mobile_feild_xpath")));
        Assert.assertTrue(mobile.isDisplayed());
    }


}
