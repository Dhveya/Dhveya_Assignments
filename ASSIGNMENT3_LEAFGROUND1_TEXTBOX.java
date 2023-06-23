package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ASSIGNMENT3_LEAFGROUND1_TEXTBOX {

	public static void main(String[] args) throws InterruptedException {
		ASSIGNMENT3_LEAFGROUND1_TEXTBOX A3 = new ASSIGNMENT3_LEAFGROUND1_TEXTBOX();
		//A3.ASSIGNMENT3_TEXTBOX();
		//A3.ASSIGNMENT3_BUTTON();
		A3.ASSIGNMENT3_RadioButton();
		A3.ASSIGNMENT3_Dropdown();
		A3.ASSIGNMENT3_Checkbox();
	}

	private void ASSIGNMENT3_TEXTBOX() {
		// TODO Auto-generated method stub
		FirefoxDriver FF$01_a = new FirefoxDriver();
		FF$01_a.manage().window().maximize();
		FF$01_a.get("https://www.leafground.com/input.xhtml");
		
		FF$01_a.findElement(By.id("j_idt88:name")).sendKeys("Pinky"); 				//1. Type your name
		//FF$01_a.findElement(By.xpath("textBox/textArea")).sendKeys("-India"); 		//2. Append Country to this City
		FF$01_a.findElement(By.id("j_idt88:j_idt93")).isEnabled(); 					// 3. Verify if text box is disabled
		FF$01_a.findElement(By.id("j_idt88:j_idt95")).clear();      				// 4. Clear the typed text
		FF$01_a.findElement(By.id("j_idt88:j_idt97")).getText();					// 5. Retrieve the typed text
		FF$01_a.findElement(By.id("j_idt88:j_idt99")).sendKeys("dhveya7@gmail.com");// 6. Type email and Tab. Confirm control moved to next element
		FF$01_a.findElement(By.id("j_idt88:j_idt99")).sendKeys(Keys.TAB);
		
		FF$01_a.findElement(By.name("j_idt88:j_idt101")).sendKeys("I am a TestLeaf member");		// 7. Type about yourself
		
		//FF$01_a.findElement(By.className("ql-editor ql-blank")).sendKeys("Hello Team!");			// 8. Text Editor - Could find duplicate class names for the same so pausing as of now
		FF$01_a.findElement(By.name("j_idt106:thisform:age")).sendKeys(Keys.ENTER);					// 9. Just Press Enter and confirm error message*
		FF$01_a.findElement(By.id("j_idt106:thisform:j_idt110_error-detail")).isDisplayed();
		
		
		//FF$01_a.navigate().back();
		//FF$01_a.findElement(By.name("j_idt106:float-input"));						// 10. Click and Confirm Label Position Changes - Couldn't get this command

		//11. Type your name and choose the third option - No dropdown options getting displayed to select the third one
		FF$01_a.findElement(By.name("j_idt106:auto-complete_input")).sendKeys("PinkyPattu");
		FF$01_a.findElement(By.name("j_idt106:auto-complete_input")).sendKeys(Keys.ENTER);	
		
		FF$01_a.findElement(By.name("j_idt106:j_idt122")).click();					// 12. Click and Confirm Keyboard appears
		
		//13. Custom Toolbar
		FF$01_a.findElement(By.className("ql-editor")).sendKeys("Save Environment!Save Electricity!");
		//String FontB = FF$01_a.findElement(By.className("ql-editor")).getCssValue(""); --will continue after the class explanations for this topic
	}

	private void ASSIGNMENT3_BUTTON() throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver CD$01_a = new ChromeDriver();
		CD$01_a.manage().window().maximize();
		CD$01_a.get("https://www.leafground.com/button.xhtml");
		
		CD$01_a.findElement(By.className("layout-main-content")).click(); //Click and confirm title
		Thread.sleep(2000);
		CD$01_a.navigate().back();
		CD$01_a.findElement(By.id("j_idt88:j_idt92")).isEnabled(); //COnfirm if the button is disabled
		
	}

	private void ASSIGNMENT3_Dropdown() {
		EdgeDriver	ED	=	new	EdgeDriver();
		ED.manage().window().maximize();
		ED.get("https://www.leafground.com/select.xhtml");
		
		ED.findElement(By.name("j_idt87")).click();
		ED.findElement(By.className("ui-selectonemenu")).isSelected(); // XPATH concept - Select by value...TBC
		
	}
	
	private void ASSIGNMENT3_Checkbox() {
		FirefoxDriver FF = new FirefoxDriver();
		FF.manage().window().maximize();
		FF.get("https://www.leafground.com/checkbox.xhtml");
		
		FF.findElement(By.className("ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active")).isSelected();
	}
	
	private void ASSIGNMENT3_RadioButton() {
		ChromeDriver CD = new ChromeDriver();
		CD.manage().window().maximize();
		CD.get("https://www.leafground.com/radio.xhtml");
		
		
		//ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active --TBC after class
	}
}