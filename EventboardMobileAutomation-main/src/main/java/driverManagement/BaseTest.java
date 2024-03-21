package driverManagement;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
public class BaseTest {
    public static String path;
    static Properties prop;
    static FileReader reader;
    static String androidPlatformVersion;
    static String androidDeviceName;
    static String androidAppPackage;
    static String androidAppActivity;
    static String iosPlatformVersion;
    static String iosDeviceName;
    static String iosBundleId;
    static String androidDriverUrl;
    static String iosDriverUrl;
    static {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "appium.properties";
        try {
            reader = new FileReader(new File(path));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        prop = new Properties();
        try {
            prop.load(reader);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        androidDeviceName = prop.getProperty("androidDeviceName");
        androidPlatformVersion = prop.getProperty("androidPlatformVersion");
        androidAppPackage = prop.getProperty("androidAppPackage");
        androidAppActivity = prop.getProperty("androidAppActivity");
        iosDeviceName = prop.getProperty("iosDeviceName");
        iosPlatformVersion = prop.getProperty("iosPlatformVersion");
        iosBundleId = prop.getProperty("iosBundleId");
        androidDriverUrl = prop.getProperty("androidDriverUrl");
        iosDriverUrl = prop.getProperty("iosDriverUrl");
    }
    public AppiumDriver driver;
    public ExtentReports reports;
    public ExtentSparkReporter htmlReporter;
    protected ExtentTest extentlog;
    public BaseTest() {
    }
    public String getDateAndTime() {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E_yyyy-MM-dd_hh_mm_ss_a_zzz");
        return ft.format(dNow).toString();
    }
    public String capture() throws IOException {
        if (driver == null)
            System.out.println("driver was null");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dest = System.getProperty("user.dir") + File.separator + "Screenshots" + File.separator
                + "TestProof_Screenshots" + getDateAndTime() + ".png";
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);
        return dest;
    }
    @BeforeClass
    public void loadProperties() throws Exception {
        reports = new ExtentReports();
        htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + File.separator + "reports"
                + File.separator + "TeemMobileAutomationReport.html" + getDateAndTime());
        reports.attachReporter(htmlReporter);
        reports.setSystemInfo("Env", "QA");
        reports.setSystemInfo("Organization", "Cybage");
        reports.setSystemInfo("Website", "https://app.teem.com");
        reports.setSystemInfo("browser", "chrome");
        reports.setSystemInfo("QA", "SonaliK");
        try {
            htmlReporter.loadXMLConfig(System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                    + File.separator + "java" + File.separator + "Utils" + File.separator + "extentconfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public AppiumDriver getAndroidDriver(String deviceName, String platformVersion, String appPackage, String appActivity)
            throws MalformedURLException {
        UiAutomator2Options capabilities = new UiAutomator2Options();
        capabilities.setAdbExecTimeout(Duration.ofMinutes(3));
        capabilities.setAvdLaunchTimeout(Duration.ofMinutes(3));
        capabilities.setAutoGrantPermissions(true);
        capabilities.setCapability("appium:platformName", "Android");
        capabilities.setCapability("appium:platformVersion", "13");
        capabilities.setCapability("appium:deviceName", "Pixel C API 33");
        capabilities.setCapability("appium:appPackage", "enderlabs.eventboardandroid.full");
        capabilities.setCapability("appium:appActivity", "enderlabs.eventboardandroid.MainActivity");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("newCommandTimeout", 0);
        capabilities.setCapability("appium:webviewConnectTimeout", 15000);
        capabilities.setCapability("appium:webviewConnectRetries", 60);
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("autoAcceptAlerts", "true"); // to accept all alert
        capabilities.setCapability("autoDissmissAlerts", "true"); // to dismiss all alerts
        driver = new AndroidDriver(new URL(androidDriverUrl), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }
    public AppiumDriver getiOSDriver(String deviceName, String platformVersion, String bundleId)
            throws MalformedURLException {
        XCUITestOptions capabilities = new XCUITestOptions();
        capabilities.setCapability("appium:platformName", "iOS");
        capabilities.setCapability("appium:platformVersion", "16.4");
        capabilities.setCapability("appium:deviceName", "Ipad Air");
        capabilities.setCapability("appium:bundleId", "com.enderlabs.eventboardpro");
        capabilities.setCapability("appium:udid", "CA37465B-2535-4F50-874E-50FDEBFA1D16");
        capabilities.setCapability("appium:automationName", "XCUITest");
        capabilities.setCapability("xcodeSigningId", "iPhone Developer");
        capabilities.setCapability("newCommandTimeout", 0);
        capabilities.setCapability("appium:webviewConnectTimeout", 15000);
        capabilities.setCapability("appium:webviewConnectRetries", 60);
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("autoAcceptAlerts", "true"); // to accept all alert
        capabilities.setCapability("autoDissmissAlerts", "true"); // to dismiss all alerts
        driver = new IOSDriver(new URL(iosDriverUrl), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }
    @BeforeMethod
    //@Parameters({"platform"})
    public void setUp() throws MalformedURLException {
        String platform = "Ios";
        AndroidDriver tdriver;
        IOSDriver iosdriver;

        if (platform.equalsIgnoreCase("android")) {
            tdriver = (AndroidDriver) getAndroidDriver(androidDeviceName, androidPlatformVersion, androidAppPackage, androidAppActivity);
            tdriver.terminateApp("enderlabs.eventboardandroid.full");
            driver = getAndroidDriver(androidDeviceName, androidPlatformVersion, androidAppPackage, androidAppActivity);
        } else {
            iosdriver = (IOSDriver) getiOSDriver(iosDeviceName, iosPlatformVersion, iosBundleId);
            iosdriver.terminateApp(iosBundleId);
            driver = getiOSDriver(iosDeviceName, iosPlatformVersion, iosBundleId);
        }
    }
    @AfterClass()
    public void endTest() {
        reports.flush();
    }
}