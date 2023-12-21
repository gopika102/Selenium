package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextAssgnmnt {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/file-download.php");
		driver.manage().window().maximize();
		WebElement javascript = driver.findElement(By.xpath("//div[contains(text(),'Java Script Alert')]"));
		String getmsg = javascript.getText();
		System.out.println(getmsg);
		WebElement generatetext= driver.findElement(By.xpath("//button[@id='create']"));
		
		String gentext = generatetext.getText();
		
		System.out.println(gentext);
		
	}

}
