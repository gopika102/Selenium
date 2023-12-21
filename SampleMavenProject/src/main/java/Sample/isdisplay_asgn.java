package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplay_asgn {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php ");
	WebElement shwmsg = driver.findElement(By.xpath("//button[@id='button-one']"));
	Boolean showmessage=shwmsg.isDisplayed();
	WebElement entermsg = driver.findElement(By.xpath("//input[@id='single-input-field']"));
	Boolean entermessage = entermsg.isDisplayed();
	System.out.println("enter message field is displayed :"+entermessage);
	System.out.println("show message button is displayed :"+showmessage);
	
	
}
}
