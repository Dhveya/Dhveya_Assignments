package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASSIGNMENT1_Frame {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		// Load the url(https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt)
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		 // 1) handle the frame 
		driver.switchTo().frame("iframeResult"); //name and id are equal
		
		//   2)Click Try It button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		// 3)Pass a text in the alert and get the Text  and accept the alert
		Alert trial = driver.switchTo().alert();
		trial.sendKeys("Happy Working!");
		trial.accept();
		
		String text = driver.findElement(By.id("demo")).getText();
		
		// 4)Verify yor name is printed successfully
		System.out.println("Name has been printed successfully as below : "+ "\n" + text);
		driver.close();
	}

}
