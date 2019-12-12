package SpicejetWebAutomation.SpicejetAutomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class MasterPage {
	static WebDriver driver= null;
	static Actions actions;
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arif\\eclipse project\\SpicejetAutomation\\Browser\\chromedriver.exe");
		driver= new ChromeDriver();
	}

	public void openUrl(String url) {
		driver.get(url);	
	}

	public void browserHandeler() {
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();		
	}

	public void waitFor(long waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);	
	}

	public void clickOnElement(String locators) {

		try {
			driver.findElement(By.id(locators)).click();
		} catch (Exception e) {
			try {
				driver.findElement(By.xpath(locators)).click();
			} catch (Exception e1) {
				try {
					driver.findElement(By.name(locators)).click();
				} catch (Exception e2) {
					try { driver.findElement(By.cssSelector(locators)).click();

					} catch (Exception e3) {
						driver.findElement(By.linkText(locators)).click();
					}  

				}}}}

	public void typeOnElement(String locators, String value) {

		try {
			driver.findElement(By.id(locators)).sendKeys(value);
		} catch (Exception e) {
			try {
				driver.findElement(By.xpath(locators)).sendKeys(value);
			} catch (Exception e1) {
				try {
					driver.findElement(By.name(locators)).sendKeys(value);
				} catch (Exception e2) {
					driver.findElement(By.cssSelector(locators)).sendKeys(value);
				}}}}

	
	
	public void mouseOver(String locators) {
		actions	= new Actions(driver);
		try {
			actions.moveToElement(driver.findElement(By.xpath(locators))).build().perform();
		} catch (Exception e) {
			try {
				actions.moveToElement(driver.findElement(By.id(locators))).build().perform();
			} catch (Exception e2) {
				try {
					actions.moveToElement(driver.findElement(By.name(locators))).build().perform();
				} catch (Exception e3) {
					actions.moveToElement(driver.findElement(By.cssSelector(locators))).build().perform();
				}}}}	

	public void closeBrowser() {
		driver.close();

	}

	public void switchWindow(String locators) {
		driver.switchTo().window(locators);

		//window(driver.findElement(By.xpath(locators)))
	}

	public void dropDown(String locators, String value) {
		try {
			Select select = new Select(driver.findElement(By.xpath(locators)));
			select.selectByVisibleText(value);	
		} catch (Exception e) {
			try {
				Select select = new Select(driver.findElement(By.id(locators)));
				select.selectByVisibleText(value);
			} catch (Exception e2) {
				try {
					Select select =new Select(driver.findElement(By.className(locators)));
					select.selectByVisibleText(value);
				} catch (Exception e3) {
					Select select = new Select(driver.findElement(By.cssSelector(locators)));
					select.selectByVisibleText(value);
					}}}}


	
	
	
	
}




















