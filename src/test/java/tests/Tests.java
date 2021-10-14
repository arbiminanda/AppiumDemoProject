package tests;

import java.awt.Robot;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class Tests extends BaseClass{
	
	static Robot robot = null;
	
	@Test
	public void testOne() throws AWTException{
		System.out.println("Application Started.....");
		MobileElement button = driver.findElement(By.xpath("//android.widget.Button[@text='3']"));
		button.click();
		System.out.println("Test done.....");
	}
	
	@Test
	public void testTwo() throws AWTException{
		System.out.println("Application Started.....");
		MobileElement button = driver.findElement(By.xpath("//android.widget.Button[@text='5']"));
		button.click();
		System.out.println("Test done.....");
	}
	
}
