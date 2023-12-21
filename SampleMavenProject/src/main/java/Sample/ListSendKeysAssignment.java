package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListSendKeysAssignment {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/form-submit.php");
	List<WebElement> fname = driver.findElements(By.xpath("//input[@type='text']"));
	for(WebElement list:fname)
	{
		list.sendKeys("Hello");
		
	}
}
}