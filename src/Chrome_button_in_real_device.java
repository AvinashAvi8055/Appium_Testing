import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Chrome_button_in_real_device {

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
		
		driver.findElementById("io.selendroid.testapp:id/my_text_field").click();
		driver.findElementById("io.selendroid.testapp:id/inputUsername").sendKeys("Groot");
		driver.findElementById("io.selendroid.testapp:id/inputEmail").sendKeys("Groot");
		driver.findElementById("io.selendroid.testapp:id/inputPassword").sendKeys("Groot");
		driver.findElementById("io.selendroid.testapp:id/inputName").clear();
		driver.findElementById("io.selendroid.testapp:id/inputName").sendKeys("Groot G");
		driver.findElementByXPath("//android.widget.TextView[@text=\"TandC\"]").click();
		//var prg_elm=driver.findElementById("android:id/select_dialog_listview");
		//var prg=Select(prg_elm);
		
		
		

	}

}
