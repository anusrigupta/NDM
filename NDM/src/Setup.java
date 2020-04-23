import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Setup {

	static AndroidDriver<AndroidElement> driver;
	
	
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException  {
	

		DesiredCapabilities Cap = new DesiredCapabilities();
		Cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		Cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S9");
		Cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		Cap.setCapability(MobileCapabilityType.UDID, "2132b3bcf10c7ece");
		Cap.setCapability("appPackage", "dk.nordea.sme.alpha");
		Cap.setCapability("appActivity", "com.nordea.mobilebank.start.SplashscreenActivity");
		Cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		
		URL url = new URL ("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<AndroidElement>(url, Cap);
	
		System.out.println("page loaded sucessfully");
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return driver;
				
		
	}

}
