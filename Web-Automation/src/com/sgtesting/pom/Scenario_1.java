package com.sgtesting.pom;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario_1 {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		//logout();
		createUser();
		deleteuser();
		//closeApplication();
	}

	public static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser()
	{
		try
		{
			oPage.getCreateUser().click();
			Thread.sleep(3000);
			oPage.getAddUser().click();
			Thread.sleep(3000);
			oPage.getFN().sendKeys("user1");
			Thread.sleep(3000);
			oPage.getLN().sendKeys("demo1");
			Thread.sleep(3000);
			oPage.getemail().sendKeys("123@gmai.com");
			Thread.sleep(3000);
			oPage.getUsername().sendKeys("u1");
			Thread.sleep(3000);
			oPage.getPasswordford1().sendKeys("1234");
			Thread.sleep(3000);
			oPage.GetpasswordCopy1().sendKeys("1234");
			Thread.sleep(3000);
			oPage.GetAddbutton().click();
			Thread.sleep(3000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser()
	{
		try
		{
			oPage.getUser1Icon().click();
			Thread.sleep(3000);
            oPage.getDelet().click();
            Thread.sleep(3000);
            Alert OAlert=oBrowser.switchTo().alert();
			String textcontent=OAlert.getText();
			System.out.println(textcontent);
			OAlert.accept();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		}
	}



