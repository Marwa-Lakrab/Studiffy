package com.e2etests.automation.page_objects;


import org.junit.After;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AuthentificationStudiffyPage {

	private ConfigFileReader configfilereader;
	
	@FindBy(how = How.ID, using = "sign-in-email-input")
	public static WebElement email;
	
	@FindBy(how = How.ID, using = "sign-in-password-input")
	public static WebElement password;
	
	@FindBy(how = How.ID, using = "sign-in-button")
	public static WebElement seconnecterbtn;
	
	public AuthentificationStudiffyPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configfilereader = new ConfigFileReader();
		
	}
	
	public void fillEmail(String Email) {
		email.sendKeys(Email);
	}
	
	public void fillPassword(String Password) {
		password.sendKeys(Password);
	}
	
	public void clickBtnSeConnecter() {
		seconnecterbtn.click();
	}
	
//	public void checkURLChanged() {
//		String actualURL = Setup.getDriver().getCurrentUrl();
//		System.out.println("title of the page is : "+actualURL);
//		String url = configfilereader.getProperties("Studiffy.url");
//				if (actualURL.equalsIgnoreCase(url) ) {
//					System.out.println("url is not changed "+actualURL);
//				}
//				else {
//					System.out.println("url is changed"+url);
//				}
//	}
//	@After
//	public void refreshPage() {
//		Setup.getDriver().navigate().refresh();
//		System.out.println("Rafraîchissement de la page après le test");
//	}
}
