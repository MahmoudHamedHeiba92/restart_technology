package testcases;

import Base.DriverHandling;
import org.testng.annotations.Test;
import pages.registration;
import pages.signin;
import utility.utility;

import java.io.IOException;
public class RestartTaskSuite extends DriverHandling {


    @Test
    public void tc_restart_task_001() throws IOException {
        registration reg = new registration(driver);
        reg.ClickOnSigUpBtn();
        reg.ClickOnCreatNewAcc();
        reg.EnterFirstName(utility.fetchdataProperty("firstname"));
        reg.EnterLastName(utility.fetchdataProperty("lastname"));
        reg.EnterEmail(utility.fetchdataProperty("email"));
        reg.EnterPassWord(utility.fetchdataProperty("password"));
        reg.EnterConfirmPassword(utility.fetchdataProperty("password"));
        reg.ClickOnNextBtn();
        reg.VerifyMobileNumberFeild();
    }

    @Test
    public void tc_restart_task_002() throws IOException {
        signin sign = new signin(driver);
        sign.ClickonSigUpBtn();
        sign.EnterEmailAddress(utility.fetchdataProperty("signin_Email"));
        sign.ClickOnNextBtn2();
        sign.EnterPassword(utility.fetchdataProperty("password"));
        sign.ClickOnNextBtn3();
        sign.Verfiysignin();
    }
}
