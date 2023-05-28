package com.example.vpayaptitude;

import static com.example.vpayaptitude.Locators.FirstName;
import static com.example.vpayaptitude.Locators.GetStarted;
import static com.example.vpayaptitude.Locators.Register;
import static com.example.vpayaptitude.Locators.Skip;
import static java.lang.Thread.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class vpayapp {
    private static WebDriver driver;
    public static void main(String[] args) throws InterruptedException{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion", "13");
        capabilities.setCapability("appPackage","cash.dartpay.merchant");
        capabilities.setCapability("appActivity","cash.dartpay.merchant.MainActivity");
        capabilities.setCapability("deviceName","22091FDF6000BQ");
        capabilities.setCapability("unicodeKeyboard", true);
        capabilities.setCapability("resetKeyboard", true);

        // values to fill in

        String firstNameValue =  "Abdullahi";
        String lastNameValue =  "Abubakar";
        String phoneNumberValue = "08169817051";
        String emailAddressValue =  "omolaja.abuabakar04@gmail.com";
        String referralCodeValue = "Appium";
        String passwordValue = "Light_wave_cap.01";
        String confirmPasswordValue = "Light_wave_cap.01";
        System.out.println("String");

        try {
            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        sleep(3000);
        driver.findElement(By.xpath(Skip)).click();
        sleep(1000);

        driver.findElement(By.xpath(Skip)).click();
        sleep(1000);

        driver.findElement(By.xpath(Skip)).click();
        sleep(1000);

        driver.findElement(By.xpath(GetStarted)).click();
        sleep(1000);

        driver.findElement(By.className(FirstName)).click();
        sleep(1500);
        driver.findElement(By.className(FirstName)).sendKeys(firstNameValue);
        sleep(1500);

        driver.findElement(By.xpath("//*[@text='*Surname']")).click();
        sleep(1500);
        driver.findElement(By.xpath("//*[@text='*Surname\n" +
                "*Surname']")).sendKeys(lastNameValue);
        sleep(1500);


        driver.findElement(By.xpath("//*[@text='*Phone No']")).click();
        sleep(1500);
        driver.findElement(By.xpath("//*[@text='*Phone No\n" +
                "*Phone No']")).sendKeys(phoneNumberValue);
        sleep(1500);

        driver.findElement(By.xpath("//*[@text='*Email Address']")).click();
        sleep(1500);
        driver.findElement(By.xpath("//*[@text='*Email Address']")).sendKeys(emailAddressValue);
        sleep(1500);

        driver.findElement(By.xpath("//*[@text='Referral Code (Optional)']")).click();
        sleep(1500);
        driver.findElement(By.xpath("//*[@text='Referral Code (Optional)\n" +
                "Referral Code']")).sendKeys(referralCodeValue);
        sleep(1500);

        driver.findElement(By.xpath("//*[@text='*Password']")).click();
        sleep(1500);
        driver.findElement(By.xpath("//*[@text='*Password']")).sendKeys(passwordValue);
        sleep(1500);

        driver.findElement(By.xpath("//*[@text='*Confirm Password']")).click();
        sleep(1500);
        driver.findElement(By.xpath("//*[@text='*Confirm Password']")).sendKeys(confirmPasswordValue);
        sleep(1500);

        driver.findElement(By.xpath(Register)).click();
        sleep(6000);

        driver.quit();
    }
}
