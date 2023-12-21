package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextAssignment2 {
public static void main(String[] args) {
	
	 {
		System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement check1 = driver.findElement(By.xpath("(//label[@class='form-check-label'])[1]"));
		String checkbox1 = check1.getText();
		System.out.println(checkbox1);
		WebElement check2 = driver.findElement(By.xpath("(//label[@class='form-check-label'])[2]"));
		String checkbox2 = check2.getText();
		WebElement check3 = driver.findElement(By.xpath("(//label[@class='form-check-label'])[3]"));
		String checkbox3 = check3.getText();
		WebElement check4 = driver.findElement(By.xpath("(//label[@class='form-check-label'])[4]"));
		String checkbox4 = check4.getText();
		WebElement check5 = driver.findElement(By.xpath("(//label[@class='form-check-label'])[5]"));
		String checkbox5 = check5.getText();
		System.out.println(checkbox2);
		System.out.println(checkbox3);
		System.out.println(checkbox4);
		System.out.println(checkbox5);
	}
}
}
