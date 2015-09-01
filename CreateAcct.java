package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;
public class CreateAcct {
	
	WebDriver driver=null;
	WebElement FirstName1;
	WebElement LastName1;
	WebElement LoginName;
	WebElement Password;
	WebElement RePassword;
	WebElement Day;
	WebElement Year;

	WebElement Phone;
	WebElement Email;
	WebElement SkipCaptch;
	WebElement Location;
	WebElement Agree;
	WebElement Next;
	String output;
	
	public void SetallElements()
	{
		FirstName1 = driver.findElement(By.id("FirstName"));
		LastName1=driver.findElement(By.id("LastName"));
		LoginName=driver.findElement(By.id("GmailAddress"));
		Password=driver.findElement(By.id("Passwd"));
		RePassword=driver.findElement(By.id("PasswdAgain"));
		Day	=driver.findElement(By.id("BirthDay"));
		Year=driver.findElement(By.id("BirthYear"));
		Phone=driver.findElement(By.id("RecoveryPhoneNumber"));

		Email = driver.findElement(By.id("RecoveryEmailAddress"));
		SkipCaptch= driver.findElement(By.id("SkipCaptcha"));
		Agree=driver.findElement(By.id("TermsOfService"));
		Next=driver.findElement(By.id("submitbutton"));
		
		
		
		
		
	//	Select dropdown = new Select(driver.findElement(By.id("designation")));
	}
	
	public void setvalues() throws InterruptedException
	{
		
		FirstName1.sendKeys("rohit");
		LastName1.sendKeys("garud");
		LoginName.sendKeys("rohit45300");
		Password.sendKeys("Rohit1234567");
		RePassword.sendKeys("Rohit1234567");
	
		SkipCaptch.click();
		Agree.click();
		Day.sendKeys("08");
		Year.sendKeys("2015");
		Phone.sendKeys("9881721030");
		Email.sendKeys("rohitgam@gmail.com");
        driver.findElement(By.xpath("//label[@id='month-label']/span/div/div")).click();
        driver.findElement(By.xpath("//label[@id='month-label']/span/div[2]/div[@id=':7']")).click();
        driver.findElement(By.xpath("//*[@id='Gender']/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=':e']/div")).click();
        Next.click();
        output= driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr/td/font[2]/p")).getText();
        Assert.assertTrue(output.equals("In order to have a Google Account, you must meet certain age requirements. To learn more about online child safety, visit the Federal Trade Commission's website."));
        
	}
public CreateAcct(WebDriver driver) {
	this.driver=driver;		
	}




}
