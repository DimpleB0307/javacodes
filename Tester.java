package com.xworkz.flipcartapp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tester {
	
	public static void main(String[] args)
	{
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		By emailIdField = By.id("email");
		WebElement emailField = driver.findElement(emailIdField);
		emailField.click();
		emailField.sendKeys("dimplejul07@gmail.com");
		
		By passrdField = By.name("pass");
		WebElement passwordField = driver.findElement(passrdField);
		passwordField.click();
		passwordField.sendKeys("Dimple@9876");
		
		
		By logIn = By.name("login");
		WebElement loginField = driver.findElement(logIn);
		loginField.click();
		
		
		
		By frgotPassword = By.partialLinkText("Forgot");
		WebElement forgotPassword = driver.findElement(frgotPassword);
		forgotPassword.click();
		
	}

		
		
		
	}
