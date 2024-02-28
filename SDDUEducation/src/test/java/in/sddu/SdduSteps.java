package in.sddu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SdduSteps  {
	
	public static WebDriver driver;
	
	
	
	public static By usernametxt = By.xpath("");
	public static By passwordtxt = By.xpath("");
	public static By button = By.xpath("");
	public static By sdstrans = By.xpath("//span[text()='  SRM Transaction']/ancestor::a");
	public static By directpo = By.xpath("");
	public static By pofirstname = By.xpath("");
	public static By polastname = By.xpath("");
	
	
	public static void iOpenLoginPage() {
		System.out.println("aSDFGHJJHGHFGXGFXGRFXRF");
		driver.findElement(usernametxt).sendKeys("c1439");
		driver.findElement(passwordtxt).sendKeys("passwd@1");
		driver.findElement(button).click();		
	}
	
	public static void sdsTransection() {
		driver.findElement(sdstrans).click();
		driver.findElement(directpo).click();		
	}

	public static void iFillDirectPo() {
		driver.findElement(pofirstname).sendKeys("");
		driver.findElement(polastname).sendKeys("");
	}

}
