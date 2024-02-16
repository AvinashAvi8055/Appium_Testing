import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Checkbox_RadioButtons_textbox_in_real_device {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM,"Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		
		//dc.setCapability("appPacakage","");
		
		//dc.setCapability("appActivity","");
		dc.setCapability(MobileCapabilityType.APP,"C:\\APK's\\com-hmh-api-2.apk");
		
		@SuppressWarnings("deprecation")
		URL url=new URL("https://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(url,dc);
		
		//view 
		driver.findElementsById("android:id/text1").get(10).click();
		
		//controls
		
		driver.findElementsById("android:id/text1").get(4).click();
		
		//Dark THeam
		driver.findElementsById("android:id/text1").get(1).click();
		//driver.findElementByAccessibilityId("2.Dark Theme").click();
		
		//textBox
		driver.findElementById("com.hmh.api:id/edit").sendKeys("Hello Groot!");
		
		//Checkbox
		driver.findElementById("com.hmh.api:id/check1").click();
		
		//radiobuttons
		driver.findElementById("com.hmh.api:id/radio1").click();
		
		//star
		driver.findElementById("com.hmh.api:id/star").click();
		
		//toggle on/off
		driver.findElementById("com.hmh.api:id/toggle1").click();
		
		//drop downs
		driver.findElementById("com.hmh.api:id/spinner1").click();
		driver.findElementsById("android:id/text1").get(1).click();
		
		//close
		
		driver.quit();
	}

}
