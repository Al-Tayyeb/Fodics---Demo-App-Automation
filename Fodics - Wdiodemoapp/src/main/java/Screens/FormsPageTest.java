package Screens;

import java.time.Duration;
import org.openqa.selenium.By;
import Base.Base;
import Utilities.Data;

public class FormsPageTest extends Base {

    Data data = new Data();
    Commen Commen = new Commen();

    private String FormsPageTap = "//android.view.View[@content-desc='Forms']";
    private String FormInput = "//android.widget.EditText[@content-desc='text-input']";
    private String Input = "Exmaple" ;
    private String FormTypedInput = "//android.widget.TextView[@content-desc='input-text-result']";
    private String FormSwitch = "//android.widget.Switch[@content-desc='switch']";
    private Boolean FormDefualtSwitchValue = false ; 
    private String FormSwitchText = "//android.widget.TextView[@content-desc='switch-text']";
    private String FormDropDown = "//android.view.ViewGroup[@content-desc='Dropdown']";
    private String FormDropDownText = "//android.view.ViewGroup[@content-desc=\"Dropdown\"]/android.view.ViewGroup/android.widget.EditText";
    private String FormDropDownValues = "Appium is awesome";
    private String FormDropDownOptions = "//android.widget.CheckedTextView[@text=\'"+FormDropDownValues+"\']";
    private String FormActiveButton = "//android.view.ViewGroup[@content-desc='button-Active']";

    public void NavigateFormsPage() {
        // Set an implicit wait of 30 seconds for locating elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Click on the element to navigate to the Forms page using its XPath
        driver.findElement(By.xpath(FormsPageTap)).click();
    }
    
    public void FillFormFields() {
        // Set an implicit wait of 30 seconds for locating elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Locate the input field and enter the specified input
        driver.findElement(By.xpath(FormInput)).sendKeys(Input);
    
        // Assert that the text in the input field matches the expected input
        assert driver.findElement(By.xpath(FormTypedInput)).getText().toString().equals(Input);
    
        // Set an implicit wait of 30 seconds before the next action
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        // Click on the switch element to toggle its state
        driver.findElement(By.xpath(FormSwitch)).click();
    
        // Set the default value of the switch to true
        FormDefualtSwitchValue = true;
    
        // Check the state of the switch and assert its text
        if (FormDefualtSwitchValue) {
            // Assert that the switch text contains "OFF"
            assert driver.findElement(By.xpath(FormSwitchText)).getText().toString().contains("OFF");
        } else {
            // Assert that the switch text contains "ON"
            assert driver.findElement(By.xpath(FormSwitchText)).getText().toString().contains("ON");
        }
    
        // Set an implicit wait of 30 seconds before interacting with the dropdown
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Click on the dropdown element to open it
        driver.findElement(By.xpath(FormDropDown)).click();
    
        // Set an implicit wait of 30 seconds before selecting an option
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Click on the dropdown option to select it
        driver.findElement(By.xpath(FormDropDownOptions)).click();
    
        // Print the text of the currently selected dropdown value to the console
        System.out.println(driver.findElement(By.xpath(FormDropDownText)).getText());
        System.out.println(FormDropDownValues);
        
        // Assert that the selected dropdown text contains the expected value
        assert driver.findElement(By.xpath(FormDropDownText)).getText().toString().contains(FormDropDownValues);
    
        // Set an implicit wait of 30 seconds before clicking the active button
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Click on the active button to submit the form or perform an action
        driver.findElement(By.xpath(FormActiveButton)).click();
    
        // Assert that the success message is displayed after form submission
        assert driver.findElement(By.xpath(Commen.SuccessMessage)).isDisplayed();
    
        // Set an implicit wait of 30 seconds before clicking the OK button
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Click the OK button to acknowledge the success message
        driver.findElement(By.xpath(Commen.OKButton)).click();
    }

}
