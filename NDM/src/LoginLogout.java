import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;

public class LoginLogout extends Setup {

	public static void login() {
		// TODO Auto-generated method stub

//This is not working yet
		
		
		MobileElement clickLogin = (MobileElement) (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(By.linkText("Log in")));
		
		clickLogin.click(); 
		System.out.println("clicked Login");

		
		
	}

}
