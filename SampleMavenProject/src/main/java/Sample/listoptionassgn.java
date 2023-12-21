package Sample;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listoptionassgn {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/bootstrap-dual-list.php");
	List<WebElement> menuelt = driver.findElements(By.xpath("//select[@name='duallistbox_demo1[]_helper1']//option"));
	for(WebElement list:menuelt)
	{
		String printlist=list.getText();
		System.out.println(printlist);
	}
	
}
}
