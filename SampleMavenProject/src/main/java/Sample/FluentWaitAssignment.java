package Sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://selenium.obsqurazone.com/jquery-progress-bar.php");
			driver.manage().window().maximize();
			Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
			WebElement downloadbtn = driver.findElement(By.xpath("//button[@id='downloadButton']"));
			wait.until(ExpectedConditions.elementToBeClickable(downloadbtn));
			downloadbtn.click();
			//WebElement label = driver.findElement(By.xpath("//div[contains(text(),'Current Progress')]"));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Current Progress')]")));
			WebElement cmplt= driver.findElement(By.xpath("//div[contains(text(),'Complete!')]"));
			String complete = cmplt.getText();
			System.out.println(complete);
			
		   
	}

}
