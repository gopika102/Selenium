package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipAssignment {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/window-popup.php ");
	WebElement likefb = driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
	String title1 =likefb.getAttribute("title");
	System.out.println("toottip of likefb:"+title1);
	WebElement followall = driver.findElement(By.xpath("//a[@id='windowMulti']"));
	String title2 =followall.getAttribute("title");
	System.out.println("toottip of followall:"+title2);
	
}
}
