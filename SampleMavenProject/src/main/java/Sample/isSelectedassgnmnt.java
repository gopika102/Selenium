package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedassgnmnt {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	WebElement check1 = driver.findElement(By.xpath("//input[@id='gridCheck']"));
	Boolean checkbox1 = check1.isSelected();
	System.out.println("checkbox 1 is selected:" +checkbox1);
	check1.click();
	WebElement checkk1 = driver.findElement(By.xpath("//input[@id='gridCheck']"));
	Boolean checkboxx1 = checkk1.isSelected();
	System.out.println("checkbox 1 is selected:" +checkboxx1);
	
}
}
