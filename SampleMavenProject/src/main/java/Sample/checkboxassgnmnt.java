package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxassgnmnt {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	WebElement first = driver.findElement(By.xpath("//label[@class='form-check-label']"));
	first.click();
	WebElement second =  driver.findElement(By.xpath("//input[@id='check-box-one']"));
	second.click();
	WebElement third = driver.findElement(By.xpath("//input[@id='check-box-two']"));
	third.click();
	WebElement fourth = driver.findElement(By.xpath("//input[@id='check-box-three']"));
	fourth.click();
	WebElement fifth = driver.findElement(By.xpath("//input[@id='check-box-four']"));
	fifth.click();
	WebElement all = driver.findElement(By.xpath("//input[@id='button-two']"));
	all.click();
}
}
