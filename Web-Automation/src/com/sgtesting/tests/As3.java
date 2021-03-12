package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class As3 {
	public static WebDriver  n=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		 deletecustomer();
	}
	public static void launch()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\Driver\\chromedriver.exe");
			n=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try
		{
			n.get("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login()
	{
		try {
			n.findElement(By.name("username")).sendKeys("admin");
			n.findElement(By.name("pwd")).sendKeys("manager");
			n.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			n.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void createCustomer()
	{
		try
		{
			n.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			n.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(3000);
			n.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);

			n.findElement(By.id("customerLightBox_nameField")).sendKeys("C22");
			Thread.sleep(2000);
			n.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deletecustomer()
	{
		try 
		{
			n.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(2000);
			n.findElement(By.xpath("//div[@class='actionButton']")).click();
			Thread.sleep(2000);
			n.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(2000);
			n.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
		}
		catch (Exception e) 
		{
		   e.printStackTrace();
		}
	}

}



