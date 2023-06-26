package week2.day1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ASSIGNMENT1_FACEBOOK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	FaceBook:
		//	================================
			ChromeDriver driver = new ChromeDriver();	// Step 2: Launch the chromebrowser
			driver.get("https://en-gb.facebook.com/");// Step 3: Load the URL https://en-gb.facebook.com/
			driver.manage().window().maximize(); // Step 4: Maximise the window
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // Step 5: Add implicit wait
			driver.findElement(By.linkText("Create new account")).click();// Step 6: Click on Create New Account button
			driver.findElement(By.name("firstname")).sendKeys("Pinkyma"); // Step 7: Enter the first name
			driver.findElement(By.name("lastname")).sendKeys("Ra");// Step 8: Enter the last name
			driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");// Step 9: Enter the mobile number
			driver.findElement(By.id("password_step_input")).sendKeys("Password$1");// Step 10: Enter the password
			// Step 11: Handle all the three drop downs
			
			WebElement op = driver.findElement(By.id("day"));
			Select option = new Select(op);
			option.selectByIndex(21);
			
			WebElement op1 = driver.findElement(By.id("month"));
			Select option1 = new Select(op1);
			option1.selectByValue("4");
			
			WebElement op2 = driver.findElement(By.id("year"));
			Select option2 = new Select(op2);
			option2.selectByVisibleText("1907");
			
			driver.findElement(By.xpath("//label[text()='Female']")).click();// Step 12: Select the radio button "Female" 
	
	}
	}


