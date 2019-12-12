package SpicejetWebAutomation.SpicejetAutomation;

import org.testng.annotations.Test;

public class TestRun {

	@Test
	public void home() {
		HomePage home =new HomePage();
		home.openBrowser();
		home.openUrl("https://www.spicejet.com/");
		
		home.hotelBook();
		home.waitFor(5);
		//home.login();
		//home.takeMeToSignup();
		home.waitFor(10);
		//home.closeBrowser();
	}
	
	
	
	
}
