package friday_marathon_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ABHIBUS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//01) Launch  Chrome browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//add  implicitlyWait driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//02) Load https://www.abhibus.com/
		driver.get("https://www.abhibus.com/");
		
		//03) Click on Bus
		driver.findElement(By.id("pills-home-tab")).click();
		
		//04) Type "Chennai" in the FROM text box
		driver.findElement(By.id("source")).sendKeys("Chennai");
		//driver.findElement(By.xpath("//li[@class='ui-menu-item']/li[text()='Chennai']")).click();
		
		//05) Click the first option from the pop up box
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
		/*WebElement op = driver.findElement(By.className("ui-menu-item"));
		Select option = new Select(op);
		option.selectByVisibleText("Chennai");*/
		
		//06) Type "Bangalore" in the TO text box
		driver.findElement(By.id("destination")).sendKeys("Bangalo");
		
		//07) Click the first option from the pop up box
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		
		//08) Select tomorrow's date in the Date field
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		driver.findElement(By.xpath("//td[contains(@class,'datepicker')]/a[contains(text(),'1')]")).click();
		//driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/a[@class='ui-state-default']/a[@text()='1']")).click();
		//driver.findElement(By.xpath("//label[@class='control-label'][3]")).click();
		//driver.findElement(By.xpath("//div[contains(@class='ui-datepicker-header')]/table[@class='ui-datepicker-calendar']/a[@class='ui-state-default']/a[@text()='1']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'1')]")).click();
		
		//09) Click Search Buses
		driver.findElement(By.linkText("Search")).click();
		
		//09) Print the name of the first resulting bus (use .getText())
		WebElement column1 = driver.findElement(By.xpath("//div[@class='search-column1']/h2[contains(text(),'Parveen')]"));
		System.out.println(column1.getText());
		
		//10) Choose SLEEPER in the left menu from Bus Type
		driver.findElement(By.id("bustypeSLEEPER")).click();
		
		//11) Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
		WebElement check2 = driver.findElement(By.xpath("//div[@class='search-column2-col1']/p"));
		System.out.println(check2.getText());
		
		//12) Click SelectSeat
		driver.findElement(By.xpath("//span[@class='book']")).click();
		
		// 13)Choose any one Available seat
		driver.findElement(By.xpath("//span[@class='pillow']")).click();
		//driver.findElement(By.xpath("//li[contains(@class,'sleeper available')/a")).click();
		//driver.findElement(By.xpath("//li[contains(@class,'sleeper ') :: 
		//driver.findElement(By.xpath("//li[contains(@class,'sleeper selected')/a")).click();
		//driver.findElement(By.xpath("//li[contains(@class,'seat available')]/a")).click();
		//driver.findElement(By.xpath("//li[contains(@class,'seat selected')]/a")).click();
		
		//14. Print Seats Selected ,Total Fare
		WebElement check3 = driver.findElement(By.xpath("//div[@class='jurnydetails']/div/p/span[@id='seatnos']"));
		System.out.println("Seat No" + check3.getText());
		
		WebElement check4 = driver.findElement(By.xpath("//div[@class='jurnydetails']/div/p/span[@id='ticketfare']"));
		System.out.println("TicketFare" + check4.getText());
		
		//15. Select Boarding Point  and Dropping Point (Select class)
		
		WebElement c5 = driver.findElement(By.id("boardingpoint_id"));
		Select check5 = new Select(c5);
		check5.selectByIndex(3);
		
		WebElement c6 = driver.findElement(By.id("boardingpoint_id"));
		Select check6 = new Select(c6);
		check6.selectByIndex(3);
		
		// 16)  Get the Title of the page(use .getTitle())
		String title = driver.getTitle();
		System.out.println("Title of the page is "+title);
		
		//17) Close the browser
		driver.close();
	}
}
	