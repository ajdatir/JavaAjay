package Implimentation;

import org.openqa.selenium.By;

import DriversUtilities.DriverUtil;

public class Imp extends DriverUtil {
	
	static By username = By.xpath("");

	public static void iEnterUsername(String user) {
		driver.findElement(username);
		
	}

}
