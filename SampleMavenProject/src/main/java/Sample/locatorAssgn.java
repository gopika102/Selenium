package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class locatorAssgn {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
//	driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
//	WebElement maleradbtn = driver.findElement(By.cssSelector("#inlineRadio1"));
//	maleradbtn.click();
	
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	WebElement msg = driver.findElement(By.cssSelector(".form-control"));
	msg.sendKeys("Hello World..");
	WebElement showmsg = driver.findElement(By.partialLinkText("Show Message"));
	showmsg.click();
}
}
