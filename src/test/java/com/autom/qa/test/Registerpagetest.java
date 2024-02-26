package com.autom.qa.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.autom.qa.base.Testbaseclass;
import com.autom.qa.pages.LoginPage;
import com.autom.qa.pages.Menupages;
import com.autom.qa.pages.Registerpage;
import com.autom.qa.util.Testutil;

public class Registerpagetest extends Testbaseclass{
	Menupages menupage=new Menupages();
	LoginPage loginpage=new LoginPage();
	Registerpage regpage=new Registerpage();
	String sheetName="Registration";

	public Registerpagetest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void browsersetup() {
		initialization();
	}
	 @Test(priority=1,dataProvider="createTestdatas")
	 public void createuser(String name,String email,String title,String password,String day,String month,String year,String firstname,String lastname,String company,String address1,String address2,String country,String state,String city,String zipcode,String mobilenum) throws IOException, InterruptedException {
		 loginpage= menupage.clickonLogin();
		 regpage.register(name,email,title,password,day,month,year,firstname,lastname, company, address1, address2, country, state, city, zipcode, mobilenum);
	 }
	 @DataProvider
	 public Object[][] createTestdatas() throws EncryptedDocumentException, IOException {
		 Object[][]data=Testutil.getTestData(sheetName);
		 return data;
	 }
}
