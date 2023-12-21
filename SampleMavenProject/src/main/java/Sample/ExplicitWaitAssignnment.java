package Sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAssignnment {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/dynamic-load.php ");
	driver.manage().window().maximize();
	 // WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement getnewuser = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	// wait.until(ExpectedConditions.elementToBeClickable(getnewuser));
	 getnewuser.click();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[@class='card-title']")));
	 WebElement name = driver.findElement(By.xpath("//h5[@class='card-title']"));
	 WebElement emailid = driver.findElement(By.xpath("//p[@class='card-text text-center p-3']"));
	  String genname = name.getText();
	  String genemailid = emailid.getText();
	  System.out.println(genname);
	  System.out.println(genemailid);
}
}
