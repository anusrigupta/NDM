import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidElement;

public class Users extends Setup{

	public static void User593439922() throws InterruptedException {
	
		
		driver.findElementById("android:id/text1").click();
		System.out.println("selected the user");
		
		Thread.sleep(15000);
		driver.findElementByXPath("//android.widget.Button[@text='Select agreement']").click();
		Thread.sleep(5000);
		
		
	}

}
