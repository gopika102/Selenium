package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorAssign {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	driver.manage().window().maximize();
	
	JavascriptExecutor js = (JavascriptExecutor) driver; //explicit typecasting
	WebElement checkbox4 = driver.findElement(By.xpath("//label[contains(text(),'Check Box Four')]"));
	js.executeScript("arguments[0].scrollIntoView();", checkbox4);
	js.executeScript("arguments[0].click();", checkbox4);
	
}
}
