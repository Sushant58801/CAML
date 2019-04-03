package Identifier;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import WebBase.BasePage;

public class LoginIdentifier extends BasePage {
	
	/* This class content all the locators from Login and supplier module */

	@FindBy(id = "buttonConnect")
	public WebElement Connectbutton;

	@FindBy(xpath = "/html/body/header/div[2]/div/div/ul/li[1]/a/span")
	public WebElement Suppliertab;
	
	@FindBy(id = "entity")
	public WebElement entity;

	@FindBy(id = "btn_add")
	public WebElement newsupplier;

	@FindBy(id = "mail_address")
	public WebElement MailAddress;

	@FindBy(id = "supplier_code")
	public WebElement SupplierCode;

	@FindBy(id = "supplier_type")
	public WebElement Suppliertype;

	@FindBy(name = "multi_mail")
	public WebElement RejectMailAddress;

	@FindBy(xpath = "(//input[@name='multi_mail'])[2]")
	public WebElement SGDBFSuppliertype;

	@FindBy(id = "supplier_comment")
	public WebElement suppliercomment;

	@FindBy(id = "mandatory_valid")
	public WebElement mandatoryvalid;

	@FindBy(id = "btn-save")
	public WebElement buttonSave;
	
	@FindBy(id = "btn-no")
	public  WebElement buttonNo;

	

	@FindBy(id = "btn-yes")
	public WebElement buttonYes;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/strong")
	public WebElement SupplierSuccessMsg;

	@FindBy(xpath = "//*[@id=\"supplier_data\"]/tbody/tr/td[1]")
	public  WebElement Tbl_supplierMail;
	
	@FindBy(xpath = "//*[@id=\"supplier_data\"]/tbody/tr/td[2]")
	public WebElement Tbl_suppliecode;
	
	@FindBy(xpath = "//*[@id=\"supplier_data\"]/tbody/tr/td[3]")
	public WebElement Tbl_supplieType;
	
	@FindBy(xpath = "//*[@id=\"supplier_data\"]/tbody/tr/td[4]")
	public WebElement Tbl_supplierejectMail;
	
	@FindBy(xpath = "//*[@id=\"supplier_data\"]/tbody/tr/td[5]")
	public WebElement Tbl_supplieSGDBFMail;
	
	@FindBy(xpath = "//*[@id=\"supplier_data\"]/tbody/tr/td[6]")
	public WebElement Tbl_supplieObservation;
	
	@FindBy(xpath = "//*[@id=\"supplier_data\"]/tbody/tr/td[7]")
	public WebElement Tbl_mandtoryValidation;
	
	@FindBy(xpath = "//*[@id=\"supplier_data\"]/tbody/tr/td[8]")
	public WebElement Tbl_supplieEntity;
	
	@FindBy(xpath = "//*[@id=\"supplier_data\"]/tbody/tr/td[9]/button[1]")
	public WebElement btn_supplieEdit;
	
	@FindBy(id = "delete_supplier")
	public WebElement btn_supplieDelete;
	
	@FindBy(xpath = "//*[@id=\"supplier_data\"]/tbody/tr/td[9]/button[3]")
	public WebElement btn_supplieMail;
	
	@FindBy(css = "input[type=\"search\"]")
	public WebElement searchField;
	
	@FindBy(xpath = "//*[@id=\"supplier_data\"]/tbody/tr/td[9]/button[4]")
	public WebElement btn_suppliePDF;
	
	@FindBy(xpath= "//*[@id=\"logs_data_filter\"]/label/input")
	public WebElement logsearch;
		
	@FindBy(xpath= "//*[@id=\"navigation\"]/ul/li[4]/a")
	public WebElement histort_Tab;
	
	@FindBy(xpath= "//*[@id=\"logs_data\"]/tbody/tr[1]/td[1]")
	public WebElement Tbl_SGID;
	
	@FindBy(xpath= "//*[@id=\"logs_data\"]/tbody/tr[1]/td[2]")
	public WebElement Tbl_Date;
	
	@FindBy(xpath= "//*[@id=\"logs_data\"]/tbody/tr[1]/td[3]")
	public WebElement Tbl_action;
	
	@FindBy(xpath= "//*[@id=\"logs_data\"]/tbody/tr[1]/td[4]")
	public WebElement Tbl_mailOfSupplier;
	
	@FindBy(id="buttonConnect")
	public WebElement btn_ssoConnection;
	
	@FindBy(xpath ="//*[@id=\"links\"]/a")
	public WebElement loginpagelink;
	
	@FindBy(xpath ="//*[@id=\"error\"]/span")
	public WebElement errormsg;
	
	@FindBy(xpath ="//*[@id=\"formAutoLogin\"]/a")
	public WebElement useanotherloginlink;	
	
	@FindBy(id = "btn-reset")
	static WebElement buttonreset;
	
	@FindBy(id="password")
	public WebElement txt_SGpassword;
	
	@FindBy(id="username")
	public WebElement txt_SGusername;
	
	@FindBy(id = "supplier_pdf")
	public WebElement supplierPDF;
	
	
	


	

	
	
	


	public void setTbl_supplieType(WebElement tbl_supplieType) {
		Tbl_supplieType = tbl_supplieType;
	}

	public WebElement getTbl_supplierejectMail() {
		return Tbl_supplierejectMail;
	}

	public void setTbl_supplierejectMail(WebElement tbl_supplierejectMail) {
		Tbl_supplierejectMail = tbl_supplierejectMail;
	}

	public WebElement getTbl_supplieSGDBFMail() {
		return Tbl_supplieSGDBFMail;
	}

	public void setTbl_supplieSGDBFMail(WebElement tbl_supplieSGDBFMail) {
		Tbl_supplieSGDBFMail = tbl_supplieSGDBFMail;
	}

	public WebElement getTbl_supplieObservation() {
		return Tbl_supplieObservation;
	}

	public void setTbl_supplieObservation(WebElement tbl_supplieObservation) {
		Tbl_supplieObservation = tbl_supplieObservation;
	}

	public WebElement getTbl_mandtoryValidation() {
		return Tbl_mandtoryValidation;
	}

	public void setTbl_mandtoryValidation(WebElement tbl_mandtoryValidation) {
		Tbl_mandtoryValidation = tbl_mandtoryValidation;
	}

	public WebElement getTbl_supplieEntity() {
		return Tbl_supplieEntity;
	}

	public void setTbl_supplieEntity(WebElement tbl_supplieEntity) {
		Tbl_supplieEntity = tbl_supplieEntity;
	}

	
}
