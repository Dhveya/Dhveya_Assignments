package week2.day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ASSIGNMENT2_CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.get("http://leaftaps.com/opentaps/control/login");// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); // 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();//3. Click on Login Button using Class Locator
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click(); //4. Click on CRM/SFA Link
		
		driver.findElement(By.linkText("Accounts")).click();//5. Click on Accounts Button
		//driver.findElement(By.className("ext-gecko")).click();  
		
		driver.findElement(By.linkText("Create Account")).click(); //6. Click on Create Account
		    
		//7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		//driver.findElement(By.xpath("//input[@class='x-form-text x-form-field'])[1]")).sendKeys("Debit Limited Account");// just tried with left sided Create Account and found duplicates & thereby used Index Xpath
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester"); //8. Enter DEscriptiion as "Selenium Automation Tester"
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("LocNam"); //9. Enter LocalName Field Using Xpath Locator
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("SiteNam"); //10. Enter SiteName Field Using Xpath Locator
		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("1245879"); //11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		   
		// 12. Select Industry as ComputerSoftware
		WebElement option = driver.findElement(By.name("industryEnumId"));
		Select op1 = new Select(option);
		op1.selectByValue("IND_SOFTWARE");		
		   
		// 13. Select OwnerShip as S-Corporation using SelectByVisibletext
		WebElement option2 = driver.findElement(By.name("ownershipEnumId"));
		Select op2 = new Select(option2);
		op2.selectByVisibleText("S-Corporation");
		
		// 14. Select Source as Employee using SelectByValue
		WebElement option3 = driver.findElement(By.id("dataSourceId"));
		Select op3 = new Select(option3);
		op3.selectByValue("LEAD_EMPLOYEE");		
		   
		   
		// 15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
		WebElement option4 = driver.findElement(By.id("marketingCampaignId"));
		Select op4 = new Select(option4);
		op4.selectByIndex(5);
		
		// 16. Select State/Province as Texas using SelectByValue 
		WebElement option5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select op5 = new Select(option5);
		op5.selectByValue("TX");  
		
		// 17. Click on Create Account using Xpath Locator
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		Thread.sleep(1000);
		driver.close();
		
	}

}
