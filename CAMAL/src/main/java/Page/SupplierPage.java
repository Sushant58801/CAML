package Page;

import java.io.IOException;

import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Identifier.LoginIdentifier;
import Utility.AppstringsConstant;
import Utility.ExcelImport;
import Utility.Helper;
import WebBase.BasePage;
import WebBase.BaseTest;

public class SupplierPage extends BasePage {

	LoginIdentifier testID = new LoginIdentifier();
	Helper help = new Helper();
	String supEmail = help.randomEmailGenerator();
	String Editemail = help.randomEmailGenerator();
	BaseTest baseT = new BaseTest();
	String pathwhileCreate = System.getProperty("user.dir") + "\\Files\\Abc.pdf";
	String pathwhileEdit = System.getProperty("user.dir") + "\\Files\\ABCDE.pdf";
	String className = "";
	public ExtentTest logger;

	// Supplier creation
	public void CreateSupplier() throws InterruptedException, IOException {
		className = this.getClass().getName();
		createDirectory("CAMAL" + className);
		logger = baseT.extent.startTest("Supplier Test");
		testID.Suppliertab.click();
		testID.newsupplier.click();
		Thread.sleep(5000);
		testID.MailAddress.sendKeys(supEmail);
		Thread.sleep(2000);
		testID.Suppliertype.click();
		help.Dropdown(AppstringsConstant.SUPPLIERTYPELIST);
		testID.RejectMailAddress.sendKeys(supEmail);
		testID.SGDBFSuppliertype.sendKeys(supEmail);
		testID.suppliercomment.sendKeys(AppstringsConstant.SUPPLIEREXPECTEDOBSERVATION);
		testID.mandatoryvalid.click();
		help.Dropdown(AppstringsConstant.SUPPLIERVALIDATIONMANDATORYLIST);
		testID.entity.click();
		help.Dropdown(AppstringsConstant.SUPPLIERENTITYLIST);
		testID.supplierPDF.sendKeys(pathwhileCreate);
		testID.buttonSave.click();
		Thread.sleep(5000);
		testID.searchField.sendKeys(supEmail);
		Thread.sleep(5000);

		try {
			Assert.assertEquals(testID.Tbl_supplierMail.getText(), supEmail, "Strings are not matching");
			Assert.assertEquals(testID.getTbl_supplierejectMail().getText(), supEmail, "Strings are not matching");
			Assert.assertEquals(testID.getTbl_supplieSGDBFMail().getText(), supEmail, "Strings are not matching");
			Assert.assertEquals(testID.getTbl_supplieObservation().getText(),
					AppstringsConstant.SUPPLIEREXPECTEDOBSERVATION, "Strings are not matching");
		} catch (Error e) {
			logger.log(LogStatus.FAIL, "Assert Fail : Creating new supplier  fail");
		}
		// Supplier creation success message verified.
		if (testID.SupplierSuccessMsg.getText().equals(AppstringsConstant.SUPPLIERCREATIONMSG) == true) {
			// log.info("verify home page");
			logger.log(LogStatus.PASS,
					"1: Create New Supplier " + "<br/>" + "2 : Verify all fields are present " + "<br/>"
							+ "<b>Result: Supplier creation success message is displayed <b>"
							+ logger.addScreenCapture(captureScreenShot(driver, "verify Suppier create successfully")));
		} else {
			logger.log(LogStatus.FAIL, "Creating new supplier  fail" + "<br/>"
					+ logger.addScreenCapture(captureScreenShot(driver, "Suppier creation fail")));
		}
	}

	// Function to check Log for created supplier
	public void CheckLOGforcreation() throws InterruptedException, IOException {
		testID.histort_Tab.click();
		testID.logsearch.sendKeys(supEmail);
		Thread.sleep(2000);
		try {
			Assert.assertEquals(testID.Tbl_mailOfSupplier.getText(), supEmail);
			Assert.assertEquals(testID.Tbl_mailOfSupplier.getText(), supEmail, "Strings are not matching");
			Assert.assertEquals(testID.Tbl_action.getText(), AppstringsConstant.CREATIONLOG,
					"Strings are not matching");
			Assert.assertEquals(testID.Tbl_SGID.getText(), AppstringsConstant.USERSGIDLOG,
					"Strings are not matching");
		} catch (Error e) {
			logger.log(LogStatus.FAIL, "Assert Fail :Log for creation of new supplier is not displayed");
		}
		// Creation log is verified below
		if (testID.Tbl_action.getText().equals(AppstringsConstant.CREATIONLOG) == true) {
			logger.log(LogStatus.PASS,
					"1: Log for Newly created  Supplier " + "<br/>" + "2 : Verify all fields on Log screen are present "
							+ "<br/>" + "<b>Result: Log for creation of new supplier is displayed <b>"
							+ logger.addScreenCapture(captureScreenShot(driver, "Suppier creation Log ")));
		} else {
			logger.log(LogStatus.FAIL, "Log for creation of new supplier is not displayed");
		}

	}

