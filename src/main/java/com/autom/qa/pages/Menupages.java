package com.autom.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import com.autom.qa.base.Testbaseclass;

public class Menupages extends Testbaseclass{
	 

	public Menupages() throws IOException {
		
		PageFactory.initElements(driver,this);
	}
	public static String validateTitle() {
		return driver.getTitle();
		
	}
	public LoginPage clickonLogin() throws IOException {
		WebElement login=driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
		login.click();
		return new LoginPage();
		
	}
	public LoginPage clickonRegister() throws IOException {
		WebElement login=driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
		login.click();
		return new LoginPage();
		
	}
	public Productpages clickOnProduct() throws IOException {
		WebElement product=driver.findElement(By.xpath("//a[@href='/products']"));
		product.click();
		return new Productpages();
	}

}
