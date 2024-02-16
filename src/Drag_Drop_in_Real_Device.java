import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Drag_Drop_in_Real_Device {

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
		
		driver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.mobeta.android.demodslv:id/activity_desc\" and @text=\"Use the menu to adjust settings related to item removal and drag initiation. These options are provided by the DragSortController class.\"]").click();
		
		//ChickCorea
		
		WebElement source=driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(2);
		
		//MilesDavis
		
		WebElement dest=driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(4);
		
		TouchAction action =new TouchAction((MobileDriver)driver);
		
		//drag and drop
		
		action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(dest)).release().perform();
		
		System.out.println("Successfully drag and drop");
		
		driver.close();				
		
	}

}
