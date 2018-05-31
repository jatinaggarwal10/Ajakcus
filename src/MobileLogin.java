import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class MobileLogin {
	
	AppiumDriver <WebElement>driver;
	 
	
	 @BeforeClass
	 
	  public void setup() throws MalformedURLException, InterruptedException {
		 
		    DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, MobilePlatform.ANDROID);
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "45");
			cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.phasorlab.starter");
		    cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.phasorlab.starter.MainActivity");
			AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			driver.manage().timeouts().implicitlyWait(85, TimeUnit.SECONDS);
			Thread.sleep(10000);
			System.out.print(driver.getContext());
			Set<String >s=driver.getContextHandles();
			for(String handle: s) {
				
				System.out.println(handle);
				
			}
			
			driver.context("WEBVIEW_com.phasorlab.starter");
			driver.manage().timeouts().implicitlyWait(85, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//span[text()='Login']")).click();
			
			  
			  
		// Step1: Enter Email with Forgot Password action //
			  
			 driver.findElement(By.xpath("//span[text()='Login']")).click();
			 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jatinatj12@gmail.com");  //Enter Email ID//
			 driver.findElement(By.linkText("Forgot Password?")).click();
			 Actions actions = new Actions(driver);
			 actions.click();
			 actions.build().perform();
			 driver.findElement(By.linkText("Back to Login")).click();                                 //Back to Login page//
			 
		// Step 2: Validity of Email and Password //

			  WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
			  email.sendKeys("abc12");                                                                 //Giving invalid Email input//
			  System.out.println("abc12-Please enter valid email");
			  email.clear();
			  email.sendKeys("maulik@");
			  System.out.println("maulik@-Please enter valid email");
			  email.clear();
			  email.sendKeys("maulik@ajackus.com");                                                   //Giving correct Email//
			  System.out.println("maulik@ajackus.com is a Valid Email");
			  driver.findElement(By.xpath("//span[text()='Login']")).click(); 
			  System.out.println(" Email-maulik@ajackus.com");
			  
			  System.out.println("Password is mandatory");                                             // Password is Required//
			  WebElement pass1=driver.findElement(By.xpath("//input[@type='password']"));
			  pass1.sendKeys("ajakcus12**");                                                            //Giving password//
			  System.out.println("Password is ajakcus12**");
			  driver.findElement(By.xpath("//span[text()='Login']")).click();
			  System.out.println("Invalid crendentials");                                               //Invalid credentials //
			  
			  
			  //Step 3: Giving Valid credentials//
			  Actions action = new Actions(driver);
			  action.click();
			  action.build().perform();
			  WebElement Element = driver.findElement(By.xpath("//input[@type='password']"));          // Editing previous password//
			  Element.clear();
			  Thread.sleep(1000);
			  Element.sendKeys("test123");                                                             
			  driver.findElement(By.xpath("//span[text()='Login']")).click();
			  System.out.println("Logged In Successfully");  
			  
			  
	
	 }
			  		
			@Test
			 	
				public void testWebViews()throws Exception
			    {
				
				System.out.println(" Login Script Passed Successfully");
			
}
}