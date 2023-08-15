package com.example.netmovie.selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class WebDriverUtil {
	
	private static String WEB_DRIVER_ID = "webdriver.chrome.driver"; // Properties 설정 
	private static String WEB_DRIVER_PATH = "C:\\STUDY\\driver\\chromedriver-win64\\chromedriver.exe"; //WebDriver 경로
	
	public static WebDriver getChromeDriver() {
		if(ObjectUtils.isEmpty(System.getProperty(WEB_DRIVER_ID))) {
			System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH); 
		}
		//webDriver 옵션 설정
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true); 
		options.addArguments("--lang=ko"); 
		options.addArguments("--no-sandbox"); 
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.setCapability("ignoreProtectedModeSettings", true);
		
        //webDriver 생성
		WebDriver driver= new ChromeDriver(options); 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); 
		
		return driver;
	}
	

	public static void quit(WebDriver driver) {
		if(!ObjectUtils.isEmpty(driver)) driver.quit();
	}
	
	public static void close(WebDriver driver) {
		if(!ObjectUtils.isEmpty(driver)) driver.close();
	}
}
