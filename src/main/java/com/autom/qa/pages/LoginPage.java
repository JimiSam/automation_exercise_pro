package com.autom.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import com.autom.qa.base.Testbaseclass;

public class LoginPage extends Testbaseclass {

	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
	public String validateLogintitle() {
		return driver.getTitle();
	}
      
	public Menupages userlogin(String username,String password) throws IOException {
		WebElement uname=driver.findElement(By.xpath
				("//input[@data-qa=\"login-email\"]"));
		uname.sendKeys(username);
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys(password);
		WebElement logbut=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		logbut.click();
		return new Menupages();
		
	}
	public String getErrorMessage() {
      
		return driver.findElement(By.xpath("//p[contains(text(),'Your email or password is incorrect!')]")).getText();
    }
	public Registerpage register() throws InterruptedException, IOException {
		return new Registerpage();
	}
}
