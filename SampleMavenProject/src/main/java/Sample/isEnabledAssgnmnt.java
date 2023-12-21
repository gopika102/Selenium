package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledAssgnmnt {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
	 WebElement male = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
	Boolean malebtn = male.isEnabled();
	WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
	Boolean femalebtn = female.isEnabled();
	System.out.println("male radio button is enabled:" +malebtn);
	System.out.println("female radio button is enabled:" +femalebtn);
	WebElement shwslctd = driver.findElement(By.xpath("//button[contains(text(),'Selected Value')]"));
	Boolean showselectedvalue = shwslctd.isEnabled();
	System.out.println("show selected value button is enabled:" +showselectedvalue);
}
}
