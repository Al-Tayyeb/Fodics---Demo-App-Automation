package Base;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	protected FileInputStream InputStream ;
	public static AndroidDriver driver ;
	protected DesiredCapabilities caps ;
	protected static WebDriverWait wait;
	protected Properties Prop ;
	protected File PropFile ;
	protected File App ;
	int c = 0 ;
	public int c2 = 1 ; 
	
	// TO SEND THE REQUIRED CAPABILITY TO THE SERVER THEN START THE APPLICATION
	@BeforeClass 
	@Parameters ({"deviceName" , "platformName" , "platformVersion"})
	public void BeforeClass	(
			@Optional("AhmedM") String deviceName , 
			@Optional("Android") String platformName , 
			@Optional("13") String platformVersion  ) throws IOException, InterruptedException, URISyntaxException {

		PropFile = new File("src/main/resources/Config/Config.properties");

		System.out.println("App is starting...");

		wait = new WebDriverWait(driver, Duration.ofSeconds(60)); 
		InputStream = new FileInputStream(PropFile);
		Prop = new Properties();
		Prop.load(InputStream);
	    caps = new DesiredCapabilities();
	    
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, Prop.getProperty("APP_PACKAGE"));
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, Prop.getProperty("APP_ACTIVITY"));
		caps.setCapability("noSign", true);
		caps.setCapability("noReset", true);
		caps.setCapability("systemPort", 8200);
		caps.setCapability("autoGrantPermissions", true);
		caps.setCapability("skipUnlock", true);
		caps.setCapability("clearDeviceLogsOnStart", true);
		caps.setCapability("skipServerInstallation", false);
		caps.setCapability("clearSystemFiles", false);
		caps.setCapability("ignoreHiddenApiPolicyError", true);
		caps.setCapability("newCommandTimeout", 120000);
		caps.setCapability("automationName", "UiAutomator2");
		
		try {

			driver = new AndroidDriver(new URI(Prop.getProperty("AppiumServer")).toURL(), caps);
			System.out.println("App started successfully ...");

			Thread.sleep(10000);

		} catch (Exception e) {

			System.out.println("App did not start !!!");

		}

	}
	
}
