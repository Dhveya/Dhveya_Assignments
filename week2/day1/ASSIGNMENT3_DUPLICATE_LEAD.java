package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASSIGNMENT3_DUPLICATE_LEAD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); 
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click(); // 3. Click on Login Button using Class Locator
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click(); //  4. Click on CRM/SFA Link
		driver.findElement(By.linkText("Leads")).click();  // 5. Click on Leads Button
		driver.findElement(By.linkText("Create Lead")).click(); //6. Click on Create Lead 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CompNam"); //  7. Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FNam"); //8. Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LNam"); //9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("FNamLoc"); //10. Enter FirstName(Local) Field Using id Locator
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("TESTING"); //11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Happy Testing!"); // 12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mailtest@gmail.com"); //  13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.name("submitButton")).click(); //  14. Click on Create Button
        
		
		String Title1 = driver.getTitle(); // 15. Get the Title of Resulting Page using driver.getTitle()
		System.out.println("Title of the current page :"+ Title1);
        driver.findElement(By.linkText("Duplicate Lead")).click(); //16. Click on Duplicate button
        driver.findElement(By.id("createLeadForm_companyName")).clear(); //17. Clear the CompanyName Field using .clear() And Enter new CompanyName
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NewCompNam"); //18.Clear the FirstName Field using .clear() And Enter new FirstName
        driver.findElement(By.name("submitButton")).click(); //19.Click on Create Lead Button         
        String Title = driver.getTitle();
        System.out.println("Title of Current Page 2nd Time : " + Title); //20. Get the Title of Resulting Page using driver.getTitle()
        
        driver.close();

	}

}