	public void EditnewSupplier() throws InterruptedException, IOException {
		// Modification of supplier written below
		testID.Suppliertab.click();
		Thread.sleep(2000);
		testID.searchField.sendKeys(supEmail);
		Thread.sleep(2000);
		testID.btn_supplieEdit.click();
		Thread.sleep(2000);
		testID.MailAddress.click();
		testID.MailAddress.clear();
		testID.MailAddress.sendKeys(Editemail);
		Thread.sleep(2000);
		help.Dropdown(AppstringsConstant.SUPPLIERTYPELIST);
		testID.RejectMailAddress.clear();
		testID.RejectMailAddress.sendKeys(Editemail);
		testID.SGDBFSuppliertype.clear();
		testID.SGDBFSuppliertype.sendKeys(Editemail);
		help.Dropdown(AppstringsConstant.SUPPLIERVALIDATIONMANDATORYLIST);
		help.Dropdown(AppstringsConstant.SUPPLIERENTITYLIST);
		testID.supplierPDF.sendKeys(pathwhileEdit);
		testID.buttonSave.click();
		Thread.sleep(3000);
		// Success message of edit mail is verified.
		if (testID.SupplierSuccessMsg.getText().equals(AppstringsConstant.SUPPLIERUPDATIONMSG) == true) {
			logger.log(LogStatus.PASS,
					"1: Edit New Supplier " + "<br/>" + "2 : Verify all fields are present " + "<br/>"
							+ "<b>Result: Supplier Modification  success message is displayed <b>"
							+ logger.addScreenCapture(captureScreenShot(driver, "verify Suppier modification")));
		} else {
			logger.log(LogStatus.FAIL, "Modification of  new supplier  fail");
		}
	}

	public void CheckLOGformodification() throws InterruptedException, IOException {
		// Log check for modification of supplier.
		testID.histort_Tab.click();
		testID.logsearch.sendKeys(Editemail);
		Thread.sleep(2000);
		try {
			Assert.assertEquals(testID.Tbl_mailOfSupplier.getText(), Editemail, "Strings are not matching");
			Assert.assertEquals(testID.Tbl_action.getText(), AppstringsConstant.MODIFICATIONLOG,
					"Strings are not matching");
			Assert.assertEquals(testID.Tbl_SGID.getText(), AppstringsConstant.USERSGIDLOG,
					"Strings are not matching");
		} catch (Error e) {
			logger.log(LogStatus.FAIL, "Log for modification of  supplier is not displayed");
		}
		if (testID.Tbl_action.getText().equals(AppstringsConstant.MODIFICATIONLOG) == true) {
			logger.log(LogStatus.PASS,
					"1: Log for modification of   Supplier " + "<br/>"
							+ "2 : Verify all fields on Log screen are present " + "<br/>"
							+ "<b>Result: Log for modification  of supplier is displayed <b>"
							+ logger.addScreenCapture(captureScreenShot(driver, "Modification LOG")));
		} else {
			logger.log(LogStatus.FAIL, "Log for modification of  supplier is not displayed");
		}
	}

	public void SendMailToSupplier() throws InterruptedException, IOException {
		// Sending mail to suppliers
		testID.Suppliertab.click();
		testID.searchField.sendKeys(Editemail);
		Thread.sleep(3000);
		testID.btn_supplieMail.click();
		Thread.sleep(3000);
		testID.buttonYes.click();
		Thread.sleep(5000);
		// mail send success message
		if (testID.SupplierSuccessMsg.getText().equals(AppstringsConstant.SUPPLIERMAILSENDMSG) == true) {
			logger.log(LogStatus.PASS,
					"1: Send Email to  Supplier " + "<br/>"
							+ "<b>Result: Email send message to supplier is displayed <b>"
							+ logger.addScreenCapture(captureScreenShot(driver, "Send Email")));
		} else {
			logger.log(LogStatus.FAIL, "email send message  to supplier is missing");
		}
	}

	public void DeleteSupplier() throws InterruptedException, IOException {
		// Delete supplier
		testID.searchField.sendKeys(Editemail);
		Thread.sleep(5000);
		testID.btn_supplieDelete.click();
		Basepagedriver.switchTo().alert().accept();
		Thread.sleep(5000);
		// Success message of delete supplier verified below
		if (testID.SupplierSuccessMsg.getText().equals(AppstringsConstant.SUPPLIERDELETEMSG) == true) {
			logger.log(LogStatus.PASS,
					"1: Delete Supplier " + "<br/>" + "<b>Result: Supplier deleted message is displayed <b>"
							+ logger.addScreenCapture(captureScreenShot(driver, "Delete supplier")));
		} else {
			logger.log(LogStatus.FAIL, "Supplier deleted message is not displayed ");
		}
	}

	public void CheckLOGfordelete() throws Exception {
		// Log checks for delete supplier
		testID.histort_Tab.click();
		testID.logsearch.sendKeys(Editemail);
		Thread.sleep(2000);
		try {
			Assert.assertEquals(testID.Tbl_mailOfSupplier.getText(), Editemail, "Strings are not matching");
			Assert.assertEquals(testID.Tbl_action.getText(), AppstringsConstant.DELETIONLOG,
					"Strings are not matching");
			Assert.assertEquals(testID.Tbl_SGID.getText(), ExcelImport.getCellData(1, 0),
					"Strings are not matching");
		} catch (Error e) {
			logger.log(LogStatus.FAIL, "Assert Fail : Log for deletion of supplier ");
		}
		// Log verified for the delete supplier
		if (testID.Tbl_action.getText().equals(AppstringsConstant.DELETIONLOG) == true) {
			System.out.println("Pass");
			logger.log(LogStatus.PASS,
					"1: Log for deleteion of   Supplier " + "<br/>" + "2 : Verify all fields on Log screen are present "
							+ "<br/>" + "<b>Result: Log for deletion of supplier is displayed <b>"
							+ logger.addScreenCapture(captureScreenShot(driver, "Deletion LOG")));
		} else {
			System.out.println("FAIL");
			logger.log(LogStatus.FAIL, "Log for deletion of supplier is not displayed");

		}
	}

}
