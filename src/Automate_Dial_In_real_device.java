import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Automate_Dial_In_real_device {

	public static void main(String[] args) throws MalformedURLException{
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM,"Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		
		dc.setCapability("appPacakage","com.samsung.android.dialer");
		
		dc.setCapability("appActivity","com.samsung.android.dialer.DialtactsActivity");
		
		@SuppressWarnings("deprecation")
		URL url=new URL("https://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(url,dc);
		
		String Actualnumber="7013388705";
		// Enter this number in the DialPad:- 7013388705
		driver.findElementById("com.samsung.android.dialer:id/seven").click();	// 7
		driver.findElementById("com.samsung.android.dialer:id/zero").click();	// 0
		driver.findElementById("com.samsung.android.dialer:id/one").click();	// 1
		driver.findElementById("com.samsung.android.dialer:id/three").click();	// 3
		driver.findElementById("com.samsung.android.dialer:id/three").click();  // 3
		driver.findElementById("com.samsung.android.dialer:id/eight").click();  // 8
		driver.findElementById("com.samsung.android.dialer:id/eight").click();  // 8
		driver.findElementById("com.samsung.android.dialer:id/seven").click();  // 7
		driver.findElementById("com.samsung.android.dialer:id/zero").click();   // 0
		driver.findElementById("com.samsung.android.dialer:id/five").click();   // 5
		
		String Typednumber = driver.findElementById("com.samsung.android.dialer:id/digits").getText();
		
		if(Actualnumber.equals(Typednumber)) {
			System.out.println("Actual number & Typed number is matched");
			driver.findElementById("com.samsung.android.dialer:id/dialButtonImage").click();
		}
		else
		{
			System.out.println("Actual number & Typed number is not matched");
			driver.findElementById("com.samsung.android.dialer:id/digits").clear();
		}
		
	}
}