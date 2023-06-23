package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASSIGNMENT1_Create {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver ec = new ChromeDriver();
		ec.manage().window().maximize();
		ec.get("http://leaftaps.com/opentaps/control/login"); //1. Launch URL "http://leaftaps.com/opentaps/control/login"
		
		ec.findElement(By.id("username")).sendKeys("DemoSalesManager"); //DemoSalesManager/crmsfa / Enter UserName and Password Using Id Locator
		ec.findElement(By.id("password")).sendKeys("crmsfa");
		ec.findElement(By.className("decorativeSubmit")).click(); //3. Click on Login Button using Class Locator
		
		ec.findElement(By.linkText("CRM/SFA")).click(); // 4.Click on CRM/SFA Link
		
		ec.findElement(By.linkText("Leads")).click(); //5. Click on Leads Button
		ec.findElement(By.linkText("Create Lead")).click(); //6. Click on create Lead Button

//CREATE
		ec.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf"); //7. Enter CompanyName using id Locator
		ec.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhveya");  //8. Enter FirstName using id Locator		
		ec.findElement(By.id("createLeadForm_lastName")).sendKeys("R"); //9. Enter LastName using id Locator
		ec.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dhveya7@gmail.com");	//10. Enter your mail-id
		ec.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7402077831");   // 11.phone number
		Thread.sleep(1000);
		
		ec.findElement(By.name("submitButton")).click();  //12. Click on create Lead Button Using name Locator
		Thread.sleep(2000);
		
		ec.close();
		
}

}