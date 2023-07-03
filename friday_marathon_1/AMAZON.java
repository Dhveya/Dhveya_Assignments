package friday_marathon_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AMAZON {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//01) Launch Chrome
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//02) Load https://www.amazon.in/
		driver.get("https://www.amazon.in");
		
		// add  implicitlyWait
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     
	     //03) Type "Bags" in the Search box
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
	     
	     //04) Choose the item in the result (bags for boys)	     
	     driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();  
	     driver.findElement(By.id("nav-search-submit-button")).click();
	     
	     //05) Print the total number of results (like 50000) 1-48 of over 50,000 results for "bags for boys"
	     String resultSearch = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
	     System.out.println("Result : " + resultSearch);
		
	     //06) Select the first 2 brands in the left menu (like American Tourister, Generic)
	     WebElement op1 = driver.findElement(By.xpath("//div[@id='brandsRefinements']//span[@data-csa-c-type='element']//input"));
	     driver.executeScript("arguments[0].click();",op1);
	     WebElement op2 = driver.findElement(By.xpath("(//div[@id='brandsRefinements']//span[@data-csa-c-type='element']//input)[2]"));
	     driver.executeScript("arguments[0].click();",op2);
	     Thread.sleep(3000);
	
	     //07) Choose New Arrivals (Sort)
	     driver.findElement(By.className("a-dropdown-prompt")).click();
	     driver.findElement(By.xpath("//div[@class='a-popover-inner']//a[text()='Newest Arrivals']")).click();
	     
	     //08) Print the first resulting bag info (name, discounted price)
	     driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro']//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]")).click();
	     //String ptitle = driver.findElement(By.xpath("//h1[@id='title']/span[@class='a-size-large product-title-word-break']")).getText();
	     String ptitle = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).getText();
	     System.out.println("Product Title is:" + ptitle);
	     
	     //String pdiscountedTotal = driver.findElement(By.xpath("//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']//span[@class='a-price-whole']")).getText();
	     String pdiscountedTotal = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
	     System.out.println("Discounted Total Price is" + pdiscountedTotal);
	     
	     // 09) Get the page title and close the browser(driver.close())
	     String title = driver.getTitle();
	     System.out.println("Title of the page is"+title);
	     
	     driver.close();
	     
		}

}
