import java.net.MalformedURLException;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class Automation extends Setup {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		//Open NDM - DK app Hybrid
		Setup.Capabilities();
		
		
		//Swipe Thrice to get to Login page
			for(int i=0;i<3;i++)
			{
				Gestures.SwipeLeft();      
			}
		//Login and select user and its agreement
		LoginLogout.login();
		
		Thread.sleep(35000);
		
		Investments.SelectInvestmentMenu();
		
		
	}

}
