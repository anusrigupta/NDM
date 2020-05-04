import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.KeyEvent;

public class LoginLogout extends Setup {

	public static void login() throws InterruptedException {

		
		driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();
		System.out.println("clicked Login");
		
		
		Thread.sleep(15000);
		driver.findElementByAndroidUIAutomator("text(\"Continue to Nordea Mobile\")").click();
		System.out.println("Continue to Nordea Mobile");
		
		
		Thread.sleep(5000);
		UseTestAuthen();
		
		
		driver.findElementById("dk.nordea.sme.alpha:id/developer_quicklogin").click();
		System.out.println("choosen user to login");

		Thread.sleep(3000);
		System.out.println("calling user");
		Users.User593439922();
		
		Thread.sleep(5000);
		
		driver.findElementByXPath("//android.widget.Button[@text='Skip']").click();
		
		System.out.println("skipped it");
		
		
		

	}
	
	public static void UseTestAuthen() {
		
		driver.findElementById("dk.nordea.sme.alpha:id/developer_menu").click();
		driver.findElementById("dk.nordea.sme.alpha:id/test_login").click();
		driver.navigate().back();
		
		
	}

}
