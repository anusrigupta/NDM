
public class Investments extends Setup{

	public static void SelectInvestmentMenu() throws InterruptedException {
		
		//driver.findElementByXPath("//android.widget.Spinner[@text='Investments']").click();
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Investments Investments\")").click();
		
		
		
		Thread.sleep(3000);
		driver.findElementByXPath("//android.view.View[@text='Overview']").click();
		
		

	}

}
