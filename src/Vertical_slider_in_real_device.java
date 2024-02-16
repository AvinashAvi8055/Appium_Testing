import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class Vertical_slider_in_real_device {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM,"Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		
		dc.setCapability("appPacakage","");
		
		dc.setCapability("appActivity","");
		
		@SuppressWarnings("deprecation")
		URL url=new URL("https://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(url,dc);
		
		driver.findElementsById("android:id/text1").get(10).click();
		
		AndroidElement list=(AndroidElement)driver.findElementsById("android:id/text1");
		
		MobileElement listitem = (MobileElement) driver.findElement(
				MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector()).scrollIntoView("
								+"new UiSelector().description(\"Switches\"));"));	
		
		System.out.println(listitem.getLocation());
		listitem.click();
		driver.close();

	}

}
