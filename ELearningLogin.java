import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;

public class LoginElearning{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        chromeOptions.setCapability(MobileCapabilityType.DEVICE_NAME, "Sharmila");


        WebDriver driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), chromeOptions);

        driver.get("http://elearning.upskills.in/index.php");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='login']")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("admin@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='form-login_submitAuth']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/a/img")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='logout_button']")).click();

    }

}
