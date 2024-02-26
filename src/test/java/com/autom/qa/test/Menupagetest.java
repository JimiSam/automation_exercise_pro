package com.autom.qa.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.autom.qa.base.Testbaseclass;
import com.autom.qa.pages.LoginPage;
import com.autom.qa.pages.Menupages;


import com.autom.qa.pages.Productpages;

public class Menupagetest extends Testbaseclass{
	Menupages menupage=new Menupages();
    LoginPage loginpage=new LoginPage();
    Productpages productpage=new Productpages();
	public Menupagetest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void browsersetup() {
		initialization();
	}
	 @Test(priority=1)
	 public void validateTitletest() {
		 String title=driver.getTitle();
		 Assert.assertEquals(title,"Automation Exercise");
	 }
	 @Test(priority=2)
	 public void validateClickonLogin() throws IOException {
		loginpage= menupage.clickonLogin();
	 }
	 
	 @Test(priority=3)
	 public void validateRegistration() throws IOException {
		loginpage= menupage.clickonRegister();
	 }
	 @Test(priority=4)
	 public void validateProduct() throws IOException {
		productpage= menupage.clickOnProduct();
	 }
	  
	 
	 
	

}
