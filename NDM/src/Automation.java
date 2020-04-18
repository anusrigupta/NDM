import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Automation extends Setup {

	public static void main(String[] args) throws MalformedURLException {
	
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		Gestures.SwipeLeft();      
		
	System.out.println("swipe left worked");
		
	//Swipe 3 times	
		
		
		
		
	}

}
