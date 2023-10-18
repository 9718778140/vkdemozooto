package appiumtest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MotogTest {

	public static void main(String[] args) {
		
		File applicationParentDirectoryPath = new File("//Users//vipin//Documents//Mobile Automation//onlyrndjavatest.apk");
		File app = new File(applicationParentDirectoryPath, "//Users//vipin//Documents//Mobile Automation//onlyrndjavatest.apk");
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4a");
		// TODO Auto-generated method stub
		// new case for testing
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Android");
        capabilities.setCapability("platformVersion", "13");
		// end new case
		
		
		desiredCapabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		try {
			AndroidDriver androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
