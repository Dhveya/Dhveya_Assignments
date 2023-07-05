package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CLASSROOM_ALERT {

	public static void main(String[] args) throws InterruptedException {

		
		//Simple ALert
		//Alert A1 = driver.switchTo().alert();
		//String text = A1.getText();
		//System.out.println(text);
		//A1.accept();
		
		//Confirm Alert
		
		//Alert A2 = driver.switchTo().alert();
		
		  /* https://www.leafground.com/alert.xhtm
			  
			  
			   3.pass driver control to alert
			   4.get text from alert
			   5.pass value
			   6.accpect
			   7.print text
		*/
		
		
		//	 1.launch browser and load url
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//https://www.leafground.com/alert.xhtm
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		 //2.click on show button
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Hello!! This is a Prompt check");
		Thread.sleep(3000);
		
		String text = prompt.getText();
		System.out.println(text);
		Thread.sleep(3000);
		prompt.accept();
		
		
		String text2 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text2);
		
		
		driver.close();
		
		
	
		
	}

}
