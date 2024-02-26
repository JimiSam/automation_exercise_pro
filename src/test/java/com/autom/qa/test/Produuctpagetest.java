package com.autom.qa.test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.autom.qa.base.Testbaseclass;
import com.autom.qa.pages.LoginPage;
import com.autom.qa.pages.Menupages;
import com.autom.qa.pages.Productpages;

public class Produuctpagetest extends Testbaseclass{
	 Menupages menupage=new Menupages();
     LoginPage loginpage=new LoginPage();
     Productpages productpage=new Productpages();

	public Produuctpagetest() throws IOException {
		super();
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void browsersetup() {
		initialization();
	}
	@Test(priority=1)
	public void validateTitle() throws IOException {
		productpage=menupage.clickOnProduct();
		String title=driver.getTitle();
		Assert.assertEquals(title,"Automation Exercise - All Products");
	}
	@Test(priority=2)
	public void validatesearchproduct() throws IOException, InterruptedException {
		productpage=menupage.clickOnProduct();
		productpage.validateSearch("tops");
	}
	@Test(priority=3)
	public void validateviewProduct() throws IOException, InterruptedException {
		productpage=menupage.clickOnProduct();
		productpage.viewProduct();
		
	}
	 
	
}
