package DriversUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws Exception {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		// TODO Auto-generated method stub
System.setProperty("webdriver.crome.driver", "./drivers.chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://chat.openai.com/c/f9017920-6c30-4930-829f-92767cabfcef");
driver.manage().window().maximize();
Thread.sleep(20000);
System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//driver.close();	
}

}
