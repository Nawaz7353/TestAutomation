package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class as2 {
	public static WebDriver n=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser();
		navigate();
		login();

		minimizeFlyOutWindow();
		createuser();
		 modify();
		 deleteuser();
		 closeApplication();

	}
	public static void launchBrowser()
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
	static void navigate()
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


	public static void createuser()
	{
		try
		{
			n.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			n.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(300);
			n.findElement(By.name("firstName")).sendKeys("user1");
			n.findElement(By.name("lastName")).sendKeys("demo");
			n.findElement(By.name("email")).sendKeys("demo@gmail.com");
			n.findElement(By.name("username")).sendKeys("naaz");
			n.findElement(By.name("password")).sendKeys("1234");
			n.findElement(By.name("passwordCopy")).sendKeys("1234");
			n.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public static void modify()
	{
		try {
			n.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			n.findElement(By.name("firstName")).clear();
			n.findElement(By.name("firstName")).sendKeys("don");
			n.findElement(By.name("username")).clear();
			n.findElement(By.name("username")).sendKeys("don06");
			Thread.sleep(2000);
			n.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	static void deleteuser()
	{
		try {
			n.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			n.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			n.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			Alert OAlert=n.switchTo().alert();
			String textcontent=OAlert.getText();
			System.out.println(textcontent);
			OAlert.accept();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeApplication()
	{
		try
		{
			n.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


