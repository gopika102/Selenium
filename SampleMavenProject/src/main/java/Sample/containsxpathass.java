package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class containsxpathass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/bootstrap-alert.php");
	WebElement auto = driver.findElement(By.xpath("//button[contains(text(),'Autoclosable success')]"));
	String printa = auto.getText();
	System.out.println(printa);
	auto.click();
	WebElement normal = driver.findElement(By.xpath("//button[contains(@id,'normal-btn-success')]"));
	String printn= normal.getText();
	System.out.println(printn);
	normal.click();
}
}
