package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ASSIGNMENT2_Update {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver ec14 = new ChromeDriver();
		//WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),DesiredCapabilities.firefox());
		ec14.manage().window().maximize();
		ec14.get("http://leaftaps.com/opentaps/control/main"); // Launch the browser
		
		ec14.findElement(By.id("username")).sendKeys("DemoSalesManager"); //DemoSalesManager/crmsfa / Enter UserName and Password Using Id Locator
		ec14.findElement(By.id("password")).sendKeys("crmsfa");
		ec14.findElement(By.className("decorativeSubmit")).click(); //3. Click on Login Button using Class Locator
		
		ec14.findElement(By.linkText("CRM/SFA")).click(); // 4.Click on CRM/SFA Link
		ec14.findElement(By.linkText("Leads")).click(); //5. Click on Leads Button
		
		ec14.findElement(By.linkText("Create Lead")).click(); //6. Click on create Lead Button
		ec14.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf"); 
		Thread.sleep(2000);//7. Enter CompanyName using id Locator
		ec14.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhveya");  //8. Enter FirstName using id Locator		
		ec14.findElement(By.id("createLeadForm_lastName")).sendKeys("R"); //9. Enter LastName using id Locator
		Thread.sleep(500);
		ec14.findElement(By.name("submitButton")).click();  //12. Click on create Lead Button Using name Locator
//UPDATE
		ec14.findElement(By.linkText("Edit")).click();
		//ec14.get("updateLeadForm?partyId=11304");
		//ec14.findElement(By.tagName("updateLeadForm?partyId=11304"))
		ec14.findElement(By.id("updateLeadForm_companyName")).sendKeys("EditedCompName");
		ec14.findElement(By.name("submitButton")).click();
		
		Thread.sleep(2000);
		ec14.close();		
		
	}

}
