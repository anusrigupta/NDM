import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Gestures extends Setup{

	public static void SwipeLeft() throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
//**************       Getting Device display screen resolution and applying swipe as per cordinates  ************************************
		
		Dimension size=driver.manage().window().getSize();
		int startx = (int)(size.width*11/12);
		int starty = (int)(size.height/2);
		int endx = (int)(size.width/12);
		int endy =(int)(size.height/2);
		
		

	//Waiting for 10 seconds	
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//Swipe function i.e  Press -> <MoveTo -> Release and perform action 	
		TouchAction touch = new AndroidTouchAction(driver);

		touch.press(PointOption.point(startx, starty)).moveTo(PointOption.point(endx, endy)).release().perform();
		
		
	}

}
