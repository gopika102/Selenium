package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintErrormsgAss {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		
		WebElement submitbtn= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		submitbtn.click();
		List<WebElement> alert = driver.findElements(By.xpath("//div[@class='invalid-feedback']"));
	//		String alert1 = alert.get(0).getText();
		for(WebElement list:alert)
		{
				list.getText();
				System.out.println(list.getText());
			
		}
	}
	}

