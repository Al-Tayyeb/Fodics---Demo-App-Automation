package Screens;

import java.time.Duration;
import org.openqa.selenium.By;
import Base.Base;
import Utilities.Data;

public class SwiprPageTest extends Base {

    Data data = new Data();
    Commen Commen = new Commen();
    
    private String SwipePageTap = "//android.view.View[@content-desc='Swipe']";
    private String VideosCerd = "//android.widget.TextView[@text='EXTENDABLE']";

    
    public void NavigateSwipePage() throws InterruptedException {
        // Set an implicit wait of 30 seconds for locating elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Click on the element to navigate to the Swipe page using its XPath
        driver.findElement(By.xpath(SwipePageTap)).click();
    
        boolean IsVideosCerdDisplayed = false;  // Initialize a boolean to track the visibility of the video card
    
        // Loop until the video card is displayed
        while (!IsVideosCerdDisplayed) {
            try {
                // Set a shorter implicit wait of 1 second for locating the video card
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
                // Check if the video card element is displayed
                IsVideosCerdDisplayed = driver.findElement(By.xpath(VideosCerd)).isDisplayed();
    
                // If the video card is displayed, exit the loop
                if (IsVideosCerdDisplayed) {
                    break;
                }
            } catch (Exception e) {
                // If an exception occurs (e.g., element not found), perform a swipe action
                Commen.Swipe();
            }
        }
    }
    
}
