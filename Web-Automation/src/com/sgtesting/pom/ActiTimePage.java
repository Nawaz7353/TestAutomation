package com.sgtesting.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	WebDriver oBrowser=null;
	public ActiTimePage(WebDriver oBrowser)
	{
		this.oBrowser=oBrowser;
		PageFactory.initElements(oBrowser, this);
	}
	//UserName text field WebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	
	//Password text field WebElement
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login button WebElement
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//FlyoutWindow WebElement
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;	
	}
	
	//Logout Link WebElement
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
	//create user
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
	private WebElement oCreate;
	public WebElement getCreateUser()
	{
		return oCreate;
		
	}
	//add button for create user
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]")
	private WebElement oAddButton;
	public WebElement getAddUser()
	{
		return  oAddButton;
	}
	//add firstname to user1
	private WebElement firstName;
	public WebElement getFN()
	{
		return  firstName;
	}
	
	//add lastname to user1
	private WebElement lastName;
	public WebElement getLN()
	{
		return  lastName;
	}
	//emailto user1
	private WebElement email;
	public WebElement getemail()
	{
		return email;
	}
	//username to user1
	private WebElement userDataLightBox_usernameField;
	public WebElement getUsername()
	{
		return  userDataLightBox_usernameField;
	}
	//password to user1
	//userDataLightBox_passwordField
	private WebElement userDataLightBox_passwordField ;
	public WebElement getPasswordford1()
	{
		return  userDataLightBox_passwordField;
	}
	//conform passworsd
	private WebElement passwordCopy;
	public WebElement GetpasswordCopy1()
	{
		return passwordCopy;
	}
	//creat user savwebutton
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement addButton;
	public WebElement GetAddbutton()
	{
		return addButton;
	
	}
	//user1 icon
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement user1icon;
	public WebElement getUser1Icon()
	{
		return user1icon;
	
	}
	//delete button of user1
	@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
	private WebElement deletIcon;
	public WebElement getDelet()
	{
		return deletIcon;
	}
	//click on task icon to create customer
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr/td[3]/a")
	private WebElement taskIcon;
	public WebElement getTaskIcon()
	{
		return taskIcon;
	}
	//click on add new button
	//*[@id="cpTreeBlock"]/div[2]/div[1]/div[2]/div/div[2]
	//*[@id="cpTreeBlock"]/div[2]/div[1]/div[2]/div/div[3]
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[3]")
	private WebElement addnewbutton;
	public WebElement getaddButtonfortask()
	{
		return  addnewbutton;
	}

	//click on new customer icon
	@FindBy(xpath="/html/body/div[12]/div[1]")
	private WebElement addcustmr;
	public WebElement getaddButtonforcust()
	{
		return  addcustmr;
	}
	//enter customer name
	private WebElement customerLightBox_nameField;
	public WebElement getcustName()
	{
		return  customerLightBox_nameField;
	}
	//save customer name
	@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div")
	private WebElement saveCstm;
	public WebElement getsavecstm()
	{
		return   saveCstm;
	}
	//delete customer
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement editbuttonForCustom;
	public WebElement getcustEdit()
	{
		return   editbuttonForCustom;
	}
	//click action button on customer to delete
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")
	private WebElement actionbuttonForCustom;
	public WebElement getcustAction()
	{
		return   actionbuttonForCustom;
	}
	//delete button on customer
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement deletebuttonForCustom;
	public WebElement getcustDelete()
	{
		return   deletebuttonForCustom;
	}
	//confirm button of delete on customer
	@FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")
	private WebElement confirmdeletebutton;
	public WebElement getconfirmDelete()
	{
		return   confirmdeletebutton;
	}
	//modify customer
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement emodifyCstm;
	public WebElement getmodifycust()
	{
		return   emodifyCstm;
	}
	//close button on customer modify
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")
	private WebElement closeButn;
	public WebElement getclosebtn()
	{
		return   closeButn;
	}
	//click button for project
	@FindBy(xpath="/html/body/div[12]/div[2]")
	private WebElement projectbtn;
	public WebElement getprjtbtn()
	{
		return   projectbtn;
	}
	// enter the value for project name
	private WebElement projectPopup_projectNameField;
	public WebElement EnterNameForProject()
	{
		return projectPopup_projectNameField;
	}
	//save project name
	@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div/span")
	private WebElement saveproject;
	public WebElement saveProject()
	{
		return saveproject;
	}
	//edit button for project
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement editproject;
	public WebElement editProject()
	{
		return editproject;
	}
	//action button for project
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")
	private WebElement actionproject;
	public WebElement actionProject()
	{
		return actionproject;
	}
	//delete button on project
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement deletproject;
	public WebElement deleteProject()
	{
		return deletproject;
	}
	//confirm delete project button
	@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")
	private WebElement confirmDelete;
	public WebElement confirmdeleteProject()
	{
		return confirmDelete;
	}
	//modify project name
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement modifyProject;
	public WebElement getModifyProject()
	{
		return modifyProject;
	}
	//create add task 
     @FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")	
     private WebElement createTask;
 	public WebElement getAddTask()
 	{
 		return createTask;
 	}
 	//create new task
 	//@FindBy(xpath="//*[@id=\'ext-gen371\']/div[11]/div[1]")
 	@FindBy(xpath="/html/body/div[11]/div[1]")
 	  private WebElement newTask;
 	 	public WebElement getnewTask()
 	 	{
 	 		return newTask;
 	 	}
 	 	//enter task name
 	 	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
 	 	 private WebElement taskName;
 	 	public WebElement getTN()
 	 	{
 	 		return taskName;
 	 	}
 	 	//save task
 	 	@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']/div/span")
 	 	 private WebElement saveTask;
 	 	public WebElement getST()
 	 	{
 	 		return saveTask;
 	 	}
 	 	//delete task on clic
 	 	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[1]/div/div")
 	 	 private WebElement click;
 	 	public WebElement getclick()
 	 	{
 	 		return click;
 	 	}
 	 	//delete button for task
 	 	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[3]/div/div/div[4]/span")
 	 	 private WebElement clickdelete;
 	 	public WebElement getclickdelete()
 	 	{
 	 		return clickdelete;
 	 	}
 	 	//confirm task delete
 	 	@FindBy(xpath="//*[@id=\'deleteTaskPopup_deleteConfirm_submitTitle\']")
 	 	private WebElement confrmdelt;
 	 	public WebElement getcnfrm()
 	 	{
 	 		return confrmdelt;
 	 	}
 	 	//modify task
 	 // click on task
 	 @FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]")
 	//*[@id="taskListBlock"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]
 	 	private WebElement clikonTask;
 	 	public WebElement getmoditask()
 	 	{
 	 		return clikonTask;
 	 	}
 	 	//modify task text
 	 	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[1]/textarea")
 	 	private WebElement entertxt;
 	 	public WebElement getTaskText()
 	 	{
 	 		return entertxt;
 	 	}


}

	
	


