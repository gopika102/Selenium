package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttriAssgn {
public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","D:\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php ");
		WebElement male = driver.findElement(By.xpath("//input[@name='inlineRadioOptions']"));
		String namem = male.getAttribute("name");
		String idm = male.getAttribute("id");
		String classm = male.getAttribute("class");
		System.out.println(classm);
		System.out.println(namem);
		System.out.println(idm);
		WebElement female = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		String namef = female.getAttribute("name");
		String idf = female.getAttribute("id");
		String classf = female.getAttribute("class");
		System.out.println(classf);
		System.out.println(namef);
		System.out.println(idf);
		
}
}
