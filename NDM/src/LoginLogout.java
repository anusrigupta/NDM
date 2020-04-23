import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class LoginLogout extends Setup {

	public static void login() {

		
		driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
	
		System.out.println("clicked Login");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Continue to Nordea Mobile\")").click();
		//driver.findElementByXPath("//android.widget.Button[@text='Continue to Nordea Mobile']").click();
		
		System.out.println("Continue to Nordea Mobile");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElementById("dk.nordea.sme.alpha:id/developer_quicklogin").click();
		
		System.out.println("choose user to login");

		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Users.User593439922();
		
		
		
	

		
		
	}

}
