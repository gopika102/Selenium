package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssppptyAssignmnt {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/window-popup.php ");
		WebElement likefb = driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		String fsize1 = likefb.getCssValue("font-size");
		System.out.println("font size of like fb:"+fsize1);
		String fcolor1 = likefb.getCssValue("color");
		System.out.println("font color of like fb:"+fcolor1);
		String bclr1 = likefb.getCssValue("background-color");
		System.out.println("background clr of like fb:"+bclr1);
		WebElement followall = driver.findElement(By.xpath("//a[@id='windowMulti']"));
		String fsize2 = followall.getCssValue("font-size");
		System.out.println("font size of followall:"+fsize2);
		String fcolor2 = followall.getCssValue("color");
		System.out.println("font color of followall:"+fcolor2);
		String bclr2 = followall.getCssValue("background-color");
		System.out.println("background clr of followall:"+bclr2);
	}
}
