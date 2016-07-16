package ddt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenFrameworks {
	WebDriver driver;
	
	@Test(dataProvider="WordpressData")
	public void seliniumScript(String userName, String passCode) throws InterruptedException {
driver = new FirefoxDriver();
driver.get("http://demosite.center/wordpress/wp-login.php");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.id("user_login")).sendKeys(userName);
driver.findElement(By.id("user_pass")).sendKeys(passCode);
driver.findElement(By.id("wp-submit")).click();


Thread.sleep(5000);
//to print test-case result add assertion
Assert.assertTrue(driver.getTitle().contains("Dashboard"), "User unable to login, Please enter valid credentials");
//System.out.println(driver.getTitle());
System.out.println("Page is logging in, Good user credentials");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	
	// creating a method named fillCredentials, whose return type is an array of type object
	@DataProvider(name="WordpressData")
public Object[][] fillCredentials() {
// create an array named arrayData of type Object and size of 3 rows and 2 columns
	
	Object[][] arrayData = new Object[3][2];
	
	//wrong credentials
	arrayData[0][0] = "userName1";
	arrayData[0][1] = "passCode1";
	
	//correct credentials
	arrayData[1][0] = "admin";
	arrayData[1][1] = "demo123";
	
	//wrong credentials
	arrayData[2][0] = "userName3";
	arrayData[2][1] = "passCode3";
	
	
	return arrayData;
	
	
}
	
}
