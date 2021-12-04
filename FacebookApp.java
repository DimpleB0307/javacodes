package com.xworkz.facebookapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookApp {
	
	public static void main(String[] args)
	{
		WebDriver faceBook = new ChromeDriver();
		faceBook.manage().window().maximize();
		faceBook.get("https://www.facebook.com/");
		
		By emailIdField = By.id("email");
		WebElement emailField = faceBook.findElement(emailIdField);
		emailField.click();
		emailField.sendKeys("dimplejul07@gmail.com");
		
		By passrdField = By.name("pass");
		WebElement passwordField = faceBook.findElement(passrdField);
		passwordField.click();
		passwordField.sendKeys("dimple@9876");
		
		By logIn = By.name("login");
		WebElement loginField = faceBook.findElement(logIn);
		loginField.click();
		
		Thread.sleep(10000);
		
		By fgotPasswrd = By.partialLinkText("Forgot");
		WebElement forgotPasswrd = faceBook.findElement(fgotPasswrd);
		forgotPasswrd.click();
		
	}

}

}
