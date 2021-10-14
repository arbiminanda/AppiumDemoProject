package tests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	static AppiumDriver<MobileElement> driver;
	
	
	@BeforeTest
	public void setup() {
		
		try {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.VERSION, "10");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Infinix SMART 5");
		caps.setCapability(MobileCapabilityType.UDID, "0608133119100767");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		
		caps.setCapability("appPackage", "com.transsion.calculator");
		caps.setCapability("appActivity", "com.transsion.calculator.Calculator");
		
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url, caps);
		
		}
		
		catch(Exception exp) {
			System.out.println("Cause is : "+exp.getCause());
			System.out.println("Message is : "+exp.getMessage());
			exp.printStackTrace();
		}
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
