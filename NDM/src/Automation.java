import java.net.MalformedURLException;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class Automation extends Setup {

	public static void main(String[] args) throws MalformedURLException {
	
		//Open NDM - DK app Hybrid
		
		Setup.Capabilities();
		
		
		//Swipe Thrice to get to Login page
		for(int i=0;i<3;i++)
		{
		Gestures.SwipeLeft();      
		}
		
		
	System.out.println("swipe left worked ");
	

	
	LoginLogout.login();
		
	}

}
