package PageObjectModal;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.qatools.base.TestBase;

public class HomePage extends TestBase {
	 
	public HomePage() {
		 
        PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//ul/li[1]/a[text()='Automation Practice Switch Windows']")
	WebElement Practice_Window_Link;
	
	public void click_Aut_Practice_Swith_Window(){
		Practice_Window_Link.click();
	}
	
	
	
	

}
