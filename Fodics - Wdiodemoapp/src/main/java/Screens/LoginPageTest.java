package Screens;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import Base.Base;
import Utilities.Data;

public class LoginPageTest extends Base {

    Data data = new Data();
    Commen Commen = new Commen();

    private String LoginPageTap = "//android.view.View[@content-desc='Login']";
    private String SignUpTap = "//android.view.ViewGroup[@content-desc='button-sign-up-container']";
    private String EmailInput = "//android.widget.EditText[@content-desc='input-email']";
    private String PassowrdInput = "//android.widget.EditText[@content-desc='input-password']" ;
    private String CPasswordInput = "//android.widget.EditText[@content-desc='input-repeat-password']";
    private String ConfirmSignUpButton = "//android.view.ViewGroup[@content-desc='button-SIGN UP']";
    private String LoginTap ="//android.view.ViewGroup[@content-desc='button-login-container']";
    private String ConfirmLoginButton = "//android.view.ViewGroup[@content-desc='button-LOGIN']";

    public void NavigateLoginPage() {
        // Set an implicit wait of 30 seconds for locating elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Click on the element to navigate to the Login page using its XPath
        driver.findElement(By.xpath(LoginPageTap)).click();
    }
    
    public void SelectSignUp() {
        // Set an implicit wait of 30 seconds for locating elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Click on the element to select the Sign Up option using its XPath
        driver.findElement(By.xpath(SignUpTap)).click();
    }
    
    public void FillSignUpFields() throws IOException {
        // Set an implicit wait of 30 seconds for locating elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Locate the email input field and enter the email value from the data source
        driver.findElement(By.xpath(EmailInput)).sendKeys(data.Get_Cell_Value(1, 1).toString());
    
        // Set an implicit wait of 30 seconds before the next action
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Locate the password input field and enter the password value from the data source
        driver.findElement(By.xpath(PassowrdInput)).sendKeys(data.Get_Cell_Value(1, 2).toString());
    
        // Set an implicit wait of 30 seconds before the next action
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Locate the confirm password input field and enter the same password value
        driver.findElement(By.xpath(CPasswordInput)).sendKeys(data.Get_Cell_Value(1, 2).toString());
    }
    
    public void VerifySignUp() {
        // Set an implicit wait of 30 seconds for locating elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Click on the confirm sign-up button to submit the sign-up form
        driver.findElement(By.xpath(ConfirmSignUpButton)).click();
    
        // Assert that the success message is displayed after the sign-up process
        assert driver.findElement(By.xpath(Commen.SuccessMessage)).isDisplayed();
    
        // Set an implicit wait of 30 seconds before clicking the OK button
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Click the OK button to acknowledge the success message
        driver.findElement(By.xpath(Commen.OKButton)).click();
    }
    
    public void NavigateLoginTap() {
        // Set an implicit wait of 30 seconds for locating elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Click on the element to navigate to the Login option using its XPath
        driver.findElement(By.xpath(LoginTap)).click();
    }
    
    public void FillLoginFields() throws IOException {
        // Set an implicit wait of 30 seconds for locating elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Locate the email input field and enter the email value from the data source
        driver.findElement(By.xpath(EmailInput)).sendKeys(data.Get_Cell_Value(1, 1).toString());
    
        // Set an implicit wait of 30 seconds before the next action
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Locate the password input field and enter the password value from the data source
        driver.findElement(By.xpath(PassowrdInput)).sendKeys(data.Get_Cell_Value(1, 2).toString());
    }
    
    public void VerifyLogin() {
        // Set an implicit wait of 30 seconds for locating elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Click on the confirm login button to submit the login form
        driver.findElement(By.xpath(ConfirmLoginButton)).click();
    
        // Assert that the success message is displayed after the login process
        assert driver.findElement(By.xpath(Commen.SuccessMessage)).isDisplayed();
    
        // Set an implicit wait of 30 seconds before clicking the OK button
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Click the OK button to acknowledge the success message
        driver.findElement(By.xpath(Commen.OKButton)).click();
    }
    
}
