package com.autom.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.autom.qa.base.Testbaseclass;

public class Registerpage extends Testbaseclass{
	
	public Registerpage() throws IOException {
		super();
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	/*public void register() throws InterruptedException {
		driver.findElement(By.name("name")).sendKeys("Jimi");
		driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("jimi@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Signup')]")).click();
		driver.findElement(By.xpath("//input[@id=\"id_gender2\"]")).click();
		
		driver.findElement(By.id("password")).sendKeys("jimi@12345");
		Select day=new Select(driver.findElement(By.id("days")));
		day.selectByValue("10");
		Select month=new Select(driver.findElement(By.id("months")));
		month.selectByValue("1");
		Select year=new Select(driver.findElement(By.id("years")));
		year.selectByValue("1997");
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		driver.findElement(By.name("first_name")).sendKeys("Jimi");
		driver.findElement(By.name("last_name")).sendKeys("sam");
		driver.findElement(By.name("company")).sendKeys("stc"); 
		driver.findElement(By.name("address1")).sendKeys("stctech");
		Select country=new Select(driver.findElement(By.id("country")));
		country.selectByValue("India");
		driver.findElement(By.name("state")).sendKeys("kerala"); 
		driver.findElement(By.name("city")).sendKeys("ekm"); 
		driver.findElement(By.name("zipcode")).sendKeys("5523456"); 
		driver.findElement(By.name("mobile_number")).sendKeys("5656262358"); 
		driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
		Thread.sleep(2000);
		 
		boolean acc=driver.findElement(By.xpath("//b[contains(text(),'Account Created!')]")).isDisplayed();
		if(acc) {
			System.out.println("Account Created!");
		}
		else {
			System.out.println("sorry");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		boolean name=driver.findElement(By.xpath("//a[text()=\" Logged in as \"]//b[text()=\"Jimi\"]")).isDisplayed();
		if(name) {
			System.out.println("Login with username");
		}
		else {
			System.out.println("Login without username");
		}
	
	}*/
	public void register(String name,String email,String title,String password,String day,String month,String year,String firstname,String lastname,String company,String address1,String address2,String country,String state,String city,String zipcode,String mobilenum) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys(name);
		driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//button[contains(text(),'Signup')]")).click();
		driver.findElement(By.xpath("//input[@id=\"id_gender2\"]")).click();
		
		driver.findElement(By.id("password")).sendKeys(password);
		// String representation of a floating-point number
        String floatString = day;

        // Convert the string to a float
        float floatValue = Float.parseFloat(floatString);
		// Floating-point number
        double floatingPointValue = floatValue;

        // Convert the double to an integer
        int integerValue = (int) floatingPointValue;

        // Convert the integer to a string
        String integerValueAsString = String.valueOf(integerValue);
		Select days=new Select(driver.findElement(By.id("days")));
		days.selectByVisibleText(integerValueAsString);
		Select months=new Select(driver.findElement(By.id("months")));
		months.selectByVisibleText(month);
		// String representation of a floating-point number
        String floatStringyear = year;

        // Convert the string to a float
        float floatValueyear = Float.parseFloat(floatStringyear);
		// Floating-point number
        double floatingpointyear = floatValueyear;

        // Convert the double to an integer
        int integerValueyear = (int) floatingpointyear;
     // Convert the integer to a string
        String integerValueAsStringyear = String.valueOf(integerValueyear);
		Select years=new Select(driver.findElement(By.id("years")));
		years.selectByVisibleText(integerValueAsStringyear);
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		driver.findElement(By.name("first_name")).sendKeys(firstname);
		driver.findElement(By.name("last_name")).sendKeys(lastname);
		driver.findElement(By.name("company")).sendKeys(company); 
		driver.findElement(By.name("address1")).sendKeys(address1);
		Select countrys=new Select(driver.findElement(By.id("country")));
		countrys.selectByValue(country);
		driver.findElement(By.name("state")).sendKeys(state); 
		driver.findElement(By.name("city")).sendKeys(city); 
		// String representation of a floating-point number
        String floatzipcode = zipcode;

        // Convert the string to a float
        float floatValuezipcode = Float.parseFloat(floatzipcode);
		// Floating-point number
        double floatingpointzip = floatValuezipcode;

        // Convert the double to an integer
        int integerValuezip = (int) floatingpointzip;
     // Convert the integer to a string
        String integerValueAsStringzip = String.valueOf(integerValuezip);
		driver.findElement(By.name("zipcode")).sendKeys(integerValueAsStringzip); 
		// String representation of a floating-point number
        String floatmob = mobilenum;

        // Convert the string to a float
        float floatValuemob = Float.parseFloat(floatmob);
		// Floating-point number
        double floatingpointmob = floatValuemob;

        // Convert the double to an integer
        int integerValuemob = (int) floatingpointmob;
     // Convert the integer to a string
        String integerValueAsStringmob = String.valueOf(integerValuemob);
		driver.findElement(By.name("mobile_number")).sendKeys(integerValueAsStringmob); 
		driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
		Thread.sleep(2000);
		 
		boolean acc=driver.findElement(By.xpath("//b[contains(text(),'Account Created!')]")).isDisplayed();
		if(acc) {
			System.out.println("Account Created!");
		}
		else {
			System.out.println("sorry");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		boolean names=driver.findElement(By.xpath("//a[text()=\" Logged in as \"]//b[text()='"+name+"']")).isDisplayed();
		if(names) {
			System.out.println("Login with username");
		}
		else {
			System.out.println("Login without username");
		}
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	
	}



}
