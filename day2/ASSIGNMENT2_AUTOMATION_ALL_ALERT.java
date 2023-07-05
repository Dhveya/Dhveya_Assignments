package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASSIGNMENT2_AUTOMATION_ALL_ALERT {

	public static void main(String[] args) throws InterruptedException {
		//https://www.leafground.com/alert.xhtml
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		// Alert (Simple Dialog)
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Alert simple = driver.switchTo( ).alert();
		simple.accept();
		Thread.sleep(3000);
		
		// Alert (Confirm Dialog)
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert confirm = driver.switchTo( ).alert();
		confirm.dismiss();
		Thread.sleep(3000);
		
		
		// Sweet Alert (Simple Dialog)
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		String text1 = driver.findElement(By.xpath("//p[contains(text(),'You have clicked and open a dialog that can be inspectable')]")).getText();
		System.out.println("Sweet Alert - Simple :" + "\n" + text1);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		Thread.sleep(3000);
		
		
		
		// Sweet Modal Dialog
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		String text2 = driver.findElement(By.xpath("//p[contains(text(),'Unless you close this, you cannot interact with other element. But am inspectable !')]")).getText();
		System.out.println("Sweet Modal :" + "\n" + text2);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-closethick']")).click();
		Thread.sleep(3000);
				
		
		// Alert (Prompt Dialog)
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert p1 = driver.switchTo( ).alert();
		p1.sendKeys("Happy Working!");
		p1.accept();
		Thread.sleep(3000);
		
		
		// Sweet Alert (Confirmation)
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		String text3 = driver.findElement(By.xpath("//p[contains(text(),'Are you sure you want to proceed?')]")).getText();
		System.out.println("Sweet Alert (Confirmation) :" + "\n" + text3);
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		Thread.sleep(3000);
				
		//
		driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
		driver.findElement(By.className("ui-dialog-titlebar-icon ui-dialog-titlebar-maximize ui-corner-all")).click();
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
		Thread.sleep(3000);
		
		driver.close();

	}

}
