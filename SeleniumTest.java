package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.CreateAcct;
@org.testng.annotations.Test

public class SeleniumTest {
	
	
	
@Test
public void accountCreationTest() throws InterruptedException
{ 
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\417085\\Desktop\\rohit\\selium\\driver\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.gmail.com/intl/en/mail/help/about.html");
		driver1.manage().window().maximize();
		Thread.sleep(2000);
		driver1.findElement(By.id("gmail-create-account")).click();
		CreateAcct log = new CreateAcct(driver1);
		
		log.SetallElements();
		log.setvalues();
        

		
	//	driver1.close();
		/*submitbutton
	
	CreateAcct ceate=new CreateAcct(driver1);*/
}


}
