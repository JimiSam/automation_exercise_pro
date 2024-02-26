package com.autom.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.autom.qa.base.Testbaseclass;

public class Productpages extends Testbaseclass{
	Menupages menupage=new Menupages();
    LoginPage loginpage=new LoginPage();
   // Productpages productpage=new Productpages();
    
	public Productpages() throws IOException {
		super();
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	public String validateProducttitle() {
		return driver.getTitle();
		
	}
	
	public Productpages validateSearch(String searchpdt) throws IOException, InterruptedException {
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.id("search_product"));
		search.sendKeys(searchpdt);
		WebElement searchbtn=driver.findElement(By.id("submit_search"));
		searchbtn.click();
		return new Productpages();
	}
	public Productpages viewProduct() throws IOException, InterruptedException {
		Thread.sleep(2000);
		WebElement pdt=driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a"));
		pdt.click();
		return new Productpages();
		
	}
	
}
