package friday_marathon_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

public class PVR {

	public static void main(String[] args) throws InterruptedException {
		
		/*FirefoxDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		//01) Launch the Url  https://www.pvrcinemas.com/
		driver1.get("https://www.pvrcinemas.com");
		
		
		FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-notifications");
        FirefoxDriver driver = new FirefoxDriver(options);
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("//div[@class='city-thumbnail]//span[text()='Chennai']")).click();
		//02) Click  on Movie Library
		driver.findElement(By.xpath("//div[@class='header-extra-links-item'][text()='Movie Library ']")).click();
		*/
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		//01) Launch the Url  https://www.pvrcinemas.com/
		driver.get("https://www.pvrcinemas.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("//div[@class='city-thumbnail]//span[text()='Chennai']")).click();
		
		 //02) Click  on Movie Library
		driver.findElement(By.xpath("//div[text()='Movie Library ']")).click();
		//driver.findElement(By.xpath("//div[normalize-space()='Movie Library']")).click();
		
		Thread.sleep(3000);
		//03) Select the City -->chennai
		WebElement op = driver.findElement(By.name("city"));
		Select option = new Select(op);
		option.selectByVisibleText("Chennai");
		
		//04) Select the Genre-->Animation	
		WebElement op1 = driver.findElement(By.name("genre"));
		Select option1 = new Select(op1);
		option1.selectByValue("{\"id\":46,\"name\":\"ANIMATION\"}");
		
		Thread.sleep(3000);
		
		//05) Select the Language-->english
		WebElement op3 = driver.findElement(By.name("lang"));
		Select option3 = new Select(op3);
		option3.selectByIndex(1);
		
		Thread.sleep(3000);
		
		//06) Click on Apply
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(3000);
	
		//07) Click on first resulting animation movie
		driver.findElement(By.xpath("(//div[contains(@class,'movie-wrapper ng-star-inserted')])[1]")).click();
		//driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		Thread.sleep(5000);
		
		//08) Click proceed to book
		driver.findElement(By.xpath("//div[@class='header-info-fixed']/button[text()='Proceed To Book']")).click();
		Thread.sleep(3000);
		
		//09) Enter  all the fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
		WebElement op2 = driver.findElement(By.id("cinemaName"));
		Select option2 = new Select(op2);
		option2.selectByValue("PVR Heritage RSL ECR Chennai");
		
		WebElement op4 = driver.findElement(By.name("timings"));
		Select option4 = new Select(op4);
		option4.selectByValue("09:00 AM - 12:00 PM");
		
		//driver.findElement(By.className("datepicker-container datepicker-default")).click();
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']//input")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='controls']/*[2]")).click();
	    driver.findElement(By.xpath("//span[text()='1']")).click();
		//driver.findElement(By.xpath("//div[@class='main-calendar-days']/span[contains(text(),'8')]")).click();
		
		driver.findElement(By.name("noOfTickets")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Pinky");
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@gmail.com");
	    driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("7402077831");
		
		WebElement food = driver.findElement(By.xpath("//select[@name='food']"));
	    Select fb =new Select(food);
	    fb.selectByVisibleText("No");
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//label[text()='F&B Requirements']/following::input")).sendKeys("None");
		
		
		//10) Click on copy to self 
	    driver.findElement(By.xpath("//div[@class='form-group col-sm-6']//label")).click();
		
		//driver.findElement(By.xpath("//label[text()='Other Requirements']")).sendKeys("Nil");
		
		//11) Click on  Send Request
		//driver.findElement(By.className("btn btn-primary rightFloat")).click();
	    driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		
		//12) Click cancel
		//driver.findElement(By.xpath("(//li[@class='cancel-btn text-center']/button[text()='CANCEL'])[2]")).click();
	    driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
	       
		//13) Close the OTP dialog box
	    driver.findElement(By.xpath("(//button[text()='×'])")).click();
		//driver.findElement(By.className("swal2-close")).click();
		
		//14) Verify the ttile of the page*/
		String title = driver.getTitle();
		System.out.println("THe title of the current page is" + title);
		
		driver.close();

	}

}

