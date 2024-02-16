import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Automate_message_In_real_device {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM,"Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		
		dc.setCapability("appPacakage","com.sec.android.app.popupcalculator.Calculator");
		
		dc.setCapability("appActivity","com.sec.android.app.popupcalculator.converter.controller.NewUnitConverterActivity");
		
		@SuppressWarnings("deprecation")
		URL url=new URL("https://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(url,dc);
		
		driver.findElementById("").sendKeys("9390773943");
		driver.findElementById("").sendKeys("Hello welcome to my world!");
		driver.findElementById("").click();
		driver.close();

	}

}
