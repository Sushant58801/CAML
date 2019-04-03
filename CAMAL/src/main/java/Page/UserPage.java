package Page;

import java.io.IOException;

import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Identifier.UserIdentifier;
import Utility.AppstringsConstant;
import Utility.Helper;
import WebBase.BasePage;
import WebBase.BaseTest;

public class UserPage extends BasePage {

	UserIdentifier UserId = new UserIdentifier();
	Helper help = new Helper();
	String Username = help.randomUsernameGenerator();
	String EditedUsername = help.randomUsernameGenerator();
	String SGId = help.randomSGIDGenerator();
	BaseTest baseT = new BaseTest();
	String EditSGId = help.randomSGIDGenerator();
	String className = "";
	public ExtentTest logger;

	public void Createuser() throws InterruptedException, IOException {
		//Function is used to create new SG user.
		className = this.getClass().getName();
		createDirectory("CAMAL"+className);
		logger = baseT.extent.startTest("User Test");
		UserId.usertab.click();
		UserId.adduser.click();
		Thread.sleep(2000);
		UserId.userfirstlastname.click();
		UserId.userfirstlastname.sendKeys(Username);
		UserId.userSGID.sendKeys(SGId);
		UserId.userrole.click();
		help.Dropdown(AppstringsConstant.USERROLEDROPDOWN);
		UserId.useraddbtn.click();
		Thread.sleep(5000);		
		UserId.usersearch.sendKeys(Username);
		Thread.sleep(3000);
		//Verified success message of new user creation.
		if (AppstringsConstant.CREATEUSERMSG.equals(UserId.usersuccessmsg.getText()) == true) {
			logger.log(LogStatus.PASS,
					"1:  Create user " + "<br/>" + "2 : Creation of new user. " + "<br/>"
							+ "<b>Result: New user is created successfully <b>"
							+ logger.addScreenCapture(captureScreenShot(driver, "Create new user")));
		} else {
			logger.log(LogStatus.FAIL, "Success message is not displayed.");
		}
	}

	public void Editeuser() throws InterruptedException, IOException {
		//function is used to modify the existing user.
		UserId.useredit.click();
		Thread.sleep(3000);
		UserId.userfirstlastname.clear();
		UserId.userfirstlastname.sendKeys(EditedUsername);
		UserId.userSGID.sendKeys(EditSGId);
		UserId.userrole.click();
		help.Dropdown(AppstringsConstant.USERROLEDROPDOWN);
		UserId.useraddbtn.click();
		Thread.sleep(5000);
		//verified edit user success message.
		if (AppstringsConstant.EDITUSERMSG.equals(UserId.usersuccessmsg.getText()) == true) {
			logger.log(LogStatus.PASS,
					"1:  Edit user " + "<br/>" + "2 : Modification  of user. " + "<br/>"
							+ "<b>Result: Modification of  user is done successfully <b>"
							+ logger.addScreenCapture(captureScreenShot(driver, "Modify user")));
		} else {
			logger.log(LogStatus.FAIL, "Success message is not displayed.");
		}
	}

}
