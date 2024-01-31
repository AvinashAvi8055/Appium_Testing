import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator_testing_on_Real_Device {

	public static void main(String[] args) throws MalformedURLException{
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
		
		WebElement seven=driver.findElementById("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07");    // 7	value
		
		seven.click();
		
		driver.findElementById("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add").click();    // + 	Button
		
		driver.findElementById("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01").click();     //  1	value
		
		driver.findElementById("com.sec.android.app.popupcalculator:id/calc_keypad_btn_00").click();		//  0  value
		
		driver.findElementById("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal").click();     //  = Button
		
		
		String result=driver.findElementById("com.sec.android.app.popupcalculator:id/calc_edt_formula").getText();
		
		if(result.equals("10")){
			System.out.println("Test Passed");
		}
		else 
		{
			System.out.println("Tess Failed");
		}
		
		driver.quit();
		
		
	
	}

}
