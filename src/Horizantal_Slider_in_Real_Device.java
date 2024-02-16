import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class Horizantal_slider_in_real_device {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM,"Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		
		dc.setCapability("appPackage","com.mobeta.android.demodslv\r\n");
		
		dc.setCapability("appActivity","com.mobeta.android.demodslv.TestBedDSLV");
		
		@SuppressWarnings("deprecation")
		URL url=new URL("https://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(url,dc);
		
		WebElement slider=driver.findElementById("");
		String value1=driver.findElementById("").getText();
		
		System.out.println(value1);
		TouchAction action = new TouchAction((MobileDriver)driver);
		
		action.longPress(ElementOption.element(slider)).moveTo(ElementOption.element(slider,80,90)).release().perform();
		String value2=driver.findElementById("").getText();
		System.out.println(value2);
		
		driver.close();
		

	}

}
