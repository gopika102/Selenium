package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AsgnRadiobtn {
	public static void main(String[] args) {
		
	
System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
WebElement radiobtn = driver.findElement(By.name("inlineRadioOptions"));
radiobtn.click();
WebElement Showslctdvalue = driver.findElement(By.id("button-one"));
Showslctdvalue.click();
}
}