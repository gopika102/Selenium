package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclsass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php ");
		WebElement selectclr = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(selectclr);
		//select.selectByIndex(2);// to select clr yellow
		select.selectByVisibleText("Yellow");
}
}