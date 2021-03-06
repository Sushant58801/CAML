package Utility;

import org.openqa.selenium.By;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import WebBase.Controller;
import Identifier.LoginIdentifier;

public class Helper {

	int i = 1;

	LoginIdentifier testID = new LoginIdentifier();

	public String randomEmailGenerator() {
//Method with generate random Numbers.
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(10000000);
		String emailID = "testUser" + randomInt + "@gmail.com";
		return emailID;

	}

	public String randomUsernameGenerator() {
//Method will generate random user name
		String randomInt = RandomStringUtils.random(5, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		String UserName = "username" + randomInt;
		return UserName;

	}

	public boolean isElementPresent(WebElement element) {
		//Method will check is elemenet present or not.
		try {
			element.isDisplayed();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public void Login(String username, String password) {
		//Login credentials
		testID.txt_SGusername.sendKeys(username);
		testID.txt_SGpassword.sendKeys(password);

	}

	public String randomSGIDGenerator() {
		//Method to create random SGID.
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(10000000);
		String randomString = RandomStringUtils.random(1, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		String SGID = randomString + randomInt;
		return SGID;
	}

	public void Dropdown(String Locator) {
		//Function to retrieve value from drop-down list.
		List<WebElement> selectoption = Controller.driver.findElements(By.xpath("" + Locator + ""));
		Random random = new Random();
		int index = random.nextInt(selectoption.size());
		if (index == 0) {
			index = index + 1;
		}
		selectoption.get(index).click();

	}

	public void getscreenshots() throws IOException {
		//Code used to capture screenshots.
		File scfile = ((TakesScreenshot) Controller.driver).getScreenshotAs(OutputType.FILE);
		String filename = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File DestFile = new File("C:\\dexter\\CAMAL\\Screenshots\\" + filename + "Test" + i++ + ".png");
		FileUtils.copyFile(scfile, DestFile);
	}

}
