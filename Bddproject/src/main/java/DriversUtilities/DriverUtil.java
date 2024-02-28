package DriversUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverUtil {
	
	public static WebDriver driver;
	
public static void main(String arge[]) throws Exception {
	
		WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver() ;
	driver.get("https://www.saucedemo.com/v1/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	
}

}
