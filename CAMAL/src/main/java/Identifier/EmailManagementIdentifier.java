package Identifier;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import WebBase.BasePage;

public class EmailManagementIdentifier extends BasePage {

	/* This class content all the locators from Email manage tab */ 
	//so test case are in test package

	//uytutuy
	@FindBy(xpath = "//*[@id=\"navigation\"]/ul/li[3]/a/span")
	public WebElement EmailTab;

	@FindBy(id = "btn_add")
	public WebElement EmailAdd;

	@FindBy(id = "supplier_type")
	public WebElement Email_supplierType;

	@FindBy(id = "mail_address")
	public WebElement Email_mailaddress;

	@FindBy(id = "btn-save")
	public WebElement EmailsaveButton;

	@FindBy(id = "btn_reset")
	public WebElement EmailResetButton;

	@FindBy(xpath = "//*[@id=\"rejection_mail_copy_filter\"]/label/input")
	public WebElement EmailSearch;

	@FindBy(xpath = "//*[@id=\"rejection_mail_copy\"]/tbody/tr[1]/td[3]/button")
	public WebElement EmaileditID;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/strong")
	public WebElement Emailsuccessmessage;

	@FindBy(xpath = "//*[@id=\"rejection_mail_copy\"]/tbody/tr[1]/td[1]")
	public WebElement Tbl_supplieremailtype;

	@FindBy(xpath = "//*[@id=\"rejection_mail_copy\"]/tbody/tr[1]/td[2]")
	public WebElement Tbl_supplieraddressmail;

	@FindBy(id = "mail_sender")
	public WebElement EmailSenderID;

	@FindBy(id = "mail_objet")
	public WebElement Emailobject;

	@FindBy(xpath = "//*[@id=\"inforamtion_mail\"]/div/div[2]/div[3]/div/div[3]/div[2]")
	public WebElement Emailbody;

	@FindBy(id = "inforamtion_mail_submit")
	public WebElement EmailSubmitbtn;

	@FindBy(xpath = "//*[@id=\"topnav\"]/div[1]/div/div[2]/ul/li[2]/a")
	public WebElement PageTopusername;

	@FindBy(xpath = "//*[@id=\"topnav\"]/div[1]/div/div[2]/ul/li[2]/div/a")
	public WebElement logoutbutton;

	@FindBy(id = "title")
	public WebElement logoutpage;

	
}
