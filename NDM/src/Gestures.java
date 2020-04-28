import java.io.Console;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Gestures extends Setup{

	public static void SwipeLeft() throws MalformedURLException, InterruptedException {
		
		//AndroidDriver<AndroidElement> driver = Capabilities();
		
//**************       Getting Device display screen resolution and applying swipe as per coordinates  ************************************
		//if(Setup.driver == null)
		//System.out.println("driver id null");
		Dimension size = Setup.driver.manage().window().getSize();
		int startx = (int)(size.width*11/12);
		int starty = (int)(size.height/2);
		int endx = (int)(size.width/12);
		int endy =(int)(size.height/2);
		
		Thread.sleep(1000);
		
	//Swipe function i.e  Press -> <MoveTo -> Release and perform action 	
		TouchAction touch = new AndroidTouchAction(Setup.driver);

		touch.press(PointOption.point(startx, starty)).moveTo(PointOption.point(endx, endy)).release().perform();
		
		
	}

}
