package com.autom.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbaseclass {
	public static WebDriver driver;
	protected static Properties prop;
	public Testbaseclass() throws IOException {
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\AUTOMATION\\selenium\\eclipse-java-photon-R-win32-x86_64 (3)\\eclipse\\automationmaven\\src\\main\\java\\com\\autom\\qa\\config\\config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void initialization() {
		String browsers=prop.getProperty("browser");
		if(browsers.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION\\selenium\\chromedriver_win32 (3)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
		}
		
	}

}
