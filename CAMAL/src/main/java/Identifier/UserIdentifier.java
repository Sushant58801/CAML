package Identifier;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import WebBase.BasePage;

public class UserIdentifier extends BasePage {
	
	/* This class content all the locators from User module*/

	@FindBy(xpath = "//*[@id=\"navigation\"]/ul/li[2]/a/span")
	public WebElement usertab;

	@FindBy(id = "btn_add")
	public WebElement adduser;

	@FindBy(xpath = "//*[@id=\"users_filter\"]/label/input")
	public WebElement usersearch;

	@FindBy(id = "usr_name")
	public WebElement userfirstlastname;

	@FindBy(id = "usr_sgid")
	public WebElement userSGID;

	@FindBy(id = "usr_role")
	public WebElement userrole;

	@FindBy(id = "btn-save")
	public WebElement useraddbtn;

	@FindBy(id = "add_reset")
	public WebElement userResetbtn;

	@FindBy(xpath = "//*[@id=\"users\"]/tbody/tr[1]/td[4]/button")
	public WebElement useredit;

	@FindBy(xpath = "//*[@id=\"users\"]/tbody/tr[1]/td[1]")
	public WebElement tbl_username;

	@FindBy(xpath = "//*[@id=\"users\"]/tbody/tr[1]/td[2]")
	public WebElement tbl_userSGID;

	@FindBy(xpath = "//*[@id=\"users\"]/tbody/tr[1]/td[3]")
	public WebElement tbl_userRole;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/strong")
	public WebElement usersuccessmsg;

}
