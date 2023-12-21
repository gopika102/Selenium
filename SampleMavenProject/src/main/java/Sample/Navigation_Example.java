package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigation_Example {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "D:\\edge_driver\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().refresh();
	driver.navigate().to("https://www.facebook.com/");
	driver.navigate().back(); // to go to the previous page
}
}
