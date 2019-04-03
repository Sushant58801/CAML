package Page;

import java.io.IOException;

import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Identifier.EmailManagementIdentifier;
import Utility.AppstringsConstant;
import Utility.Helper;
import WebBase.BasePage;
import WebBase.BaseTest;

public class EmailPage extends BasePage {

	EmailManagementIdentifier email = new EmailManagementIdentifier();
	Helper help = new Helper();
	String supEmail = help.randomEmailGenerator();
	String Editemail = help.randomEmailGenerator();
	String userSGID = help.randomSGIDGenerator();
	String usermail = help.randomEmailGenerator();
	BaseTest baseT = new BaseTest();
	String className = "";
	public ExtentTest logger;

	public void CreatesupplieremailID() throws InterruptedException, IOException {
		// Function will Create new supplier email ID
		className = this.getClass().getName();
		createDirectory("CAMAL" + className);
		logger = baseT.extent.startTest("Mail Test");
		email.EmailTab.click();
		Thread.sleep(5000);
		email.EmailAdd.click();
		Thread.sleep(2000);
		email.Email_supplierType.click();
		help.Dropdown(AppstringsConstant.SUPPLIEREMAILCREATION);
		email.Email_mailaddress.sendKeys(supEmail);
		email.EmailsaveButton.click();
		Thread.sleep(2000);
		// To check success message of new supplier mail creation
		if (AppstringsConstant.MAILCREATIONSUCCESS.equals(email.Emailsuccessmessage.getText()) == true) {
			logger.log(LogStatus.PASS,
					"1: Create new supplier Mail " + "<br/>" + "2 : Creation of new supplier email. " + "<br/>"
							+ "<b>Result: New mail created  successfully <b>"
							+ logger.addScreenCapture(captureScreenShot(driver, "Create new mail")));
		} else {
			logger.log(LogStatus.FAIL, "Success message is not displayed.");
		}
		// Search the newly created email id
		email.EmailSearch.sendKeys(supEmail);
		Thread.sleep(2000);

	}

	public void EditsupplieremailID() throws InterruptedException, IOException {
		// Function used to modify the supplier email
		email.EmaileditID.click();
		Thread.sleep(2000);
		email.Email_supplierType.click();
		help.Dropdown(AppstringsConstant.SUPPLIEREMAILCREATION);
		email.Email_mailaddress.clear();
		email.Email_mailaddress.sendKeys(Editemail);
		email.EmailsaveButton.click();
		Thread.sleep(2000);
		// Check success message of the supplier email modification.
		if (AppstringsConstant.MAILEDITSUCCESS.equals(email.Emailsuccessmessage.getText()) == true) {
			logger.log(LogStatus.PASS,
					"1: edit supplier Mail " + "<br/>" + "2 : modification of  supplier email. " + "<br/>"
							+ "<b>Result: modification of  mail done  successfully <b>"
							+ logger.addScreenCapture(captureScreenShot(driver, "edit mail")));
		} else {
			logger.log(LogStatus.FAIL, "Success message is not displayed.");
		}

	}

	public void LogOutfromApp() throws InterruptedException, IOException {
		// Logout from the application
		email.PageTopusername.click();
		email.logoutbutton.click();
		Thread.sleep(3000);
		// Verify logout successfully
		if (AppstringsConstant.LOGOUTPAGEHEADER.equals(email.logoutpage.getText()) == true) {
			logger.log(LogStatus.PASS,
					"1: Logout from app " + "<br/>" + "2 : Log out . " + "<br/>"
							+ "<b>Result: Logout successfully from the app <b>"
							+ logger.addScreenCapture(captureScreenShot(driver, "LogOut App")));
		} else {
			logger.log(LogStatus.FAIL, "App is not logout.");
		}
	}

}
