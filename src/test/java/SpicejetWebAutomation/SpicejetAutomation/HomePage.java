package SpicejetWebAutomation.SpicejetAutomation;

public class HomePage extends MasterPage {


	public void takeMeToSignup() {
		String loginSignup ="//*[@id='ctl00_HyperLinkLogin']";
		String specialClubMember ="//*[text()='SpiceClub Members']";
		String signUp ="//a[text()='Sign up']";

		mouseOver(loginSignup);
		mouseOver(specialClubMember);
		clickOnElement(signUp);
	}

	public void login() {
		String loginSignup ="//*[@id='ctl00_HyperLinkLogin']";
		String specialClubMember ="//*[text()='SpiceClub Members']";
		String memberLogin ="Member Login";

		mouseOver(loginSignup);
		mouseOver(specialClubMember);
		clickOnElement(memberLogin);
	}

	public void hotelBook() {
		String hotel ="//*[@class='myspice_trip']";
		String destinationCity ="ctl00_mainContent_txtOriginStation1_MST";
		String adult ="//*[@id='ddl_Adult_MST']";
		String child ="//*[@id='ddl_Child_MST']";
		String infant ="//*[@id='ddl_Infant_MST' ]";

		clickOnElement(hotel);
		waitFor(5);
		typeOnElement(destinationCity,  "jamaica");
		clickOnElement("//*[@id='ctl00_mainContent_txt_Fromdate_MST']");

		waitFor(1);
		dropDown(adult, "4");
		dropDown(child, "2");
		dropDown(infant, "2");

	}

	






}
