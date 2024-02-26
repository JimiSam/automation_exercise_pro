package com.autom.qa.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.autom.qa.base.Testbaseclass;
import com.autom.qa.pages.LoginPage;
import com.autom.qa.pages.Menupages;
import com.autom.qa.util.Testutil;

public class LoginPageTest extends Testbaseclass {
	Menupages menupage=new Menupages();
	LoginPage loginpage=new LoginPage();
	String sheetName="Sheet1";
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void browsersetup() {
		initialization();
	}
	 @Test(priority=1)
	 public void validateTitletest() throws IOException {
		 loginpage= menupage.clickonLogin();
		 String title=driver.getTitle();
		 Assert.assertEquals(title,"Automation Exercise - Signup / Login");
	 }
	 @Test(priority=2,dataProvider="getTestdatas")
	 public void validateLogin(String username,String password) throws IOException {
		 loginpage= menupage.clickonLogin();
		// menupage= loginpage.userlogin(prop.getProperty("username"),prop.getProperty("password"));
		 menupage= loginpage.userlogin(username,password);
		 String actualErrorMessage = loginpage.getErrorMessage(); 
		 String expectedErrorMessage = "Your email or password is incorrect!";
		  Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
		 
	 }
	 @DataProvider
	 public Object[][] getTestdatas() throws EncryptedDocumentException, IOException {
		 Object[][]data=Testutil.getTestData(sheetName);
		 return data;
	 }
	

}
