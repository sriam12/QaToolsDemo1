package PageObjectModal;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qatools.base.TestBase;

public class PracticeSwitchWindowPage extends TestBase{
	
	public PracticeSwitchWindowPage(){
		
        PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//button[@id='button1']")
	WebElement New_Browser_Win;
	
	@FindBy(xpath="//button[contains(text(),'New Message Window')]")
	WebElement New_Mess_Win;
	
	@FindBy(xpath ="//button[contains(text(),'New Browser Tab')]")
	WebElement New_Browser_tab;
	
	
    public String Switch_New_Browser_Win(){
    	String title ="";
    	String ParentId =driver.getWindowHandle();
    	System.out.println(ParentId);
    	New_Browser_Win.click();
    	Set<String> Id = driver.getWindowHandles();
    	Iterator<String> itr = Id.iterator();
    	while(itr.hasNext()){
    		String child_id = itr.next();
    		System.out.println(child_id);
    		if(!ParentId.equals(child_id)){
    			driver.switchTo().window(child_id);
    			driver.manage().window().maximize();
    			 title = driver.getTitle();
    			System.out.println(title);
    			driver.close();
    			
    		}
    	}
    	driver.switchTo().window(ParentId);
    	return title;
    }
    
    public String Switch_New_Browser_tab(){
    	String title ="";
    	String ParentId =driver.getWindowHandle();
    	System.out.println(ParentId);
    	New_Browser_tab.click();
    	Set<String> Id = driver.getWindowHandles();
    	Iterator<String> itr = Id.iterator();
    	while(itr.hasNext()){
    		String child_id = itr.next();
    		System.out.println(child_id);
    		if(!ParentId.equals(child_id)){
    			driver.switchTo().window(child_id);
    			driver.manage().window().maximize();
    			title = driver.getTitle();
    			System.out.println(title);
    			driver.close();
    			
    		}
    	}
    	driver.switchTo().window(ParentId);
    	return title;
    }
     
    public String Switch_New_Mess_Win(){
    	String message ="";
    	String ParentId =driver.getWindowHandle();
    	System.out.println(ParentId);
    	New_Mess_Win.click();
    	Set<String> Id = driver.getWindowHandles();
    	Iterator<String> itr = Id.iterator();
    	while(itr.hasNext()){
    		String child_id = itr.next();
    		System.out.println(child_id);
    		if(!ParentId.equals(child_id)){
    			driver.switchTo().window(child_id);
    			driver.manage().window().maximize();
    			message = driver.getTitle();
    			System.out.println(message);
    			driver.close();
    			
    		}
    	}
    	driver.switchTo().window(ParentId);
    	return message;
    }
	
}
