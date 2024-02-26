package com.autom.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.autom.qa.base.Testbaseclass;

public class Cartpage extends Testbaseclass{
	Menupages menupage=new Menupages();
	LoginPage loginpage=new LoginPage();
	Productpages productpage=new Productpages();
	
	public Cartpage() throws IOException {
		super();
		
	}
	public Productpages addtoCart() throws IOException, InterruptedException {
		Thread.sleep(2000);
		WebElement addtocart=driver.findElement(By.xpath("//button[normalize-space()='Add to cart']"));
		addtocart.click();
		return new Productpages();
	}
	public Productpages viewcart() throws IOException, InterruptedException {
		Thread.sleep(2000);
		
		WebElement viewcart=driver.findElement(By.xpath("//u[contains(text(),'View Cart')]"));
		viewcart.click();
		return new Productpages();
	}
	public Productpages checkout() throws IOException, InterruptedException {
		Thread.sleep(2000);
		WebElement checkout=driver.findElement(By.xpath("//a[contains(text(),'Proceed To Checkout')]"));
		checkout.click();
		return new Productpages();
	}
	public Cartpage placeorder() throws InterruptedException, IOException {
		Thread.sleep(2000);
		WebElement placeorder=driver.findElement(By.xpath("//a[contains(text(),'Place Order')]"));
		placeorder.click();
		return new Cartpage();
	}
	
	public Cartpage carddetails(String name,String cardnum,String cvc,String expiry_month,String expiry_year) throws InterruptedException, IOException {
		Thread.sleep(2000);
		WebElement cardname=driver.findElement(By.name("name_on_card"));
		cardname.sendKeys(name);
		WebElement cardnumber=driver.findElement(By.name("card_number"));
		cardnumber.sendKeys(cardnum);
		WebElement cardcvc=driver.findElement(By.name("cvc"));
		cardcvc.sendKeys(cvc);
		WebElement cardexp=driver.findElement(By.name("expiry_month"));
		cardexp.sendKeys(expiry_month);
		WebElement cardexpyr=driver.findElement(By.name("expiry_year"));
		cardexpyr.sendKeys(expiry_year);
		WebElement pay=driver.findElement(By.id("submit"));
		pay.click();
		
		return new Cartpage();
	}
	public WebElement message() {
	WebElement sucess=driver.findElement(By.xpath("//p[normalize-space()='Congratulations! Your order has been confirmed!']"));
	return sucess;
	}
	public Cartpage invoice() throws IOException, InterruptedException {
		Thread.sleep(2000);
		WebElement invoice=driver.findElement(By.xpath("//a[normalize-space()='Download Invoice']"));
		invoice.click();
		return new Cartpage();
		
	}
	public Cartpage continuepage() throws IOException, InterruptedException {
		Thread.sleep(2000);
		WebElement continuepage=driver.findElement(By.xpath("//a[normalize-space()='Continue']"));
		continuepage.click();
		return new Cartpage();
		
	}
	
	

}
