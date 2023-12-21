package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssUsingList {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/bootstrap-alert.php");
	driver.manage().window().maximize();
	List<WebElement> bclr = driver.findElements(By.xpath("//div[@class='col-md-6']//button[contains(@class,'btn btn-primary btn')]"));
	for(WebElement list:bclr)
	{
		list.getCssValue("background-color");
		System.out.println(list.getCssValue("background-color"));
	}
}
}
