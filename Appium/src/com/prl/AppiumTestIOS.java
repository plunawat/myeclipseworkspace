package com.prl;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;

public class AppiumTestIOS {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		/*
		AppiumServiceBuilder builder = new AppiumServiceBuilder();
		// builder.withAppiumJS(new
		// File("C:/Users/parikshit/node_modules/appium/lib/main.js"));

		Map<String, String> env1 = new HashMap<>();
		env1.put("--log", "/Users/plunawat/abc.txt");
		env1.put("p", "19191");
		builder.withEnvironment(env1);
		builder.withArgument(GeneralServerFlag.LOG_LEVEL, "warn");
		builder.withLogFile(new File("/Users/plunawat/abc.txt"));

		*/
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "iPhone 6s");
		//capabilities.setCapability("app", "/Users/plunawat/Downloads/Safarilauncher.ipa");
		
		
		
		capabilities.setCapability("automationName", "XCUITest");
		capabilities.setCapability("browserName", "Safari");
		IOSDriver<WebElement> driver = new IOSDriver<>(new URL("http://10.112.26.104:4723/wd/hub"), capabilities);
		driver.get("http://www.rediff.com");
		System.out.println(driver.getTitle());
		/* capabilities.setCapability("log", "C:/Users/parikshi/abc.txt");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("appPackage", "com.mobeta.android.demodslv");
		capabilities.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
		capabilities.setCapability("avd", "Nexus5");

		//builder.withCapabilities(capabilities);
		//AppiumDriverLocalService appservice = builder.build();
		//System.out.println(appservice.isRunning());

		//appservice.start();
		//System.out.println(appservice.getUrl().toString());

		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

		new WebDriverWait(driver, 10)
				.until(ExpectedConditions
						.elementToBeClickable(By.xpath("//android.widget.TextView[@bounds='[0,337][1080,516]']")))
				.click();

		//appservice.stop();

		/*
		 * Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		 * Runtime.getRuntime().
		 * exec("\"C:\\Program Files (x86)\\Appium\\node.exe\" \"C:\\Program Files (x86)\\Appium\\node_modules\\appium\\lib\\server\\main.js\" --address 127.0.0.1 --port 4725 --device-ready-timeout 10 --platform-name Android --platform-version 23 --automation-name Appium --log-no-color"
		 * ); Thread.sleep(60000); System.setProperty("webdriver.chrome.driver",
		 * "C:\\PRL\\Study\\Libraries\\ChromeDriver\\chromedriver.exe");
		 * WebDriver driver = new ChromeDriver();
		 * 
		 * Process p = Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		 * 
		 * DesiredCapabilities capabilities = new DesiredCapabilities();
		 * //capabilities.setCapability("udid", "4100876ce4fa8127");
		 * capabilities.setCapability("deviceName", "doesn't Matter");
		 * capabilities.setCapability("platformName", "Android");
		 * capabilities.setCapability("app",
		 * "C:/PRL/Study/Appium/TestAPKs/ApiDemos.apk");
		 * //capabilities.setCapability("appPackage",
		 * "com.fortysevendeg.android.swipelistview");
		 * //capabilities.setCapability("appActivity",
		 * "com.fortysevendeg.android.swipelistview.sample.activities.SwipeListViewExampleActivity"
		 * ); //capabilities.setCapability("appPackage",
		 * "com.mobeta.android.demodslv");
		 * //capabilities.setCapability("appActivity",
		 * "com.mobeta.android.demodslv.Launcher");
		 * 
		 * capabilities.setCapability("appPackage", "io.appium.android.apis");
		 * capabilities.setCapability("appActivity",
		 * "io.appium.android.apis.ApiDemos");
		 */

		// AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new
		// URL("http://127.0.0.1:4725/wd/hub"), capabilities);
	}
}
/*
 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 * //tabScrollTest(driver); //dragAndDropTest(driver); //swipeTest(driver);
 * seekBarTest(driver); }
 * 
 * public static void dragAndDropTest(AndroidDriver driver) {
 * //driver.findElement(By.xpath("//android.widget.LinearLayout[0]")).click();
 * 
 * driver.findElement(By.name("Basic usage playground")).click(); WebElement
 * source = driver.findElement(By.xpath(
 * "//android.widget.ImageView[@bounds='[18,1293][216,1494]']")); WebElement
 * target = driver.findElement(By.xpath(
 * "//android.widget.ImageView[@bounds='[18,258][216,459]']")); TouchAction ta =
 * new TouchAction(driver); ta.press(source).moveTo(target).release().perform();
 * 
 * 
 * System.out.println(source.getAttribute("selected")); }
 * 
 * 
 * public static void swipeTest(AndroidDriver driver) {
 * 
 * Dimension size = driver.manage().window().getSize(); WebElement el1 =
 * driver.findElement(By.xpath(
 * "//android.widget.RelativeLayout[@bounds='[0,1032][1080,1302]']")); Dimension
 * size2 = el1.getSize(); Point p1 = el1.getLocation(); int startx = (int)
 * (p1.getX() * 0.2); int endx = size2.getWidth()/2; int starty = p1.getY() -
 * (size2.height/2);
 * 
 * driver.swipe(startx, starty, endx, starty,3000);
 * 
 * 
 * }
 * 
 * public static void scrollTest(AndroidDriver driver) {
 * 
 * }
 * 
 * public static void tabScrollTest(AndroidDriver<AndroidElement> driver) throws
 * InterruptedException {
 * 
 * String str = "Spinner"; scrollTo1(driver); scrollTo2(driver,str);
 * driver.findElementByXPath("//android.widget.TextView[@text='"+str+"']").click
 * (); Thread.sleep(2000); driver.findElementByXPath(
 * "//android.widget.TextView[@bounds='[40,441][1208,527]']").click();
 * Thread.sleep(2000);
 * driver.findElementByXPath("//android.widget.CheckedTextView[@text='green']").
 * click();
 * 
 * }
 * 
 * public static void scrollTo2(AndroidDriver<AndroidElement> driver, String
 * str) { ABC: while(true) { List<AndroidElement> lae =
 * driver.findElementsByClassName("android.widget.TextView");
 * 
 * for(AndroidElement ae1 : lae) { if(ae1.getText().equals("Spinner")) { break
 * ABC; } } AndroidElement ae2 =
 * driver.findElementByXPath("//android.widget.TextView[@text='"+lae.get(10).
 * getText()+"']"); //ae2.swipe(SwipeElementDirection.UP,1000);
 * driver.swipe(540, 1650, 540, 400, 2000); } }
 * 
 * public static void scrollTo1(AndroidDriver<AndroidElement> driver) throws
 * InterruptedException { AndroidElement me =
 * driver.findElementByXPath("//android.widget.TextView[@text='Text']");
 * me.swipe(SwipeElementDirection.UP,2000);
 * driver.findElementByXPath("//android.widget.TextView[@text='Views']").click()
 * ; Thread.sleep(2000); }
 * 
 * public static void seekBarTest(AndroidDriver<AndroidElement> driver) throws
 * InterruptedException {
 * 
 * String str = "Seek Bar"; scrollTo1(driver); scrollTo2(driver,str);
 * driver.findElementByXPath("//android.widget.TextView[@text='"+str+"']").click
 * (); Thread.sleep(2000);
 * 
 * AndroidElement ae = driver.findElementById("io.appium.android.apis:id/seek");
 * 
 * int startX = ae.getLocation().getX(); int yAxis = ae.getLocation().getY();
 * int endX = ae.getSize().getWidth();
 * 
 * TouchAction ta = new TouchAction(driver); //ta.press(startX,
 * yAxis).moveTo(1027, yAxis).release().perform(); //Thread.sleep(2000);
 * ta.press((int)(startX + 100), yAxis).moveTo((int)(startX + 300),
 * yAxis).release().perform();
 * 
 * }
 * 
 */
