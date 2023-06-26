package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassRoom1_DropdownElements {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/login"); //1. Launch URL "http://leaftaps.com/opentaps/control/login"
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); //DemoSalesManager/crmsfa / Enter UserName and Password Using Id Locator
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click(); //3. Click on Login Button using Class Locator
			
			driver.findElement(By.linkText("CRM/SFA")).click(); // 4.Click on CRM/SFA Link
			
			driver.findElement(By.linkText("Leads")).click(); //5. Click on Leads Button
			driver.findElement(By.linkText("Create Lead")).click(); //6. Click on create Lead Button

	
			WebElement op = driver.findElement(By.id("createLeadForm_industryEnumId"));;
			//Return type of FindElement is WebElement
			//Ctrl+2 > l
			Select option = new Select(op);
			option.selectByIndex(4);
					
			Thread.sleep(1000);
			
			WebElement op1 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			Select option1 = new Select(op1);
			option1.selectByValue("OWN_PROPRIETOR");
			
			WebElement op2 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select option2 = new Select(op2);
			option2.selectByVisibleText("Alabama");
			
			driver.close();
	}

}
