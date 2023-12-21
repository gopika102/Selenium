package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertAssgn {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
	driver.manage().window().maximize();
	WebElement clickme1 = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	 clickme1.click();
	 String alertmsg=driver.switchTo().alert().getText();
	 System.out.println(alertmsg);
	 driver.switchTo().alert().accept(); //to click ok button
	 WebElement clickme2 = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
	 clickme2.click();
	 driver.switchTo().alert().dismiss();// to click cancel button
	 WebElement clickforprompt = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	 clickforprompt.click();
	 driver.switchTo().alert().sendKeys(" Message");
	 driver.switchTo().alert().accept(); 
}
}
