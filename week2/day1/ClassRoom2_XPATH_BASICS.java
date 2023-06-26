package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoom2_XPATH_BASICS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		//1.Attribute based xpaths
		//tagname[@attributename='attributeValue']
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
		
		
		//3.partial attribute xpath
		//input[contains(@id,'firstName')]
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("Leaf@1234");
		
		//1.
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		//2.Text Based Xpath
		//tagname[text()='value']
		driver.findElement(By.xpath("//a[text()='Setup Home']")).click();
		
		//4.partial Text based xpath
		//a[contains(text(),'CRM')]
		driver.findElement(By.xpath("//a[contains(text()='Release']")).click();
		
		//5. index based or collection based xpath
		//input[@class='inputLogin'])[2]
		driver.findElement(By.xpath("//input[@class='filter-box input'])[1]")).sendKeys("Mobile");
		
		
	}

}

/*
1.Attribute based xpaths
//tagname[@attributename='attributeValue']
//input[@id='email']
//input[@id='username']
2.Text Based Xpath
//tagname[text()='value']
//a[text()='Leads']
3.partial attribute xpath
//input[contains(@id,'firstName')]
//input[contains(@id,'f')]
4.partial Text based xpath
//a[contains(text(),'CRM')]
5. index based or collection based xpath
(//input[@class='inputLogin'])[2]
indexs should not go beyond 5 
steps:
1.setup the driver
2.load the url
3.maximize browser
4.close browser

url:https://login.salesforce.com/
username:hari.radhakrishnan@qeagle.com
password:Leaf@1234
*/