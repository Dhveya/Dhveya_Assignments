package week2_day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ASSIGNMENT1_ADV_XPATH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		//http://leaftaps.com/opentaps/control/main
		// 1	Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/login");
		// 2 Enter the username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); 
		// 3	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//4 . Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		// 5	Click crm/sfa link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click(); 
		
		
	/*	
		* 
		* 2	
		
		* 4	
		* 
		* 6	Click Leads link
		* 7	Click Find leads
		* 8	Enter first name
		* 9	Click Find leads button
		* 10 Click on first resulting lead
		* 11 Verify title of the page
		* 12 Click Edit
		* 13 Change the company name
		* 14 Click Update
		* 15 Confirm the changed name appears
		* 16 Close the browser (Do not log out)
		*/
	}

}
