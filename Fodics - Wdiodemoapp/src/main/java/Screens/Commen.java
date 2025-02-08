package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import Base.Base;
import Utilities.Data;

public class Commen extends Base{

    Data data = new Data();


    public String OKButton = "//android.widget.Button[@text = 'OK']";
    public String SuccessMessage = "//android.widget.TextView[@text = 'You successfully signed up!' or @text = 'You are logged in!' or @text='This button is active']";


    public void Swipe() throws InterruptedException {  // Method to perform a swipe action on the mobile app

        Actions action = new Actions(driver);  // Create an instance of Actions to perform complex user interactions
        // Click and hold on the element representing the carousel
        action.clickAndHold(driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Carousel\"]"))); 
    
        // Move to the first card element in the carousel and release the hold
        action.moveToElement(driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"card\"])[1]"))).release();
        
        // Build and perform the action sequence
        action.build().perform();
    }
    
}
