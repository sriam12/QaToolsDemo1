package PracticeTestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qatools.base.TestBase;
import com.qatools.util.TestUtil;

import PageObjectModal.HomePage;
import PageObjectModal.PracticeSwitchWindowPage;

public class Window_handling_TestCases extends TestBase {

	HomePage homepage;
	PracticeSwitchWindowPage  practiceSwitchWindow;
	TestUtil testUtil;
	
	 public Window_handling_TestCases(){
		 super();
	 }
	 @BeforeClass
	 public void setUp(){
		 initialization();
		 testUtil = new TestUtil();
		 homepage = new HomePage();
		 practiceSwitchWindow = new PracticeSwitchWindowPage();
	 }
	 
	 @Test(priority=1)
	 public void verify_title(){
		 homepage.click_Aut_Practice_Swith_Window();
		 String tit = practiceSwitchWindow.Switch_New_Browser_Win();
		 Assert.assertEquals(tit, "Free QA Automation Tools Tutorial for Beginners with Examples");
	 }
	 
	 @Test(priority=2)
	 public void Verify_PageSource(){
		 String tit = practiceSwitchWindow.Switch_New_Mess_Win();
	 }
	 
	 @Test(priority=3)
	 public void Verify_title(){
		 String tit = practiceSwitchWindow.Switch_New_Browser_tab();
	 }
	 
}
