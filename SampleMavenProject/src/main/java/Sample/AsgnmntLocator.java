package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AsgnmntLocator {
	public static void main(String[] args) {
		
	
System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
/*driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
driver.manage().window().maximize();
WebElement EnterMessageField = driver.findElement(By.id("single-input-field"));
EnterMessageField.sendKeys("Hello World");
WebElement ShowMsg = driver.findElement(By.id("button-one"));
ShowMsg.click();
//Using any locator
driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
driver.manage().window().maximize();
WebElement maleradiobtn = driver.findElement(By.cssSelector("#inlineRadio1"));
maleradiobtn.click();*/
driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
WebElement msg = driver.findElement(By.cssSelector(".form-control"));
msg.sendKeys("Hello World");
WebElement shwmsg = driver.findElement(By.cssSelector("#button-one"));
shwmsg.click();
}
}
