package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathassgnmnt {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	/*driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
	WebElement maleradbtn = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
	maleradbtn.click();
	WebElement femalebtn = driver.findElement(By.xpath("//div[@class='form-check form-check-inline']//input[@id='inlineRadio2']"));
	femalebtn.click();*/
	driver.get("url= https://selenium.obsqurazone.com/bootstrap-alert.php ");
	WebElement autoclosable = driver.findElement(By.xpath("//button[@id='autoclosable-btn-success']"));
	autoclosable.click();
	WebElement normalsuccess = driver.findElement(By.xpath("//button[@id='normal-btn-success']"));
	normalsuccess.click();
	
}
}