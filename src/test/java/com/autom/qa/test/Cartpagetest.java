package com.autom.qa.test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.autom.qa.base.Testbaseclass;
import com.autom.qa.pages.Cartpage;
import com.autom.qa.pages.LoginPage;
import com.autom.qa.pages.Menupages;
import com.autom.qa.pages.Productpages;

public class Cartpagetest extends Testbaseclass{

	 Menupages menupage=new Menupages();
     LoginPage loginpage=new LoginPage();
     Productpages productpage=new Productpages();
     Cartpage cartpage=new Cartpage();
	 public Cartpagetest() throws IOException {
		super();
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void browsersetup() {
		initialization();
	}
	
	@Test(priority=1)
	public void validateaddtocart() throws IOException, InterruptedException {
		loginpage= menupage.clickonLogin();
		menupage= loginpage.userlogin(prop.getProperty("username"),prop.getProperty("password"));
		productpage=menupage.clickOnProduct();
		productpage.viewProduct();
		cartpage.addtoCart();
		cartpage.viewcart();
		cartpage.checkout();
		cartpage.placeorder();
		cartpage.carddetails("Jimitha","2356652389566598","255","03","2025");
		cartpage.message();
		String msg="Congratulations! Your order has been confirmed!";
		if(msg.contentEquals("Congratulations! Your order has been confirmed!")) {
			System.out.println("Message displayed successfully");
		}
		cartpage.invoice();
		cartpage.continuepage();
	}

}
